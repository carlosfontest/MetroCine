package model;

public abstract class Ticket {
    protected Cliente cliente;
    protected Sala sala;
    protected Sucursal sucursal;
    protected long identificador;
    protected String fecha;
    protected String pelicula;
    // Atributo auxiliar para poner el identificador de los Tickets
    private static long num = 0;

    public Ticket(Cliente cliente, Sucursal sucursal, Sala sala, String fecha) {
        this.identificador = 1111111 + num;
        num++;
        this.cliente = cliente;
        this.sala = sala;
        this.sucursal = sucursal;
        this.fecha = fecha;
        this.pelicula = sala.getPelicula().getNombre();
    }

    public Ticket() {
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPelicula() {
        return pelicula;
    }
}
