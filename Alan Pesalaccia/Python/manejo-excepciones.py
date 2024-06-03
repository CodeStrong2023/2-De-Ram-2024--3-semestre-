from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer numero >'))
    b = int(input('Digite el segundo número >'))
    if a == b:
        raise NumerosIgualesException('Son números iguales')
    resultado = a/b  # modificacion
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrió un error: {type(e)}')
else:
    print('No se arrojó ninguna excepción')
finally:
    print('Ejecución de este bloque Finally')

print(f'El resultado es: {resultado}')
print('sigue')