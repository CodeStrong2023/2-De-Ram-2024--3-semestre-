from Producto import Producto

class Orden:
  contador_ordenes = 0
  
  def __init__(self, productos):
    Orden.contador_ordenes += 1
    self.__productos = list(productos)
    
  def calcular_total(self):
    pass
    
  def agregar_producto(self, producto):
    self.__productos.append(producto)
    
  def calcular_total(self):
    total = 0 # variable local
    for producto in self.__productos:
      total += producto.precio
    return total
  
  def __str__(self):
    productos_str = ''
    for producto in self.__productos:
      productos_str += producto.__str__() + '|'
    return f'Orden: {self.__id_orden}, Productos: {productos_str}'
  
  if __name__ == '__main__':
    producto1 = Producto('Camisa', 100.00)
    producto2 = Producto('Pantalon', 150.00)
    producto3 = Producto('Cinturon', 50.00)
    producto4 = Producto('Calcetines', 10.00)
    producto5 = Producto('Blusa', 80.00)
    producto6 = Producto('Short', 70.00)
    productos1 = [producto1, producto2]
    productos2 = [producto3, producto4, producto5]
    orden1 = Orden(productos1)
    print(orden1)
    producto3 = Producto('Cinturon', 50.00)
    orden1.agregar_producto(producto3)
    print(orden1)
    print(orden1.calcular_total())
    orden2 = Orden(productos2)
    print(orden2) 