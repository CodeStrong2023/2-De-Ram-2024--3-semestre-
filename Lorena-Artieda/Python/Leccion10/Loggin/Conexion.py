import sys
import psycopg2 as bd
from logger_base import log

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion = bd.connect(
                    host=cls._HOST,
                    user=cls._USERNAME,
                    password=cls._PASSWORD,
                    port=cls._DB_PORT,
                    database=cls._DATABASE
                )
                log.debug(f"Conexion exitosa de la conexion: {cls._conexion}")
            except Exception as e:
                log.error(f'Ocurrió un error al obtener la conexión: {e}')
                cls._conexion = None
        return cls._conexion

    @classmethod
    def obtenerCursor(cls):
        conexion = cls.obtenerConexion()
        if conexion is not None:
            try:
                cls._cursor = conexion.cursor()
                log.debug(f"Cursor obtenido: {cls._cursor}")
                return cls._cursor
            except Exception as e:
                log.error(f'Ocurrió un error al obtener el cursor: {e}')
                cls._cursor = None
        return cls._cursor

if __name__ == '__main__':
    conexion = Conexion.obtenerConexion()
    cursor = Conexion.obtenerCursor()
    if conexion:
        log.debug('Conexion obtenida exitosamente')
    if cursor:
        log.debug('Cursor obtenido exitosamente')
