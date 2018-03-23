package model;

public abstract class Sala {
    private int numero;
    private Pelicula pelicula;
    
    public Sala(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
}
