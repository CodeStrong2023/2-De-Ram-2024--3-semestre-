
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos enteros
            int = la clase envolvente es Integer
            long = la clase envolvente es Long
            boolean = la clase envolvente es Boolean
            float = la clase envolvente es Float
            double = la clase envolvente es Double
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */
        
        int enteroPrim = 10; //Tipo primitivos
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; // Tipo object con la clase integer
        System.out.println("entero = " + entero);
        
        int entero2 = entero; //Unboxing
            System.out.println("entero2 = " + entero2);
        
    }
}
