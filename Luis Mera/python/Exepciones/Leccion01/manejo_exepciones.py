from NumerosIgualesExeption import NumerosIgualesExeption
resultado = None

try:
    a = int(input("Ingrese un numero: "))
    b = int(input("Ingrese un numero: "))
    if a == b:
        raise NumerosIgualesExeption("Los números son iguales!")
    resultado = a/b
except TypeError as e:
    print(f"TypeError - Error: {e}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Error: {e}")
except Exception as e: # Capturamos los errores
    print(f"Ocurrio un error: {e}")
else: # Este bloque se ejectua en caso que no haya lanzado ninguna exepción
    print("No se arrojo ninguna exepción")
finally: # Este bloque se ejectua siempre no importa si lanza una exepción o no
    print("Ejecución de este bloque finally")

print(f"El resultado es: {resultado}")
print("Seguimos...")