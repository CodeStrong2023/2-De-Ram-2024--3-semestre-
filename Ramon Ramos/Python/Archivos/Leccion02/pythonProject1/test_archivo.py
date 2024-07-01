archivo = open('C:\\Users\\USUARIO\\clase1\\python\\tercer semestre\\Archivos\\Leccion02\\pythonProject1\\prueba.txt',
               'r', encoding='utf8')  # letra r(read), a(append), w(write), x()
# print(archivo.read())
# print(archivo.read(15))
# print(archivo.read(5))
# print(archivo.readline())

# iteracion de las lineas
# for linea in archivo:
    # print(linea)
# print(archivo.readlines()[6])

# anexar información, copiar a otro
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

print('Se ha terminado el proceso de leer y copiar archivos')