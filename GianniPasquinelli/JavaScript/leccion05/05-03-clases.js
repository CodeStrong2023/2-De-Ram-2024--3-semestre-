class Persona {
  static contadorPersonas = 0; // atributo de nuestra clase
  email = 'Valor default email'; // atributo de nuestra clase, no estatico (no se puede acceder desde la clase) solo desde una instancia de la clase

  static get MAX_OBJ() { // metodo get de nuestra clase (no se necesita invocar con parentesis) solo se accede a traves de la clase
    return 5;
  }

  //clase padre
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    if (Persona.contadorPersonas < Persona.MAX_OBJ) {
    console.log('Se incrementa contador ' + Persona.contadorPersonas);
    this.idPersona = ++Persona.contadorPersonas;
    } else {
      console.log('Se ha superado el maximo de objetos permitidos');
    }
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get apellido() {
    return this._apellido;
  }

  set apellido(apellido) {
    this._apellido = apellido;
  }

  nombreCompleto() {
    return this.idPersona + ': ' + this._nombre + ' ' + this._apellido;
  }

  // Sobreescribiendo el metodo de la clase padre (Object)
  toString() {
    // regresa una representacion en cadena del objeto
    // Se aplica polimorfismo (multiples formas en tiempo de ejecucion)
    // el metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
    return this.nombreCompleto();
  }

  static saludar() {
    console.log('Saludos desde el metodo static');
  }

  static saludar2(persona) {
    console.log(persona.nombre + ' ' + persona.apellido);
  }
}

class Empleado extends Persona {
  // clase hija
  constructor(departamento, nombre, apellido) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = departamento;
  }
}

let persona1 = new Persona('Martin', 'Perez');
// console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Guajardo';
console.log(persona1.nombre + ' ' + persona1.apellido);

let persona2 = new Persona('Carlos', 'Lara');
// console.log(persona2);
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
persona2.apellido = 'Velazquez';
console.log(persona2.nombre + ' ' + persona2.apellido);

let empleado1 = new Empleado('Sistemas', 'Maria', 'Gimenez');
console.log(empleado1);

// Object.prototype.toString  Esta es la manera en que se llama el metodo toString de la clase Object
console.log(empleado1.toString());
console.log(persona1.toString());

persona1.saludar(); // no es posible llamar un metodo static desde una instancia

Persona.saludar(); // se llama el metodo static de la clase padre

Persona.saludar2(persona1); // se llama el metodo static de la clase padre

Empleado.saludar(); // se llama el metodo static de la clase hija
Empleado.saludar2(empleado1); // se llama el metodo static de la clase hija

console.log(Persona.contadorPersonas); // 0
console.log(Empleado.contadorPersonas); // undefined

console.log(persona1.email); // Valor default email
console.log(empleado1.email); // Valor default email


console.log(persona1.toString()); // 1: Juan Carlos Guajardo
console.log(empleado1.toString()); // 2: Maria Gimenez
console.log(Persona.contadorPersonas); // 2

let persona3 = new Persona('Karla', 'Lara');
console.log(persona3.toString()); // 3: Karla Lara
console.log(Persona.contadorPersonas); // 3

console.log(Persona.MAX_OBJ); // 5
// Persona.MAX_OBJ = 10; // no se puede reasignar un valor a un metodo get
console.log(Persona.MAX_OBJ); // 5

let persona4 = new Persona('Laura', 'Gomez');
console.log(persona4.toString()); // 4: Laura Gomez
let persona5 = new Persona('Carlos', 'Lopez');
console.log(persona5.toString()); // 5: Carlos Lopez
let persona6 = new Persona('Juan', 'Perez');
console.log(persona6.toString()); // Se ha superado el maximo de objetos permitidos


