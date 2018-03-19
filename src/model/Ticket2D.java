package model;

public class Ticket2D extends Ticket {
    private static double precio;

    public Ticket2D(Cliente cliente, Sala sala, long identificador, String fecha) {
        super(cliente, sala, identificador, fecha);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public static void setPrecio(double precio) {
        Ticket2D.precio = precio;
    }
    
}
