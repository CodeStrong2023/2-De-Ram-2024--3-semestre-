from Orden import Orden
from Producto import Producto

producto1 = Producto('Camisa', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Cinturon', 50.00)
producto4 = Producto('Calcetines', 10.00)
producto5 = Producto('Blusa', 80.00)
producto6 = Producto('Short', 70.00)
productos1 = [producto1, producto2]
productos2 = [producto3, producto4]
orden1 = Orden(productos1)
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto6)
print(orden1)
print(orden1.calcular_total())
orden2 = Orden(productos2)
orden2.agregar_producto(producto1)
orden2.agregar_producto(producto6)
print(orden2)
print(orden2.calcular_total())
