package com.softtek.modelo.vehiculos;

public class Avion extends Vehiculo {

    public String aeropuertoOrigen;
    public Avion(double speed, double maxSpeed, String aeropuertoOrigen) {
        super(speed, maxSpeed);
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    @Override
    public void horn() {
        System.out.println("FYOOM?");
    }
}
