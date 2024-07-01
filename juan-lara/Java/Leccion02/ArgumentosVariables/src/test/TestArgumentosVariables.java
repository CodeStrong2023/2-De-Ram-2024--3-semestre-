package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(10,25,12);
        imprimirNumeros(8, 4);
        variosParámetros("Ramon", "Ramos", 10, 15, 20); 
    }
    
    private static void variosParámetros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido );
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int ...numeros){
       for (int i = 0; i < numeros.length; i++){
            System.out.println("Elementos: "+numeros[i]);
       } 
    }
}
