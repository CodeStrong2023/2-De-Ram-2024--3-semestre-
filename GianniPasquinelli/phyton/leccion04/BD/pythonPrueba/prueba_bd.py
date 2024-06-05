import psycopg2 # Importamos el módulo psycopg2 para conectarnos a la base de datos

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_db'
    ) # Nos conectamos a la base de datos

cursor = conexion.cursor() # Creamos un cursor
sentencia = 'SELECT * FROM persona' # Creamos una sentencia SQL
cursor.execute(sentencia) # Ejecutamos la sentencia SQL
registros = cursor.fetchall() # Obtenemos los registros de la consulta
print(registros) # Imprimimos los registros
cursor.close() # Cerramos el cursor
conexion.close() # Cerramos la conexión a la base de datos