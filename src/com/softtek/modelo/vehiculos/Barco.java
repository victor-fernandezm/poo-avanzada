package com.softtek.modelo.vehiculos;

public class Barco extends Vehiculo {

    public String puertoOrigen;
    public boolean portaavionesMilitar;
    public Barco(double speed, double maxSpeed, String puertoOrigen, boolean portaavionesMilitar) {
        super(speed, maxSpeed);
        this.puertoOrigen = puertoOrigen;
        this.portaavionesMilitar = portaavionesMilitar;
    }

    @Override
    public void horn() {
        if(this.portaavionesMilitar) System.out.println("(...) *silence*");
        else System.out.println("HONK!");
    }
}
