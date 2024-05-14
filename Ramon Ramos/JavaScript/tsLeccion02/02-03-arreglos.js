//Creación de array o arreglos
//Let autos = new Array('Ferrari','Renault', 'BMW'); antigua sintaxis
const autos = ['Ferrari','Renault','BMW'];
console.log(autos);

//recorrer elementos de un arreglo

console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log((i + 1) + " : " + autos[i]);
}

// Modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

// Agregamos nuevos valores al arreglo
autos.push('Audi');
console.log(autos[3]);

//otra forma
autos[autos.length] = 'Porsche';
console.log(autos);

//tercer forma
autos[6] = 'Renault';
console.log(autos);

//preguntar si es un array o arreglo
console.log(Array.isArray(autos)); //respuesta booleana

console.log(autos instanceof Array);