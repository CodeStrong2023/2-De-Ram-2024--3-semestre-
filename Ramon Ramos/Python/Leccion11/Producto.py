class Producto:
    contador_productos = 0  # variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1
        self._id_producto = Producto.contador_productos  # asignacion desde la variable de clase
        self._precio = precio

# getter aand setters

@property 
def nombre(self):
    return self._nombre


@nombre.setter
def nombre(self, nombre):
    self._nombre = nombre


@property
def precio(self):
    return self._precio


@precio.setter
def precio(self, precio):
    self._precio = precio

# metodo str


def __str__(self):
    return f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


if __name__ == '__main__':
    producto1 = Producto('camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)