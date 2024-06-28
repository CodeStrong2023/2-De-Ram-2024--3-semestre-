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
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'  # placeholder
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Canto', 'mcanto@mail.com'),
                ('Marcelo', 'Cuenca', 'cuencaM@mail.com')
            )
            cursor.executemany(sentencia, valores)  # ejecucion de sentencia
            registros_insertados = cursor.rowcount  # recuperacion de los registros como lista
            print(f'Los registros insertados son: {registros_insertados}')
except Exception as e:
    print(f'ocurrió un error: {e}')
finally:
    conexion.close()