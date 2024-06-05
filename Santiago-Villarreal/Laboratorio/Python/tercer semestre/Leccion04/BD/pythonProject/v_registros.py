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
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'  # placeholder
            entrada = input('Digite los id_persona a buscar >')
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias)  # ejecucion de sentencia
            registros = cursor.fetchall()  # recuperacion de los registros como lista
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'ocurrió un error: {e}')
finally:
    conexion.close()
