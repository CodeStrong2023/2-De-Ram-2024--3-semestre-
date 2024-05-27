
# Crear un archivo
try:
    archivo = open("prueba.txt", "w", encoding="utf-8")
    archivo.write("Programamos con diferentes archivos \n")
    archivo.write("Con esto terminamos \n")
    archivo.write("Incorporamos la lectura de acentos para palabras como información \n")
except Exception as e:
    print(e)
finally:
    archivo.close()


