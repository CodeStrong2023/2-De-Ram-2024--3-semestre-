from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Zapatillas', 200.00)
producto4 = Producto('Campera', 175.00)
producto5 = Producto('Medias', 45.00)
producto6 = Producto('Blusa', 75.00)

productos1 = [producto1, producto2]
productos2 = [producto3, producto4]

orden1 = Orden(productos1)
print(orden1)

orden2 = Orden(productos2)
print(orden2)

# Modificar la orden2 ingresando nuevos productos con sus nombre y precios
nuevos_productos = [
    Producto('Gorra', 50.00),
    Producto('Bufanda', 30.00)
]

# Crear una lista de productos y agregarla a la orden2
for producto in nuevos_productos:
    orden2.agregar_producto(producto)

print("Después de agregar nuevos productos:")
print(orden2)
print(f'Total de orden1: {orden1.calcular_total()}')
print(f'Total de orden2: {orden2.calcular_total()}')