try:
  archivo = open('prueba.txt', 'w', encoding='utf8')
  archivo.write('Agregando información al archivo\n')
  archivo.write('otra linea agregada\n')
  archivo.write('letra r(read)\na(append)\nw(write)\nx(create)\n')
  archivo.write('letra t(text)\nb(binary)\nw+ o r+ (lectura y escritura)\n')
  archivo.write('finish\n')
  
except Exception as e:
  print(e)
finally:
  archivo.close()