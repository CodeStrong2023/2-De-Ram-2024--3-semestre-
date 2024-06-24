package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestAbstract {
    public static void main(String[] args) {

        FiguraGeometrica figura = new Rectangulo("rectangulo");
        figura.dibujar();
    }
}
