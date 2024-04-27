const autos = ["Ferrari", "BMW", "Renault"];

console.log(autos);

console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);

for (let i = 0; i < autos.length; i++) {
  console.log(i + " : " + autos[i]);
}

// Modificamos un elemento del array
autos[2] = "Fiat";

// Agregamos un elemento al array
autos.push("Audi");

console.log(autos);

// Consultar si es un array

console.log(Array.isArray(autos));

console.log(autos instanceof Array);
