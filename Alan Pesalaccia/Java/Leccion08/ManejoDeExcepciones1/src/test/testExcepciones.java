package test;

import excepciones.OperacionExcepcion;

import  static aritmetica.Aritmetica.division;

public class testExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un Error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("la variable resultado tiene como valor: " + resultado);

    }
}
