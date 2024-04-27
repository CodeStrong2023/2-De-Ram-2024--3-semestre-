from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    print(objeto)
    print(type(objeto))


empleado1 = Empleado("Juan", 200)
imprimir_detalles(empleado1)

gerente = Gerente("Sistemas", "pedro", 2333)
imprimir_detalles(gerente)