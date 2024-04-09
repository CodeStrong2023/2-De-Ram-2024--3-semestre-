from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'verde')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Càlculo del área del cuadrado: {cuadrado1.calcular_area()}')

rectangulo1 = Rectangulo(7, 5, 'azul')
print(rectangulo1.ancho)
print(rectangulo1.alto)
print(f'Cálculo del area del rectangulo: {rectangulo1.calcular_area1()}')

# MRO = Method Resolution Order
print(Cuadrado.mro())

print(cuadrado1)

