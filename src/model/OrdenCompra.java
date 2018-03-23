package model;

import structures.ListaDoble;

public class OrdenCompra {
    private ListaDoble<Ticket> tickets;
    private boolean pagada;
    private double precioTotal;

    public OrdenCompra(ListaDoble<Ticket> tickets) {
        this.tickets = tickets;
        this.pagada = false;
    }
    
    public double getPrecioTotal(){
        if(this.pagada){
            return this.precioTotal;
        }else{
            return calcularPrecioTotal();
        }
    }
    
    public double calcularPrecioTotal(){
        if(this.tickets.getHead().getData() instanceof Ticket2D){
            return this.tickets.size()*((Ticket2D)this.tickets.getHead().getData()).getPrecio();
        }else if(this.tickets.getHead().getData() instanceof Ticket3D){
            return this.tickets.size()*((Ticket3D)this.tickets.getHead().getData()).getPrecio();
        }
        
        return this.tickets.size()*((Ticket4DX)this.tickets.getHead().getData()).getPrecio();
    }

    public void setPagada(){
        this.pagada = true;
        this.precioTotal = calcularPrecioTotal();
    }
}
