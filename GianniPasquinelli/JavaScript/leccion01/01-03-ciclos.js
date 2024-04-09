let contador = 0;
while (contador < 3) {
  console.log(contador);
  contador++;
}

console.log("Fin del ciclo while");

//do while
let conteo = 0;
do {
  console.log(conteo);
  conteo++;
}while (conteo < 3);

console.log("Fin del ciclo do while");

//for
for (let i = 0; i < 3; i++) {
  console.log(i);
}

console.log("Fin del ciclo for");


// break
for (let i = 0; i <= 10; i++) {
  if (i % 2 == 0) {
    break;
  }
  console.log(i);
}

console.log("Fin del ciclo for con break");

// continue

inicio:
for (let i = 0; i <= 10; i++) {
  if (i % 2 !== 0) {
    continue inicio;
  }
  console.log(i);
}

console.log("Fin del ciclo for con continue");


// etiquetas labels, los labels son una forma de identificar un ciclo en especifico y poder hacer referencia a el desde otro ciclo o instrucción 

