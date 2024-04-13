from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(3, 'verde')
print(cuadrado1.alto)
print(cuadrado1.ancho)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

# MRO = Method Resolution Order
print(Cuadrado.mro())
print(cuadrado1)


rectangulo1= Rectangulo(2,2,"amarillo")
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(Rectangulo.mro())
print(rectangulo1)