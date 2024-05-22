from dominio.Peliculas import Peliculas
from servicio.catalogo_peliculas import CatalogoPeliculas as cP

opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1- Agregar pelicula')
        print('2- Listar las peliculas')
        print('3. Eliminar catálogo de peliculas')
        print('4. Salir')
        opcion = int(input('Ingrese una opcion (1-4)> '))
        if opcion == 1:
            nombre_pelicula = input('Inserte el nombre de la pelicula: ')
            pelicula = Peliculas(nombre_pelicula)
            cP.agregar_peliculas(pelicula)
        elif opcion == 2:
            cP.listar_peliculas()
        elif opcion == 3:
            cP.eliminar_peliculas()
    except Exception as e:
        print(f'Ocurrió un error de tipo: {e}')
        opcion = None
    else:
        print('Fin de programa')
