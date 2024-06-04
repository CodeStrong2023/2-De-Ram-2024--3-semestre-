archivo = open('prueba.txt', 'w', encoding='utf8')

print(archivo.read())

archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

print('Archivo copiado')
