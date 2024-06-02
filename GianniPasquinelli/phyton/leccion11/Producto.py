class Producto:
  contador_productos = 0 # Variable de clase
  
  def __init__(self, nombre, precio):
    Producto.contador_productos += 1
    self.__id_producto = Producto.contador_productos
    self.__nombre = nombre
    self.__precio = precio
    
  # getters y setters
  @property
  def nombre(self):
    return self.__nombre
  
  @nombre.setter
  def nombre(self, nombre):
    self.__nombre = nombre
    
  @property
  def precio(self):
    return self.__precio
  
  @precio.setter
  def precio(self, precio):
    self.__precio = precio
    
  # metodo str
  
  def __str__(self):
    return f'Id Producto: {self.__id_producto}, Nombre: {self.__nombre}, Precio: {self.__precio}'
  
  if __name__ == '__main__':
    producto1 = Producto('Camisa', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)