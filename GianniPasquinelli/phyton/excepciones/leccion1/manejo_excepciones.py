from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    numero1 = int(input("Proporciona el número 1: "))
    numero2 = int(input("Proporciona el número 2: "))
    
    if numero1 == numero2:
        raise NumerosIgualesException("Números iguales")
    
    resultado = numero1 / numero2
except TypeError as e:
    print(f"Type error - Ocurrió un error: {type(e)}")
    
except ZeroDivisionError as e:
    print(f"Zero division - Ocurrió un error: {type(e)}")
    
except Exception as e:
    print(f"Exception - Ocurrió un error: {type(e)}")
    
else:
    print(f"no hubo ninguna excepción")

finally:
    print("Ejecución del bloque finally")
    
print(f"Resultado: {resultado}")
