miFuncion(8, 2);

function miFuncion(a, b) {
  console.log('Suma: ' + (a + b));
  console.log('Resta: ' + (a - b));
  console.log('Multiplicación: ' + a * b);
  console.log('División: ' + a / b);
}

miFuncion(5, 3);

function miFunction(a, b) {
  console.log(`Suma ${a + b}`);
}

miFunction(3, 5);

function miFuncion2(a, b) {
  return a + b;
}

let resultado = miFunction2(3, 5);

console.log(resultado);

// Funciones flecha

const sumarFuncionFlecha = (a, b) => a + b;
console.log(sumarFuncionFlecha(2, 5));

let resultado2 = sumarFuncionFlecha(3, 4);
