let x = 10; // variable primitiva
console.log(x.length);
console.log('tipos primitivos');

//objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad:30,
    nombreCompleto: function(){ //metodo o funcion
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');

let persona2 = new Object(); // se crea un objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'salada 14';
persona2.telefono = '5492618282821';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); //acceso como arreglo 

// For in y acceso como arreglo
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}
console.log('ciclo for in');

persona.apellido = 'Betancud'; // cambio dinamico de valor de atributo
console.log(persona);

// Otras formas para imprimir un objeto
// Número 1: concatenar cada valor de cada propiedad
console.log('Forma 1 de imprimir un objecto')
console.log(persona.nombre+', '+persona.apellido);
//Número 2: a través del ciclo for in 
console.log('Forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
// Número 3: la función object.values()
console.log('Forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

// Numero 4: Utilizaremos el método JSON.stringify
console.log('Forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);