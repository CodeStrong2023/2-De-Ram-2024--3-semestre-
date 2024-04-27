from Empleado import Empleado


class Gerente(Empleado):
    def __init__(self, departamento, nombre, sueldo):
        super().__init__(nombre, sueldo)
        self.departamento = departamento

    def __str__(self):
        return f"Nombre: {self.nombre}, Sueldo: {self.sueldo}, Departamento: {self.departamento}"
