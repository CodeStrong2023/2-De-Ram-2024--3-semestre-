class Empleado:
  def __init__(self, nombre, salario):
    self.nombre = nombre
    self.salario = salario
    
  def __str__(self):
    return self.nombre + ' ' + str(self.salario)
  
  def mostrar_detalles(self):
    return self.__str__()