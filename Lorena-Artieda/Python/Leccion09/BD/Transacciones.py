import psycopg2 as bd  # conexión a postgresql


conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='postgres'
)
try:
    # conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s,%s,%s)'
    valores = ('Maria', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit()
    print('Termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'ocurrió un error, se hizo un rollback: {e}')
finally:
    conexion.close()