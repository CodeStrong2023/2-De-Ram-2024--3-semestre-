from Cuadrado import Cuadrado
from Rectangulo import Rectangulo


print('Creacion del objeto clase Cuadrado'.center(50,'_'))
cuadrado1 = Cuadrado(8, 'verde')
cuadrado1.alto = 7
cuadrado1.ancho = 7
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f'Càlculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO = Method Resolution Order
#print(Cuadrado.mro())

print(cuadrado1)
print('Creación del objeto clase rectangulo'.center(50,'_'))
rectangulo1 = Rectangulo(3, 9, 'azul')
rectangulo1.alto = 8
#print(rectangulo1.ancho)
#print(rectangulo1.alto)
print(f'Cálculo del area del rectangulo: {rectangulo1.calcular_area1()}')
print(rectangulo1)

# Figura1 = FiguraGeométrica()
print(cuadrado1.mro())
