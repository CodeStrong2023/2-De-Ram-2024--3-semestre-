class Persona:
  def __init__(self, nombre, edad):
    self.nombre = nombre
    self.edad = edad
    
  def __add__(self, other):
    return self.nombre + ' ' + other.nombre
  
  def __sub__(self, otro):
    return self.edad - otro.edad
  
  
person1 = Persona('Juan', 28)
person2 = Persona('Karla', 30)

# peron1.__add__(person2) sintaxis equivalente a la siguiente línea de código 

print(person1 + person2) # Juan Karla
print(person1 - person2) # -2
