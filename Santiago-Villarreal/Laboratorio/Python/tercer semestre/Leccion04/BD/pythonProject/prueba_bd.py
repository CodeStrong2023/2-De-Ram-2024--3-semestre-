import psycopg2  # conexión a postgresql


conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)

cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia)  # ejecucion de sentencia
registros = cursor.fetchall()  # recuperacion de los registros como lista
print(registros)
cursor.close()
conexion.close()
