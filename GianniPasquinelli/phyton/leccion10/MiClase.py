class MiClase:
  
  variable_clase = "Variable clase"
  
  def __init__(self, variable_instancia):
    self.variable_instancia = variable_instancia
    
print(MiClase.variable_clase)
miClase = MiClase("Variable instancia")
print(miClase.variable_instancia)
print(miClase.variable_clase)
miClase2 = MiClase("Otra prueba de variable de instancia")