package model;

import structures.ListaDoble;

public class OrdenCompra {
    private ListaDoble<Ticket> tickets;
    private boolean pagada;
    private double precioTotal;
    private int numero;
    // Variable auxiliar para poner el número a las ordenes
    private static int variable = 1;
    public OrdenCompra(ListaDoble<Ticket> tickets) {
        this.numero = variable;
        variable++;
        this.tickets = tickets;
        this.pagada = false;
    }
    
    // Devuelve el precio Total dependiendo de si ya está pagada o no
    public double getPrecioTotal(){
        if(this.pagada){
            return this.precioTotal;
        }else{
            return calcularPrecioTotal();
        }
    }

    public ListaDoble<Ticket> getTickets() {
        return tickets;
    }

    public boolean isPagada() {
        return pagada;
    }
    
    // Calcula el precioTotal de una orden de compra
    public double calcularPrecioTotal(){
        if(this.tickets.getHead().getData() instanceof Ticket2D){
            return this.tickets.size()*((Ticket2D)this.tickets.getHead().getData()).getPrecio();
        }else if(this.tickets.getHead().getData() instanceof Ticket3D){
            return this.tickets.size()*((Ticket3D)this.tickets.getHead().getData()).getPrecio();
        }
        
        return this.tickets.size()*((Ticket4DX)this.tickets.getHead().getData()).getPrecio();
    }

    // Setea pagada una orden de compra y calcula el precio del momento en que fue pagada
    public void setPagada(){
        this.pagada = true;
        this.precioTotal = calcularPrecioTotal();
    }

    public int getNumero() {
        return numero;
    }
}
