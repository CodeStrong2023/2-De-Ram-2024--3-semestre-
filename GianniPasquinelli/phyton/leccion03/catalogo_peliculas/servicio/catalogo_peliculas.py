import os

class CatalogoPeliculas:
  
  ruta_archivo = 'peliculas.txt'

  @classmethod
  def agregar_pelicula(pelicula):
    with open(CatalogoPeliculas.ruta_archivo, 'a', encoding='utf8') as archivo:
      archivo.write(f'{pelicula.nombre}\n')

  @classmethod
  def listar_peliculas(cls):
    with open(cls.ruta_archivo, 'r', encoding='utf8') as archivo:
      print('Catálogo de películas'.center(50, '-'))
      print(archivo.read())

  @classmethod
  def eliminar_pelicula(cls):
    os.remove(cls.ruta_archivo)
    print(f'Archivo eliminado: {cls.ruta_archivo}')