
# Modo de lectura por default
archivo = open("prueba.txt", "r", encoding="utf8") # Las letras son: "r" read, "a" append, "w" write, "x"
# print(archivo.read())
# print(archivo.read(15))
# print(archivo.read(10)) # continuamos desde la linea anterior
# print(archivo.readline()) # Lee una linea del archivo
# print(archivo.readline()) # Lee la siguiente linea del archivo

# iteramos el archivo en cada una de las lineas

# for linea in archivo:
#     # print(linea)

# print(archivo.readlines()) # devuelve una lista con todas las lineas
# print(archivo.readlines()[2]) # devuelve una lista con todas las lineas

# Anexamos informacion

archivo2 = open("copia.txt", "a", encoding="utf8")
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

archivo2 = open("copia.txt", "r", encoding="utf8")
print(archivo2.read())