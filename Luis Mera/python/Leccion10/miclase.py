class MiClase:
    #Variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase= "Esta es una variable de clase"
    def __init__(self,variable_instancia):#La variable de instancia, da diferentes valores
        self.variable_instancia= variable_instancia

    @staticmethod # Métodos estáticos
    def metodo_statico():
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls): #cls es una referencia a la clase
        print(cls.variable_clase)

    def metodo_instancia(self):
        print(self.metodo_clase())
        print(self.metodo_statico())

print(MiClase.variable_clase)
miClase1= MiClase("Esto es una variable de instancia")
print(miClase1.variable_instancia)

miClase2 = MiClase("Esto es otra prueba de variable de instancia")
print(miClase2.variable_instancia)

miClase2.variable_clase_2 = "Variable de clase 2"

print(miClase2.variable_clase_2)

MiClase.metodo_statico()

MiClase.metodo_clase()

miobjeto1 = MiClase("Esto es una variable de instancia")
miobjeto1.metodo_instancia()
