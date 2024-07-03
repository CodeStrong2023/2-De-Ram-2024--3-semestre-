# Manejo contexto with: sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt', 'r', encoding='utf8') as archivo:
   # print(archivo.read())
'''
metodos que ejecuta de manera automatica:
__enter__ y __exit__
'''
from ManejoArchivos import ManejoArchivos

with ManejoArchivos('prueba.txt')as archivo:
    print(archivo.read())
