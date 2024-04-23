package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clase envolvente o wrapper
        /* Clases evolventes de tipos primitivos
        int= la clase envolvente es Integer
        long= la clase envolvente es Long
        float= la clase envolvente es Float
        double = la clase envolvente es Double
        boolean= la clase envolvente es Boolean
        byte= la clase envolvente es Bytwe
        char= la clase envolvente es Character
        short= la clase envolvente es Short



    */
        int enteroPrimitivo= 10;// Tipo entero primitivo
        Integer entero=  10; // Tipo object con la clase Integer
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);
        System.out.println("Entero = "+ entero.byteValue()); //Autoboxing

        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);

    }
}