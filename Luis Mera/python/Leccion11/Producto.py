from Orden import Orden


class Producto:
    contador_productos = 0

    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
        Producto.contador_productos += 1
        self.id_producto = Producto.contador_productos

    @property
    def nombre(self):
        return self.nombre

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre

    @property
    def precio(self):
        return self.precio

    @precio.setter
    def precio(self, precio):
        self.precio = precio

    def __str__(self):
        return f"ID Producto: {self.id_producto}, Nombre: {self.nombre}, Precio: {self.precio}"
