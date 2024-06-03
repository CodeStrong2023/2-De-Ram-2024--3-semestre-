class Persona {
  static contadorPersonas = 0;
  // email = "Valor default email";
  static get MAX_OBJ() { // Metodo estatico
    return 5;
  }

  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    Persona.contadorPersonas++;
    this.idPersona = ++Persona.contadorPersonas;
    // console.log("Se incrementa contador: " + Persona.contadorPersonas);
    if (Persona.contadorPersonas > Persona.MAX_OBJ) {
      console.log("Se ha superado el maximo de objetos permitidos");
    } else {
      console.log("Se ha creado el objeto persona: " + this.nombreCompleto());
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
    return this.idPersona + " " + this._nombre + " " + this._apellido;
  }

  // Sobreescritura del metodo de la clase padre (Object)
  toString() {
    return this.nombreCompleto();
  }

  static saludar() {
    console.log("Saludos desde el metodo estatico");
  }

  static saludar2(persona) {
    console.log(persona.nombre + " " + persona.apellido);
  }

}

class Empleado extends Persona {
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = departamento;
  }

  // Sobreescritura
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento;
  }
}

let persona1 = new Persona("Juan", "Perez");

console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);

let persona2 = new Persona("Karla", "Lara");

console.log(persona2);
console.log(persona2.nombre);
persona2.nombre = "Karla Maria";
console.log(persona2.nombre);

let empleado1 = new Empleado("Laura", "Quintero", "Sistemas");

console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.departamento);
empleado1.nombre = "Laura Ines";
console.log(empleado1.nombre);
console.log(empleado1.departamento);
console.log(empleado1.nombreCompleto());

let empleado2 = new Empleado("Carlos", "Ramirez", "Contabilidad");

console.log(empleado2);
console.log(empleado2.nombre);
console.log(empleado2.departamento);
empleado2.departamento = "Finanzas";
console.log(empleado2.departamento);
console.log(empleado2.nombreCompleto());

console.log(empleado1.toString());
console.log(persona1.toString());

Persona.saludar();
Persona.saludar2(persona1);
Persona.saludar2(persona2);
Persona.saludar2(empleado1);

console.log("Contador Personas: " + Persona.contadorPersonas);

// console.log(empleado1.email);
// console.log(persona1.email);


let persona3 = new Persona("Carla", "Perstosi");
console.log(persona3.toString());
console.log("Contador Personas: " + Persona.contadorPersonas);


console.log(Persona.MAX_OBJ);

let persona4 = new Persona("Pedro", "Infante");
console.log(persona4.toString());