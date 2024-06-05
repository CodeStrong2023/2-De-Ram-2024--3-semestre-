import psycopg2  # conexión a postgresql


conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s'  # placeholder
            id_persona = input('Digite un número para el id_persona >')
            cursor.execute(sentencia, (id_persona,))  # ejecucion de sentencia
            registros = cursor.fetchone()  # recuperacion de los registros como lista
            print(registros)
except Exception as e:
    print(f'ocurrió un error: {e}')
finally:
    conexion.close()
