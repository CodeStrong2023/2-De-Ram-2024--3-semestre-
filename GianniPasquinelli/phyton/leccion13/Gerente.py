from Empleado import Empleado

class Gerente(Empleado):
  def __init__(self, nombre, salario, departamento):
    super().__init__(nombre, salario)
    self.departamento = departamento
    
  def __str__(self):
    return super().__str__() + ' ' + self.departamento
  
  def mostrar_detalles(self):
    return self.__str__()