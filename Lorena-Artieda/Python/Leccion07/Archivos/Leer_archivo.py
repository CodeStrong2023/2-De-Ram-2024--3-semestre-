archivo = open('prueba.txt', 'r',encoding='utf8')
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10))#Continuamos desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#Vamos a iterar el archivo, cada uan de las lineas
#for linea in archivo:
    #print(linea) iteramos todos los elementos del archivo
#print(archivo.readlines()[11])#Accedemos al archivo como si fuera una lista
#Anexamos informacion, copiamos a otro
archivo2= open('copia.txt','w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()#Cerramos el primer archivo
archivo2.close()#Cerramos el segundo achivo

print('Se ha terminadado el proceso de leer y copiar archivos')


