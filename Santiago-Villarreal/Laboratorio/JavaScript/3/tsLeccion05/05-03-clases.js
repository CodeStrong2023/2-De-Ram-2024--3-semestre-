class Persona{ //clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
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
        return this._nombre+' '+this._apellido;
    }

    toString(){
        return this.nombreCompleto();
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