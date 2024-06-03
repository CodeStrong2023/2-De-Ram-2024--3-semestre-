from Computadora import Computadora
from Monitor import Monitor
from Raton import Raton
from Tecaldo import Teclado
from Orden import Orden

monitor1 = Monitor('HP', 15)
teclado1 = Teclado('USB', 'HP')
raton1 = Raton('USB', 'HP')
computadora1 = Computadora('HP', monitor1, teclado1, raton1)

monitor2 = Monitor('LG', 27)
teclado2 = Teclado('Bluetooth', 'Dell')
raton2 = Raton('Bluetooth', 'Dell')
computadora2 = Computadora('Dell', monitor2, teclado2, raton2)

computadoras = [computadora1, computadora2]
orden1 = Orden(computadoras)

print(orden1)