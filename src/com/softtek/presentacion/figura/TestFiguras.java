package com.softtek.presentacion.figura;

import com.softtek.modelo.figura.Circulo;
import com.softtek.modelo.figura.Figura;
import com.softtek.modelo.figura.Rectangulo;

public class TestFiguras {
    public static void main(String[] args) {
        Figura f = new Figura();
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();

        int[] p = f.position();
        System.out.println(p[0] + ", " + p[1]);

        p = c.position();
        System.out.println(p[0] + ", " + p[1]);

        p = r.position();
        System.out.println(p[0] + ", " + p[1]);
    }
}
