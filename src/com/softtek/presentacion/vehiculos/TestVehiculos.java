package com.softtek.presentacion.vehiculos;

import com.softtek.modelo.vehiculos.*;

public class TestVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo(10, 100);
        Coche c = new Coche(10, 100, "TOYOTA", "AE86");
        Avion a = new Avion(10, 100, "MAD");
        Barco b = new Barco(10, 100, "USA", true);
        Tren t = new Tren(10, 100, "1", true);

        System.out.println(v.toString());
        System.out.println(c.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());

        v.horn();
        c.horn();
        a.horn();
        b.horn();
        t.horn();
    }
}
