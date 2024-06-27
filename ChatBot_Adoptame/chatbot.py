import random
import json
import pickle 
import numpy as np
import nltk
from nltk.stem import WordNetLemmatizer
from keras.models import load_model

class ChatBot:
    ERROR_THRESHOLD = 0.25

    def __init__(self):
        # Descargar los datos de NLTK necesarios
        nltk.download('punkt')
        nltk.download('wordnet')

        self.lemmatizer = WordNetLemmatizer()
        try:
            with open('intents_spanish.json', 'r', encoding='utf-8') as file:
                self.intents = json.load(file)
            self.words = pickle.load(open('words.pkl', 'rb'))
            self.classes = pickle.load(open('classes.pkl', 'rb'))
            self.model = load_model('chatbot_model.h5')
        except Exception as e:
            print(f"Error loading data: {e}")
            raise

    def clean_up_sentence(self, sentence):
        if not isinstance(sentence, str):
            raise ValueError("Input sentence must be a string")
        sentence_words = nltk.word_tokenize(sentence)
        sentence_words = [self.lemmatizer.lemmatize(word.lower()) for word in sentence_words]
        return sentence_words

    def bag_of_words(self, sentence):
        sentence_words = self.clean_up_sentence(sentence)
        bag = [0] * len(self.words)
        for w in sentence_words:
            for i, word in enumerate(self.words):
                if word == w:
                    bag[i] = 1
        return np.array(bag)

    def predict_class(self, sentence):
        bow = self.bag_of_words(sentence)
        res = self.model.predict(np.array([bow]))[0]
        results = [[i, r] for i, r in enumerate(res) if r > self.ERROR_THRESHOLD]
        results.sort(key=lambda x: x[1], reverse=True)
        return_list = []
        for r in results:
            return_list.append({'intent': self.classes[r[0]], 'probability': str(r[1])})
        return return_list

    def get_response(self, intents_list):
        if not intents_list:
            return "No entiendo tu pregunta, ¿puedes reformularla?"
        tag = intents_list[0]['intent']
        list_of_intents = self.intents['intents']
        for i in list_of_intents:
            if i['tag'] == tag:
                return random.choice(i['responses'])
        return "No tengo una respuesta para eso, lo siento."

