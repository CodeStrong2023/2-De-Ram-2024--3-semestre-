package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolvenetes o wrapper
        /*
            Clases envolventes de tipos primitivo
            int = clase envolvente integer
         */

        int enteroPrimitivo = 10;
        System.out.println("entero primitvo = " + enteroPrimitivo);
        Integer entero = 10;
        System.out.println("entero = " + entero.doubleValue()); //autoboxing

        int entero2 = entero; // unboxing
        System.out.println("entero2 = " + entero2);
    }
}
