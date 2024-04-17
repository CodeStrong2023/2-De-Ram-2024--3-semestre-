from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'calculo del area del cuadrado: {cuadrado1.calcular_area()}')


# MRO: Method Resolution Order
print(Cuadrado.mro()) # [<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]

print(cuadrado1) # Ancho: 5, Alto: 5, Color: azul


rectangulo2 = Rectangulo(3, 8, 'rojo')
print(rectangulo2.ancho)
print(rectangulo2.alto)
print(f'calculo del area del rectangulo: {rectangulo2.calcular_area()}')
print(rectangulo2) # Ancho: 3, Alto: 8, Color: rojo