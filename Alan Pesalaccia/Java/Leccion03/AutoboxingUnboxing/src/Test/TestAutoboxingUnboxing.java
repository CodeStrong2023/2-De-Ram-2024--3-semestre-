
package Test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args){
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = la clase envolvente es Integer
            long = la clase envolvente es Long
            double = la clase envolvente es Float
            boolean = la clase envolvente es Boolean
            byte = la clase envolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */  
        
        int EnteroPrim = 10; // Tipo Primitivo
        System.out.println("EnteroPrim = " + EnteroPrim);
        
        Integer Entero = 10; // Tipo object con la clase Integer
        System.out.println("Entero = " + Entero.doubleValue()); // Autoboxing
        
        int Entero2 = Entero; //Unboxing
        System.out.println("Entero2 = " + Entero2);
        
       
    }   
}
