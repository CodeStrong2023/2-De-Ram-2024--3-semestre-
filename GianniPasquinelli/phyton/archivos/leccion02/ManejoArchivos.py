class ManejoArchivos:
  
  def __init__(self, nombre):
    self.nombre = nombre
    
  def __enter__(self):
    print("Obtener el recurso".center(50, '-'))
    self.nombre = open(self.nombre, 'r', encoding='utf8')
    return self.nombre
  
  def __exit__(self, tipo_excepcion, valor_excepcion, traza_error):
    print("Cerrar el recurso".center(50, '-'))
    if self.nombre:
      self.nombre.close()
    if tipo_excepcion:
      print(f"Ocurrió una excepción: {tipo_excepcion}")
      print(f"Valor de la excepción: {valor_excepcion}")
      print(f"Traza de la excepción: {traza_error}")
    return True