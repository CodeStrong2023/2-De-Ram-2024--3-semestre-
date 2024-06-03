from Monitor import Monitor
from Raton import Raton
from Tecaldo import Teclado

class Computadora:
  
  contador_computadoras = 0
  
  def __init__(self, nombre, monitor, teclado, raton):
    Computadora.contador_computadoras += 1
    self._id_computadora = Computadora.contador_computadoras
    self._nombre = nombre
    self._monitor = monitor
    self._teclado = teclado
    self._raton = raton
    
  def __str__(self):
    return f'''
    {self._nombre}: {self._id_computadora}
    Monitor: {self._monitor}
    Teclado: {self._teclado}
    Raton: {self._raton}
    '''
    
if __name__ == '__main__':
  monitor1 = Monitor('HP', 15)
  teclado1 = Teclado('USB', 'HP')
  raton1 = Raton('USB', 'HP')
  computadora1 = Computadora('HP', monitor1, teclado1, raton1)
  print(computadora1)
  
  monitor2 = Monitor('LG', 27)
  teclado2 = Teclado('Bluetooth', 'Dell')
  raton2 = Raton('Bluetooth', 'Dell')
  computadora2 = Computadora('Dell', monitor2, teclado2, raton2)
  print(computadora2)
  
  monitor3 = Monitor('Samsung', 32)
  teclado3 = Teclado('USB', 'Logitech')
  raton3 = Raton('Bluetooth', 'MSI')
  computadora3 = Computadora('Samsung', monitor3, teclado3, raton3)
  print(computadora3)
  
  monitor4 = Monitor('Acer', 24)
  teclado4 = Teclado('Bluetooth', 'MSI')
  raton4 = Raton('USB', 'Acer')
  computadora4 = Computadora('Acer', monitor4, teclado4, raton4)
  print(computadora4)