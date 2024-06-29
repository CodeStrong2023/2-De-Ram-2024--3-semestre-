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
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'  # placeholder
            valores = ('Juan Carlos', 'Roldan', 'rcarlos@mail.com', 1)
            cursor.execute(sentencia, valores)  # ejecucion de sentencia
            registros_actualizados = cursor.rowcount  # recuperacion de los registros como lista
            print(f'Los registros actualizados son: {registros_actualizados}')
except Exception as e:
    print(f'ocurrió un error: {e}')
finally:
    conexion.close()