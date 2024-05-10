let x = 10;

console.log(x.length);

console.log("Tipos primitivos");

let persona = {
  nombre: "Carlos",
  apellido: "Perez",
  email: "cp@gmail.com",
  edad: 28,
  idioma: "ES",
  nombreCompleto: function () {
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    return this.nombre + " " + this.edad;
  },
  get lang() {
    return this.idioma.toUpperCase();
  },
  set lang(lang) {
    this.idioma = lang.toUpperCase();
  },
};

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log("Ejecutand con un objeto");

let pesona2 = new Object();
pesona2.nombre = "Maria";
pesona2.apellido = "Jimenez";

console.log(pesona2);
console.log(pesona2.nombre);
console.log(pesona2.apellido);

// Metodo get
console.log(persona.nombreEdad);
console.log(persona.lang);

// Metodo set
persona.lang = "en";
console.log(persona.lang);

function Persona(nombre, apellido, email) {
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  this.nombreCompleto = function () {
    return this.nombre + " " + this.apellido;
  };
}

let padre = new Persona("Juan", "Perez", "jp@gmail.com");
padre.nombre = "Carlos";
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona("Laura", "Quintero", "lq@gmail.com");
console.log(madre);
console.log(madre.nombreCompleto());

// Diferentes formas de crear un objeto

// Caso 1
let miObjeto = new Object();

// Caso 2
let miObjeto2 = {};

// Caso string
let miCadena1 = new String("Hola");

// Caso string2
let miCadena2 = "Hola";

// Caso numero 1
let miNumero = new Number(1);

// Caso numero 2
let miNumero2 = 1;

// Caso boolean 1
let miBoolean = new Boolean(false);

// Caso boolean 2
let miBoolean2 = false;

// Caso array
let miArray = new Array();

// Caso array 2
let miArray2 = [];

// Caso funcion
let miFuncion = new Function();

// Caso funcion 2
let miFuncion2 = function () {};

// Uso de prototype
Persona.prototype.tel = "123456789";
console.log(padre.tel);
console.log(madre.tel);

// Uso de call
let persona3 = {
  nombre: "Juan",
  apellido: "Perez",
  nombreCompleto: function (titulo, tel) {
    return titulo + ": " + this.nombre + " " + this.apellido + " " + tel;
  },
};

console.log(persona3.nombreCompleto("Lic", "123456789"));

let persona4 = {
  nombre: "Carlos",
  apellido: "Lara",
};

console.log(persona3.nombreCompleto.call(persona4, "Ing", "987654321"));

// Uso de apply
let persona5 = {
  nombre: "Juan",
  apellido: "Perez",
  nombreCompleto: function () {
    return this.nombre + " " + this.apellido;
  },
};

console.log(persona5.nombreCompleto());

console.log(persona3.nombreCompleto.apply(persona5, ["Lic", "123456789"]));
