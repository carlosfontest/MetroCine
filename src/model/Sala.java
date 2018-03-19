package model;

public abstract class Sala {
    private int numero;
    private String nombre;
    
    public Sala(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
