from ManejoArchivos import ManejoArchivos

# Conten Manager
# with open("prueba.txt", "r", encoding="utf-8") as archivo:
#     print(archivo.read())

with ManejoArchivos("prueba.txt") as archivo:
    print(archivo.read())