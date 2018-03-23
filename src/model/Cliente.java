package model;

public class Cliente {
    private Carrito carrito;
    private long cedula;
    private String nombre;
    private String telefono;

    public Cliente(long cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.carrito = new Carrito();
    }
    
    public long getCedula() {
        return cedula;
    }
    
    
    
    
    
}
