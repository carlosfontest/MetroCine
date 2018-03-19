package model;

public abstract class Ticket {
    protected Cliente cliente;
    protected Sala sala;
    protected long identificador;
    protected String fecha;

    public Ticket(Cliente cliente, Sala sala, long identificador, String fecha) {
        this.cliente = cliente;
        this.sala = sala;
        this.identificador = identificador;
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
