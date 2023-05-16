package com.softtek.modelo.vehiculos;

public class Vehiculo {
    public double speed;
    public double maxSpeed;

    public Vehiculo(double speed, double maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public void horn() {
        System.out.println("[INSERT HORN SOUND HERE]");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
