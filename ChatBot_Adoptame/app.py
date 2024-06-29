import streamlit as st
from chatbot import ChatBot

chatbot = ChatBot()

st.title("👨🏻‍💻 Asistente virtual Adoptame 🐾")

# Inicializar el estado de la sesión para los mensajes y el primer mensaje
if "messages" not in st.session_state:
    st.session_state.messages = []
if "first_message" not in st.session_state:
    st.session_state.first_message = True

# Muestra histórico de mensajes
for message in st.session_state.messages:
    with st.chat_message(message["role"]):
        st.markdown(message["content"])

# Comprueba si es el primer mensaje
if st.session_state.first_message:
    welcome_message = "Hola, ¿cómo puedo ayudarte?"
    with st.chat_message("assistant"):
        st.markdown(welcome_message)
    st.session_state.messages.append({"role": "assistant", "content": welcome_message})
    st.session_state.first_message = False

# Procesa la entrada del usuario
if prompt := st.chat_input("¿Cómo puedo ayudarte?"):
    with st.chat_message("user"):
        st.markdown(prompt)
    st.session_state.messages.append({"role": "user", "content": prompt})

    # Implementación del algoritmo de IA
    intents = chatbot.predict_class(prompt)
    res = chatbot.get_response(intents)

    with st.chat_message("assistant"):
        st.markdown(res)
    st.session_state.messages.append({"role": "assistant", "content": res})
