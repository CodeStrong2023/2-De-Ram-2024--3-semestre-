import psycopg2  # conexión a postgresql


conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='postgres'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'  # placeholder
            entrada = input('Ingrese los numeros de registro a eliminar >')
            valores = (tuple(entrada.split(",")),)
            cursor.execute(sentencia, valores)  # ejecucion de sentencia
            registros_eliminados = cursor.rowcount  # recuperacion de los registros como lista
            print(f'Los registros eliminados son: {registros_eliminados}')
except Exception as e:
    print(f'ocurrió un error: {e}')
finally:
    conexion.close()