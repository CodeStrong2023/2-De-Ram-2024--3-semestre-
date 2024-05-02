from Cuadrado import Cuadrado

cuadrado1 = Cuadrado(10, "Rojo")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO Method Resolution Ordner
print(Cuadrado.__mro__())
print(cuadrado1)