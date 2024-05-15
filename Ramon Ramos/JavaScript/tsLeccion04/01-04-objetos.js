let x = 10; // variable primitiva
console.log(x.length);
console.log('tipos primitivos');

//objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad:28,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //metodo o funcion
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){
        return 'Nombre: '+this.nombre+' edad: '+this.edad;
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

console.log('comienzo metodo get')
console.log(persona.nombreEdad);

console.log('Comienzo método get y set para idiomas');
persona.lang = 'en'
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+ ' '+ this.apellido;
    }
}
let padre = new Persona3('Leo','Lopez','lopezl@gmail.com');
padre.nombre = 'Luis';
padre.telefono = '5492618282821';
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.nombreCompleto());

//Formas de crear objetos
// caso 1
let miObjeto = new Object();
// caso 2 
let miObjeto2 = new Object();
// caso string
let miCadena1 = new String('Hola'); // formal
//caso string 2
let miCadena2 = 'Hola'; //simplicado

// casos con numeros
let miNumero = new Number(1); //formal
// casos con numeros 2
let miNumero2 = 1;

//caso booleano
let miBoolean1 = new Boolean(false); //formal
//caso booleano2
let miBoolean2 = false;

//caso arreglos 1
let miArreglos1 = new Array(); //formal
//caso Arreglos 2
let miArreglos2 = [];

//caso function 1
let miFuncion1 = new function(){};
//caso function 2
let miFuncion2 = function(){};

// Uso de prototype
Persona3.prototype.telefono = '2618383832'
console.log(padre)
console.log(madre.telefono)
madre.telefono = '5492618383832';
console.log(madre.telefono);

// Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}
let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara',
}
console.log(persona4.nombreCompleto2('Lic.','5492618383834'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5392618585856'));

//Método apply
let arreglo = ['Ing.', '5392618686865'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));