package test;

public class testAutoboxingUnboxing {
    public static void main(String[] args) {
        
        int entero = 10;
        /* enteron. no hay opciones, de tipo primitivo*/
        Integer entero2 = 11;
        entero2.floatValue(); /* tengo opciones de metodos, de tipo object  || autoboxing*/
        
        int unboxing = entero2; /* paso a estar dentro de una variable primitiva, por lo que deja de tratarse com obj*/
        
        
    }
}
