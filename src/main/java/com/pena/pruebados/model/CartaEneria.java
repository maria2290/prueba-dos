package com.pena.pruebados.model;

public class CartaEneria  extends Carta {

    private static final double VALOR_BASE = 1000;
    private static final double RECARGO_ENERGIA = 0.20;
    private static final double LIMITE_ENERGIA = 3.0;

    private double cantidadEnergia;

    public void CartaEnergia() {
    }

    public void CartaEnergia(String nombre, int anioEdicion, int cantidad, double cantidadEnergia) {
        super(nombre, anioEdicion, cantidad);
        setCantidadEnergia(cantidadEnergia);
    }

    public double getCantidadEnergia() {
        return cantidadEnergia;
    }

    public void setCantidadEnergia(double cantidadEnergia) {
        if (cantidadEnergia <= 0) {
            throw new IllegalArgumentException("La cantidad de energía debe ser mayor que cero.");
        }
        this.cantidadEnergia = cantidadEnergia;
    }
}

