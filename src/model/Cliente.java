package model;

import view.Carrito;

public class Cliente {
    private view.Carrito carrito;
    private long cedula;
    private String nombre;
    private String telefono;

    public Cliente(long cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCarrito(view.Carrito carrito) {
        this.carrito = carrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Carrito getCarrito() {
        return carrito;
    }
    
}
