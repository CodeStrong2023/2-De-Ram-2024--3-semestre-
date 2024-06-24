package test;

public class testArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez", 1, 2, 3);
    }
    private static void variosParametros(String nombre, String apellido, int ...numeros) {
        System.out.println("nombre = " + nombre+ " apellido = " + apellido);
        System.out.println(numeros);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
