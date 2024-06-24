import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("********** Calculadora UTN **********");
            // Mostramos el menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(scanner.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, scanner);
                }//fin if
                else if (operacion == 5) {
                    System.out.println("Hasta pronto....");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //imprimimos un salt de linea antes de repetir el menu
                System.out.println();
            } catch (Exception e) { //fin try comienzo del catch
                System.out.println("Ocurrio un error: " + e.getMessage());
                System.out.println();
            }
        }//fin while
    }// fin main
    private static void mostrarMenu() {
        System.out.println("""
                
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                """);
        System.out.println("Ingrese la opcion a realizar: ");
    }
    private static void ejecutarOperacion(int operacion, Scanner scanner){
        System.out.println("Ingrese el valor para el operado1r: ");
        var operador1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el valor para el operador2: ");
        var operador2 = Double.parseDouble(scanner.nextLine());

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (operador1 + operador2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (operador1 - operador2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (operador1 * operador2));
                break;
            case 4:
                if (operador2 != 0) {
                    System.out.println("El resultado de la division es: " + (operador1 / operador2));
                } else {
                    System.out.println("No se puede dividir por 0");
                }
                break;
            default:
                System.out.println("Opcion erronea: " + operacion);
        } //fin swich
    }
}//fin clase
