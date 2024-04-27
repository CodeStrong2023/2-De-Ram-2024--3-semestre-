class Orden:
    contador_orden = 0

    def __init__(self, productos):
        self._productos = list(productos)
        Orden.contador_orden += 1
        self.id_orden = Orden.contador_orden

    def agregar_producto(self, producto):
        self._productos.append(producto)

    def calcular_total(self):
        total = 0
        for producto in self._productos:
            total += producto.precio
        return total
    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__()+"|"
        return f'Orden: {self.id_orden} \nProductos: {productos_str}'