function miFuncion(a, b) {
  console.log(`Suma ${a + b}`);
}

miFuncion(3, 5);

function miFuncion2(a, b) {
  return a + b;
}

let resultado = miFuncion2(3, 5);

console.log(resultado);

// Funciones flecha

const sumarFuncionFlecha = (a, b) => a + b;
console.log(sumarFuncionFlecha(2, 5));

let resultado2 = sumarFuncionFlecha(3,4);

