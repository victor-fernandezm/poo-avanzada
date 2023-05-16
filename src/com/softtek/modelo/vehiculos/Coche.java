package com.softtek.modelo.vehiculos;

public class Coche extends Vehiculo {

    public String marca;
    public String modelo;
    public Coche(double speed, double maxSpeed, String marca, String modelo) {
        super(speed, maxSpeed);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void horn() {
        System.out.println("BEEP, BEEP!");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca+modelo='" + marca + " " + modelo + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
