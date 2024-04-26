class MiClase:
    #Variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase= "Esta es una variable de clase"
    def __init__(self,variable_instancia):#La variable de instancia, da diferentes valores
        self.variable_instancia= variable_instancia
print(MiClase.variable_clase)
miClase1= MiClase("Esto es una variable de instancia")
print(miClase1.variable_instancia)

miClase2 = MiClase("Esto es otra prueba de variable de instancia")
print(miClase2.variable_instancia)

miClase2.variable_clase_2 = "Variable de clase 2"

print(miClase2.variable_clase_2)