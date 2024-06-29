class Persona:
    contador_personas= 0 #Variable de clase

    @classmethod
    def generar_siguiete_valor(cls):
        cls.contador_personas+=1
        return cls.contador_personas

    def __init__(self, nombre, edad):

        self.id_persona= Persona.generar_siguiete_valor()
        self.nombre=nombre
        self.edad=edad

    def __str__(self):
        return f'Persona[id: {self.id_persona}, nombre:  {self.nombre}, edad: {self.edad}]'

persona1= Persona('Lorena', 35)
print(persona1)

Persona.generar_siguiete_valor()
persona2=Persona('Pedro', 26)
print(persona2)