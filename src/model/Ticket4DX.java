package model;

public class Ticket4DX extends Ticket{
    private static double precio;

    public Ticket4DX(Cliente cliente, Sucursal sucursal, Sala sala, String fecha) {
        super(cliente, sucursal, sala, fecha);
    }
    
    public Ticket4DX() {
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public static void setPrecio(double precio) {
        Ticket4DX.precio = precio;
    }
}
