class Persona:
    def __str__(self, nombre, edad):
        self.nombre= nombre
        self.edad=edad

    def __add__(self, other):
        return f'{self.nombre}{other.nombre}'

    def __sub__(self, other):
        return self.edad - other.edad 
persona1 = Persona('Lorena', 35)
persona2 = Persona('Juan', 43)

persona1.__add__(persona2)#Sintaxis interna y automatica
print(persona1+' '+persona2)
