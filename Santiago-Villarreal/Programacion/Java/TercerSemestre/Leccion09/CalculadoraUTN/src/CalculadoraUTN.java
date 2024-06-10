import java.util.Scanner;

public class CalculadoraUTN{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("***** Aplicación Calculadora *****");
            mostrarMenu();
            try{
                System.out.print("Operación a realizar? >");
                var operacion = Integer.parseInt(entrada.nextLine());
                if(operacion >= 1 && operacion <= 4){
                    ejecutarOperacion(operacion, entrada);
                } // fin if
                if(operacion == 5){
                    System.out.println("Fin");
                    break;
                }
                if(operacion < 1 || operacion > 5) {
                    System.out.println("Error: Opcion incorrecta: " + ' ' + operacion);
                }
                System.out.println(" ");
            } catch(Exception e) { // Fin try, comienzo del catch
                System.out.println("Ocurrió un error" + e.getMessage());
                System.out.println();
            }
        }
    } // fin main

    private static void mostrarMenu(){
         // Menú
        System.out.println("""
            1. Suma
            2. Resta
            3. Multiplicación
            4. División
            5. Salir
        """);
    }

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite un valor para el operando1 >");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite un valor para el operando2 >");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        switch (operacion) {
            case 1: // suma
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2: // resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3: // multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4: // división
                resultado = operando1 % operando2;
                System.out.println("Resultado de la division: " + resultado);
                break;
            default:
                System.out.println("Error: Opcion incorrecta: " + " " + operacion);
                break;
        } // fin swtich
    }
} // Fin clase