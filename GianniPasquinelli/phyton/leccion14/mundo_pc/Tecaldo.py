from Dispositivo_entrada import Dispositivo_entrada

class Teclado(Dispositivo_entrada):
    
    contador_teclados = 0
  
    def __init__(self, tipo_entrada, marca):
      Teclado.contador_teclados += 1
      self._id_teclado = Teclado.contador_teclados
      super().__init__(tipo_entrada, marca)
  
    def __str__(self):
      return f"Id: {self._id_teclado}, Marca: {self._marca}, Tipo de entrada: {self._tipo_entrada}"
    
if __name__ == '__main__':
  teclado1 = Teclado('USB', 'HP')
  print(teclado1)
  teclado2 = Teclado('Bluetooth', 'Dell')
  print(teclado2)
  teclado3 = Teclado('USB', 'Logitech')
  print(teclado3)
  teclado4 = Teclado('Bluetooth', 'MSI')
  print(teclado4)
  teclado5 = Teclado('USB', 'HP')
  print(teclado5)