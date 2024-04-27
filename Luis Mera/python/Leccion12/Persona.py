class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f"{self.nombre}  {other.nombre}"

    def __sub__(self, other):
        return self.edad - other.edad

persona1 = Persona('Juna', 22)
persona2 = Persona('Pedro', 22)

print(persona1 + persona2)
print(persona1 - persona2)
