class MiClase:
  
  variable_clase = "Variable clase"
  
  def __init__(self, variable_instancia):
    self.variable_instancia = variable_instancia
    
    @staticmethod
    def metodo_estatico():
      print(MiClase.variable_clase)
    
    
print(MiClase.variable_clase)
miClase = MiClase("Variable instancia")
print(miClase.variable_instancia)
print(miClase.variable_clase)
miClase2 = MiClase("Otra prueba de variable de instancia")

MiClase.variable_clase2 = "Variable de clase 2"
print(MiClase.variable_clase2)
print(miClase.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()