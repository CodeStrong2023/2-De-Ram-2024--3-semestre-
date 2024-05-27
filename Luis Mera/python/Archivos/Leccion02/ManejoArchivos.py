
class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print("Otenemos el recurso".center(50, "-"))
        self.nombre = open(self.nombre, "r", encoding="utf-8")
        return self.nombre

    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Cerramos el recurso".center(50, "-"))
        if self.nombre:
            self.nombre.close()
        else:
            print("No hay nada")