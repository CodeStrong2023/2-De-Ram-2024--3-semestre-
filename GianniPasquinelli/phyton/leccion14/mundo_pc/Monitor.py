class Monitor:
  
  contador_monitores = 0

  def __init__(self, marca, tamaño):
    Monitor.contador_monitores += 1
    self._id_monitor = Monitor.contador_monitores
    self._marca = marca
    self._tamaño = tamaño

  def __str__(self):
    return f'Id: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}'
  
if __name__ == '__main__':
  monitor1 = Monitor('HP', 15)
  print(monitor1)
  monitor2 = Monitor('LG', 27)
  print(monitor2)
  monitor3 = Monitor('Samsung', 32)
  print(monitor3)
  monitor4 = Monitor('Acer', 24)
  print(monitor4)