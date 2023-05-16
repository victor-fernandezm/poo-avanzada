package com.softtek.modelo.vehiculos;

public class Tren extends Vehiculo {

    public String linea;
    public boolean metro;
    public Tren(double speed, double maxSpeed, String linea, boolean metro) {
        super(speed, maxSpeed);
        this.linea = linea;
        this.metro = metro;
    }

    @Override
    public void horn() {
        if(this.metro) System.out.println("CORRESPONDENCIA CON... LINEAS [INSERTA LINEA AQUI] y [INSERTA OTRA LINEA AQUI]]");
        else System.out.println("CHOO, CHOO!");
    }
}
