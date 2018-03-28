package model;

public class Ticket3D extends Ticket {
    private static double precio;

    public Ticket3D(Cliente cliente, Sucursal sucursal, Sala sala, String fecha) {
        super(cliente, sucursal, sala, fecha);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public static void setPrecio(double precio) {
        Ticket3D.precio = precio;
    }
    
}
