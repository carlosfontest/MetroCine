package model;

public class Ticket2D extends Ticket {
    private static double precio;

    public Ticket2D(Cliente cliente, Sucursal sucursal, Sala sala, String fecha) {
        super(cliente, sucursal, sala, fecha);
    }
    
    public Ticket2D() {
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public static void setPrecio(double precio) {
        Ticket2D.precio = precio;
    }
}
