// While

let contador = 0;

while (contador > 3) {
  console.log(contador);
  contador++;
}

console.log("Fin del ciclo while");

// do while
let conteo = 0;
do {
  console.log(conteo);
  conteo++;
} while (conteo < 3);

console.log("Fin del ciclo do while");

// For

for (let contador = 0; contador < 3; contador++) {
  console.log(contador);
}

console.log("Fin del ciclo for");

// Palabra reservada break
for (let contador = 0; contador < 10; contador++) {
  if (contador % 2 === 0) {
    console.log(contador);
    break;
  }
}

// Palabra reservada continue
for (let contador = 0; contador < 10; contador++) {
  if (contador % 2 !== 0) {
    console.log(contador);
    continue;
  }
}

// Etiqueta label
inicio: for (let contador = 0; contador < 10; contador++) {
  if (contador % 2 !== 0) {
    console.log(contador);
    break inicio;
  }
}
