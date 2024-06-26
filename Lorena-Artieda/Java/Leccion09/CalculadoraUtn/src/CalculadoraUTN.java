import java.util.Scanner;

public class CalculadoraUTN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("********Aplicacion Calculadora*******");
            mostrarMenu();
            var operacion = Integer.parseInt(entrada.nextLine());

            // Verificamos si la operación es la de salida
            if (operacion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Verificamos si la operación es válida
            if (operacion >= 1 && operacion <= 4) {
                ejecutarOperacion(operacion, entrada);
            } else {
                System.out.println("Entrada errónea, por favor seleccione una opción válida.");
            }
        } // fin while

        entrada.close(); // Cerrar el scanner
    } // fin main

    private static void mostrarMenu(){
        // Mostramos el menú
        System.out.println("""
            1. Suma
            2. Resta
            3. Multiplicación
            4. División
            5. Salir
            """);
        System.out.println("Operacion a realizar? ");
    }//Fin metodo mostrar menu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (operando1 + operando2));
                break;
            case 2:
                System.out.println("Resultado: " + (operando1 - operando2));
                break;
            case 3:
                System.out.println("Resultado: " + (operando1 * operando2));
                break;
            case 4:
                if (operando2 != 0) {
                    System.out.println("Resultado: " + (operando1 / operando2));
                } else {
                    System.out.println("Error: División por cero no permitida");
                }
                break;
            default:
                System.out.println("Entrada errónea");
        }//Fin switch
    }//Fin metodo ejecutarOperacion
} // fin clase


