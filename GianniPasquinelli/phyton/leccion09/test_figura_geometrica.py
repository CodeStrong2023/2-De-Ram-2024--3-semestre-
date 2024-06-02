from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'azul')
# cuadrado1.alto = -10
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'calculo del area del cuadrado: {cuadrado1.calcular_area()}')


# MRO: Method Resolution Order
print(Cuadrado.mro()) # [<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]

print(cuadrado1) # Ancho: 5, Alto: 5, Color: azul

print('creacion de un rectangulo'.center(50, '-'))
rectangulo2 = Rectangulo(3, 8, 'rojo')
print(rectangulo2.ancho)
print(rectangulo2.alto)
print(f'calculo del area del rectangulo: {rectangulo2.calcular_area()}')
print(rectangulo2) # Ancho: 3, Alto: 8, Color: rojo

# figura1 = FiguraGeometrica() # TypeError: Can't instantiate abstract class FiguraGeometrica with abstract methods calcular_area

