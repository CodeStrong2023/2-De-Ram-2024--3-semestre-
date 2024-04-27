
class Persona:
    constador_persona = 0
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        Persona.constador_persona += 1
        self.id_persona = Persona.constador_persona
    def __str__(self):
        return f'Persona: ID: {self.id_persona}, Nombre: {self.nombre}, Edad: {self.edad}'

persona = Persona('Juan', 20)
persona1 = Persona('Jose', 33)
print(persona)
print(persona1)

print(f"Contador de personas: {Persona.constador_persona}")