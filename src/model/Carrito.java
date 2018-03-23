package model;

import structures.Cola;

public class Carrito {
    private Cola<OrdenCompra> ordenes;

    public Carrito() {
        this.ordenes = new Cola<>();
    }
}
