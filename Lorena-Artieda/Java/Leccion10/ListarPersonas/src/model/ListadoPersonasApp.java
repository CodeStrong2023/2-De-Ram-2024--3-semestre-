package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        // Empezamos con el menú
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        } // Fin ciclo While
    } // Fin método main

    private static void mostrarMenu() {
        // Mostramos las opciones
        System.out.print("""
                ******Listado de Personas ******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.println("Digite una de las opciones: ");
    } // Fin método mostrar menú

    public static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas) {
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Revisamos la opción digitada a través de un switch
        switch (opcion) {
            case 1 -> {
                // Agregar a una persona a la lista
                System.out.print("Digite un nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el teléfono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el email: ");
                var email = entrada.nextLine();

                // Creamos el objeto persona
                Persona persona = new Persona(nombre, tel, email);
                // Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            } // Fin del caso 1
            case 2 -> {
                System.out.println("Listado de personas: ");
                // Mejoras con lambda y el método de referencia
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto");
                salir = true;
            } // Fin caso 3
            default -> System.out.println("Opción incorrecta " + opcion);
        }
        return salir;
    } // Fin método ejecutarOperacion
} // Fin clase ListadoPersonas