package model;

public class Ticket4DX extends Ticket{
    private static double precio;

    public Ticket4DX(Cliente cliente, Sala sala, long identificador, String fecha) {
        super(cliente, sala, identificador, fecha);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public static void setPrecio(double precio) {
        Ticket4DX.precio = precio;
    }
    
}
