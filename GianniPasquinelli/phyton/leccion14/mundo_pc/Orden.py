class Orden:
  
  contador_ordenes = 0
  
  def __init__(self, computadoras):
    Orden.contador_ordenes += 1
    self.__id_orden = Orden.contador_ordenes
    self.computadoras = computadoras
    
  def agregar_computadora(self, computadora):
    self.computadoras.append(computadora)
    
  def mostrar_orden(self):
    computadoras_str = ''
    for computadora in self.computadoras:
      computadoras_str += computadora.__str__() + '\n'
    return f'Orden: {self.__id_orden}\nComputadoras:\n{computadoras_str}'
  
  def __str__(self):
    return self.mostrar_orden()