from abc import ABC, abstractmethod
# ABC = abstract base class



class FiguraGeometrica:
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'valor erróneo para el ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'valor erróneo para el ancho: {alto}')

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'valor erróneo ancho: {ancho}')

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'valor erróneo ancho: {alto}')

    @abstractmethod
    def calcular_area(self):
        pass

    def __str__(self):
        return f'FiguraGeométrica [Ancho: {self._ancho}, Alto: {self._alto}]'
    
    def _validar_valores(self, valor): #metodo encapsulado
        return True if 0 < valor < 10 else False
    