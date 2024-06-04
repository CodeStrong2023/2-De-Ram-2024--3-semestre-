class Persona{ //clase padre

    static contadorPersonas = 0;
    // email = 'Valor default email';
    static get MAX_OBJ(){
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        } else {
            console.log('Se ha superadoel máximo de objetos permitidos');
        }
        
        // console.log('Se incrementa el contador: ' + Persona.contadorObjetosPersona);
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+ ' ' + this._nombre + ' ' + this._apellido;
    }

    toString(){
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("saludos desde el método static")
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
    }

}

class Empleado extends Persona{ // clase hija
    constructor(departamento,nombre, apellido){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    nombreCompleto(){
        return super.nombreCompleto() + ', '+ this._departamento
    }

}

let persona1 = new Persona('Martin', 'Perez');
// console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Guajardo';
console.log(persona1.nombre +' '+ persona1.apellido);

let persona2 = new Persona('Carlos', 'Lara');
// console.log(persona2);
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
persona2.apellido = 'Velazquez';
console.log(persona2.nombre +' '+ persona2. apellido);

let empleado1 = new Empleado('Sistemas', 'Maria', 'Gimenez');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString
console.log(empleado1.toString());
console.log(persona1.toString());

// persona1.saludar(); no se utiliza desde el objeto

Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

// console.log(persona1.contadorObjetosPersona);

console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas);
 
// console.log(persona1.email);
// console.log(empleado1.email);
// console.log(Persona.email); No estatico, no se puede acceder desde la clase
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);
console.log(Persona.MAX_OBJ);
// Persona.MAX_OBJ = 10; // no se modifica

let persona4 = new Persona('Franco', 'Díaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana', 'Paz');
console.log(persona5.toString());