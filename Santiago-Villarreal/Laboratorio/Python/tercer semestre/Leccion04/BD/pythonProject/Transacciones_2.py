import psycopg2 as bd  # conexión a postgresql


conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False  # inicio transaccion
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s,%s,%s)'
    valores = ('Jorge', 'Prolaaaaaaaa', 'jprol@mail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan Carlos', 'Perez', 'jcperez@mail.com', 1)
    cursor.execute(sentencia, valores)

    conexion.commit()  # fin transaccion
    print('Termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'ocurrió un error, se hizo un rollback: {e}')
finally:
    conexion.close()
