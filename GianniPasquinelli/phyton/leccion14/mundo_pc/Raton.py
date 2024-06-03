from Dispositivo_entrada import Dispositivo_entrada

class Raton(Dispositivo_entrada):
  
  contador_ratones = 0

  def __init__(self, tipo_entrada, marca):
    Raton.contador_ratones += 1
    self._id_raton = Raton.contador_ratones
    super().__init__(tipo_entrada, marca)

  def __str__(self):
    return f"Id: {self._id_raton}, Marca: {self._marca}, Tipo de entrada: {self._tipo_entrada}"
  
  
# pruebas
if __name__ == '__main__':
  raton1 = Raton('USB', 'HP')
  print(raton1)
  raton2 = Raton('Bluetooth', 'Dell')
  print(raton2)
  raton3 = Raton('USB', 'Logitech')
  print(raton3)
  raton4 = Raton('Bluetooth', 'MSI')
  print(raton4)
  raton5 = Raton('USB', 'HP')
  print(raton5)