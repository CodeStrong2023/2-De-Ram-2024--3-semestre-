import psycopg2

try:
    conexion = psycopg2.connect(
        user='postgres',
        password='admin',
        host='localhost',
        port='5432',
        database='postgres')

    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s'  # Placeholder
            id_persona = input('Digite un numero para el id_persona: ')
            cursor.execute(sentencia, (id_persona,))# Ejecutamos la sentencia
            registros = cursor.fetchone() # Recuperamos todos los registros de la base de datos con fetchall y uno con fetchone
            print(registros)

except Exception as e:
    print(f'Ocurrió un error: {e}')

finally:
    conexion.close()