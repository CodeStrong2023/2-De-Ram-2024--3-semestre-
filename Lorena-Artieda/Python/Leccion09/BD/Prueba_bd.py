import psycopg2

try:
    conexion = psycopg2.connect(
        user='postgres',
        password='admin',
        host='localhost',
        port='5432',
        database='postgres'
    )

    cursor = conexion.cursor()
    sentencia = 'SELECT * from persona'
    cursor.execute(sentencia)  # Ejecutamos la sentencia
    registros = cursor.fetchall()  # Recuperamos todos los registros de la base de datos
    print(registros)

except Exception as e:
    print(f'Ocurrió un error: {e}')

finally:
    if conexion:
        cursor.close()
        conexion.close()