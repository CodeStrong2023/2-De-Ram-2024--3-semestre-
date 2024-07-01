# Declarar una variable

try:
    archivo = open('prueba.txt', 'w', encoding = 'utf8')  # w => write
    archivo.write('Programacion con diferentes tipos de archivos: este es txt-\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y programación\n')
    archivo.write('letra r(read)\na(append)\nw(write)\nx(crear archivo)\n')
    archivo.write('letra t(text)\nb(archivos binarios)\nw+ o r+(lee y escribe)\n')
    archivo.write('Saludos\n')
    archivo.write('Finish')
except Exception as e:
    print(e)
finally:
    archivo.close()
