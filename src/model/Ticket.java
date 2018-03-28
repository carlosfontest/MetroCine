package model;

public abstract class Ticket {
    protected Cliente cliente;
    protected Sala sala;
    protected Sucursal sucursal;
    protected long identificador;
    protected String fecha;
    // Atributo auxiliar para poner el identificador de los Tickets
    private static long num = 0;

    public Ticket(Cliente cliente, Sucursal sucursal, Sala sala, String fecha) {
        num++;
        this.identificador = 1111111 + num;
        this.cliente = cliente;
        this.sala = sala;
        this.sucursal = sucursal;
        this.fecha = fecha;
    }
    
    public abstract double getPrecio();
    
    public long getIdentificador() {
        return identificador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

    
   
    
    
    
    
    
}
