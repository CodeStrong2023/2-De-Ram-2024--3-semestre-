from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('Creacion de objeto clase Cuadrado'.center(50,'-'))
cuadrado1 = Cuadrado(3, 'verde')
cuadrado1.alto= -10
print(cuadrado1.alto)
print(cuadrado1.ancho)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

# MRO = Method Resolution Order
print(Cuadrado.mro())
print(cuadrado1)

print('Creacion de objeto clase Rectangulo'. center(50,'-'))
rectangulo1= Rectangulo(2,2,"amarillo")
rectangulo1.ancho= 15
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(Rectangulo.mro())
print(rectangulo1)
print(Cuadrado.mro())

#figura1= FiguraGeometrica() No se puede instanciar, es abstracta