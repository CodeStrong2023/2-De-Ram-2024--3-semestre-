package aritmetica;

import excepciones.OperacionExepcion;

public class Aritmetical {
    public static int division(int numerador, int denominador) {

        if (denominador == 0) {
            throw new OperacionExepcion("No se puede dividir por 0");
        } else {
            return numerador / denominador;
        }

    }
}
