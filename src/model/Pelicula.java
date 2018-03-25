package model;

public class Pelicula {
    private String nombre;
    private String genero;
    private String idioma;
    
    /*
     * Los géneros serán: Acción, Amor, Suspenso, Aventura
     * Los idiomas serán: Español, Inglés, Francés
    */
    
    public Pelicula(String nombre, String genero, String idioma) {
        this.nombre = nombre;
        this.genero = genero;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }
    
}
