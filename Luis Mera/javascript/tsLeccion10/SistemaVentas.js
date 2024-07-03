class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._nombre = nombre;
    }

    toString(){ // template literals
        return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`
    }
} // fin clase producto

class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0
    }
    get idOrden(){
        return this._idOrden;
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);
            // this._productos[this._contadorProductosAgregados++] = producto;
        }else{
            console.log("No se pueden agregar más productos")
        }
    }
    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }
        return totalVenta;
    }
    mostarOrden(){
        let productosOrden = ' ';
        for(let producto of this._productos){
            productosOrden += '\n{'+producto.toString()+'} ';
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }
}

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturón', 50);
let Orden1 = new Orden();
let Orden2 = new Orden();
Orden1.agregarProducto(producto1);
Orden1.agregarProducto(producto2);
Orden1.agregarProducto(producto3);
Orden1.mostarOrden();
Orden1.agregarProducto(producto1);
Orden1.agregarProducto(producto2);
Orden2.agregarProducto(producto3);
Orden2.mostarOrden();