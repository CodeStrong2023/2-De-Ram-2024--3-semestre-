import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Lista 
        List<Persona> personas = new ArrayList<>();
        // Menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            }catch(Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println(" ");
        }
    }

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Switch
        switch(opcion){
            case 1:
                System.out.print("Ingrese el nombre >");
                var nombre = entrada.nextLine();
                System.out.print("Ingrese el telefono >");
                var tel = entrada.nextLine();
                System.out.print("Ingrese el correo >");
                var email = entrada.nextLine();
                // Objeto persona
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size()+" elementos");
            case 2: // Listar personas
                System.out.println("Listado de personas >");
                // Lambda y metodo de referencia
                // personas.forEach((persona)->System.out.print(persona));
                personas.forEach(System.out::println);
            case 3:
                System.out.println("Hasta pronto");
                salir = true;
            default:
                System.out.println("Opción Incorrecta " + opcion);
        }
        return salir;
    }

    private static void mostrarMenu(){
        // opciones
        System.out.print("""
                ***** Listado de Personas ******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Ingrese una opción >");
        // int opcion = Integer.parseInt(entrada.nextLine());
    }
}
