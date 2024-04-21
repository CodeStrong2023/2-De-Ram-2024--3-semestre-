from abc import ABC, abstractmethod
#ABC significa : Abstract CBase Classs, convierte una clase en abstracta

class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'Valor erroneo para el ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'Valor erroneo para el alto: {alto}')

#Getters y Setters
    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'Valor erroneo ancho: {ancho}')
    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self,alto):
        if self._validar_valores(alto):
            self._alto =alto
        else:
            print(f'Valor erroneo alto: {alto}')

    @abstractmethod
    def clacularArea(self):
        pass
    def __str__(self):
      return f'Figura geometrica [Ancho: {self._ancho},Alto: {self._alto}]'

    def _validar_valores(self, valor):
        return True if 0<10 else False