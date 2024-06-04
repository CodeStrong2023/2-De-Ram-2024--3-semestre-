# manejo contexto with: se encarga de cerrar el archivo, sintaxis simplificada,  abre y cierra el archivo automáticamente
# with open('archivo.txt', 'r', encoding='utf8') as archivo:
# print(archivo.read())

'''
metodos que ejecuta el with automaticamente
__enter__ y __exit__
'''
from ManejoArchivos import ManejoArchivos

with ManejoArchivos('archivo.txt') as archivo:
  print(archivo.read())