from figurageometrica import Figurageometrica
from Color import color

class Cuadrado(Figurageometrica, Color):
    def __init__(self, lado, color):
        # super.__init__(lado)
        Figurageometrica.__init__(self, lado, lado)
        Color.__init__(self, color)
        
    def calcular_area(self):
        return self.alto * self.anch
    
    def __str__(self):
        return f'{Figurageometrica.__str__(self)} {color.__str__(self)}'