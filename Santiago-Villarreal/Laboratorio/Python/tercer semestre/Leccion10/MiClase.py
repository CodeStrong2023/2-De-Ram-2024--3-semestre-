class MiClase: 
    # Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'
    
    def __init__(self, variable_instancia): #da otros valores
        self.variable_instancia = variable_instancia

print(MiClase.variable_clase)
miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
miClase2 = MiClase('Esta es la otra prueba de variable de instancia')
print(miClase2.variable_clase)
