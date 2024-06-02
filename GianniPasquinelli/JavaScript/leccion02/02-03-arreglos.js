const autos = [
  'Ferrari',
  ' Renault',
  ' BMW',
  ' Audi',
  ' Mercedes Benz',
  ' Porsche',
  ' Lamborghini',
  ' Maserati',
  ' Jaguar',
  ' Aston Martin',
];
console.log(autos);

// recorrer un arreglo
console.log(autos[0]);

for (let i = 0; i < autos.length; i++) {
  console.log(autos[i]);
}

// modificar un elemento del arreglo
autos[0] = 'Volvo';

// agregar un elemento al final del arreglo
autos.push('Tesla');

// agregar un elemento al inicio del arreglo
autos.unshift('Toyota');

// saber si es un arreglo
console.log(Array.isArray(autos));

console.log(autos instanceof Array);
