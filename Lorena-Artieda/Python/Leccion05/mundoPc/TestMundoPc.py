from mundoPc.Computadora import Computadora
from mundoPc.Monitor import Monitor
from mundoPc.Orden import Orden
from mundoPc.Raton import Raton
from mundoPc.Teclado import Teclado

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15"')
raton1 = Raton('HP', 'USB')
computadora1 = Computadora('HP', teclado1, monitor1, raton1)


teclado2 = Teclado('Gamer', 'Bluetooth')
monitor2 = Monitor('Acer', '27"')
raton2 = Raton('Razr', 'Bluetooth')
computadora2 = Computadora('Acer', teclado2, monitor2, raton2)


computadoras1 = [computadora2, computadora1]
orden1 = Orden(computadoras1)

print(orden1)