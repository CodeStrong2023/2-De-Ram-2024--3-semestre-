class Persona {
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
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

let empleado2 = new Empleado("Carlos", "Ramirez", "Contabilidad");

console.log(empleado2);
console.log(empleado2.nombre);
console.log(empleado2.departamento);
empleado2.departamento = "Finanzas";
console.log(empleado2.departamento);
