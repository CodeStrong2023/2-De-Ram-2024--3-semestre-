let x = 10; // valor primitivo
console.log(x.length); // undefined

// objeto
let persona = {
  nombre: 'Juan',
  apellido: 'Perez',
  email: 'sdfsdf@gmail.com',
  edad: 28,
  nombreCompleto: function () {
    return this.nombre + ' ' + this.apellido;
  },
};

console.log(persona.nombre); // Juan
console.log(persona.edad); // 28
console.log(persona.apellido); // Perez
console.log(persona.email); // sdfsdf@gmail.com
console.log(persona); // { nombre: 'Juan', apellido: 'Perez', email: '

console.log(persona.nombreCompleto()); // Juan Perez

let persona2 = new Object(); // objeto vacio
persona2.nombre = 'Carlos';
persona2.direccion = 'Saturno 15';
persona2.tel = '5555 5555';

console.log(persona2.tel); // 5555 5555
console.log(persona2['direccion']); // Saturno 15

// for in
for (nombrePropiedad in persona) {
  console.log(nombrePropiedad); // nombre, apellido, email, edad, nombreCompleto
  console.log(persona[nombrePropiedad]); // Juan, Perez,
}

persona.tel = '5555 5555'; // agregar propiedad
persona.edad = 29; // modificar propiedad


console.log(persona.nombre + ' ' + persona.apellido + ' ' + persona.email + ' ' + persona.edad); // Juan Perez

for (nombrePropiedad in persona) {
  console.log(persona[nombrePropiedad]);
}

let personaArray = Object.values(persona);
console.log(personaArray); // [ 'Juan', 'Perez', '

let personaString = JSON.stringify(persona);
console.log(personaString); // {"nombre":"Juan","apellido":"Perez","email":"
