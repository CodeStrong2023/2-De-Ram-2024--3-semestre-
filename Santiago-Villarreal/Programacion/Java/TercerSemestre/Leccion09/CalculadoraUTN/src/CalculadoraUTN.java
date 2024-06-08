import java.util.Scanner;

public class CalculadoraUTN{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***** Aplicación Calculadora *****");
        // Menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.print("Operación a realizar? >");
        var operacion = Integer.parseInt(entrada.nextLine());
        if(operacion >= 1 && operacion <= 4){
            System.out.print("Digite un valor para el operando1 >");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite un valor para el operando2 >");
            var operando2 = Integer.parseInt(entrada.nextLine());
            int resultado;
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
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                default:
                    System.out.println("Error: Opcion incorrecta: " + " " + operacion);
                    break;
            } // fin swtich
        } // fin if
        if(operacion == 5){
            System.out.println("Fin");
        }
        if(operacion < 1 || operacion > 5) {
            System.out.println("Error: Opcion incorrecta: " + ' ' + operacion);
        }
    } // fin main
} // Fin clase