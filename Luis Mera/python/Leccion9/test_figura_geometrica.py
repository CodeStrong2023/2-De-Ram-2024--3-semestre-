from Curadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, "Azul")

print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"El area del cuadrado es {cuadrado1.calcular_area()}")

# Método MRO
# print(Cuadrado.mro())

print(cuadrado1)

rectangulo1 = Rectangulo(3,8, "verde")
print(f"Calculo del area de rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)