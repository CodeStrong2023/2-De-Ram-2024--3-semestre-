from dominio.Pelicula import Pelicula
from servicio.CatalogoPeliculas import CatalogoPeliculas as cp

opcion = None

while opcion != 4:
    try:
        print("Opciones")
        print("1 - Agregar película")
        print("2 - Listar las películas")
        print("3 - Eliminar catálogo de películas")
        print("4 - Salir")
        opcion = int(input("Digite una opción del menú: "))
        if opcion == 1:
            nombre_pelicula = input("Digite el nombre de la película: ")
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f"Ocurrio un error de tipo: {e}")
        opcion = None
    else:
        print("Salimos del programa")
