//Creacion de Array o arreglos
//let autos = new Array('Ferrari','Renault','BMW'); esta es la sintaxis vieja
const autos =['Ferrari','Renault','BMW'];
console.log(autos)


//Mostramos un elementos
console.log(autos[0])

//Recorremos los elementos de un arreglo

for(let i = 0; i<autos.length;i++){
    console.log(autos[i])
}

//Agregamos nuevos elementos al array
autos.push('Audi', 'Fiat', 'Peugeot')
console.log(autos)

//Otras formas de agregar elementos
autos[autos.length]= "Porsche";
console.log(autos);

//Tercera forma de agregar elementos teniendo cuidado
autos[6]='Chevrolet';

//Como preguntar si es un arreglo
console.log(Array.isArray(autos));//Devuelve un booleano

console.log(autos instanceof Array); //Preguntamos si es una isntancia de la clase Array

