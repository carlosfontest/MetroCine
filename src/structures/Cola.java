package structures;

import model.OrdenCompra;

public class Cola <T>{
    private NodoSimple<T> first;

    // Constructor
    public Cola() {
        this.first = null;
    }
    
    // Verifica si la cola está vacía
    public boolean isEmpty(){
        return this.first == null;
    }
    
    // Pone de ultimo en la cola
    public void enqueue(T dato){
        NodoSimple<T> n = new NodoSimple<>(dato);
        NodoSimple<T> aux = this.first;
        
        if(isEmpty()){
            this.first = n;
        }else{
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(n);
        } 
    }
    
    // Saca al primero de la cola
    public T dequeue(){
        if (isEmpty()){
            return null;
        } else {
            NodoSimple<T> aux = this.first;
            this.first = aux.getNext();
            aux.setNext(null);
            return aux.getData();
        }
    }
    
    // Muestra quien está de primero en la cola
    public T peek() {
        if (isEmpty()){
            return null;
        } else {
            NodoSimple<T> aux = this.first;
            return aux.getData();
        }
    }
    
    // Imprime la cola
    public void print(){
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            NodoSimple<T> aux = this.first;
            while (aux != null) {
                System.out.print(aux.getData() + " --> ");
                aux = aux.getNext();
            }
        }
    }
    
    //Permite buscar una orden de compra en la cola
    public OrdenCompra buscarOrden(int num){
        NodoSimple<T> aux = this.first;
        
        while(true){
            if(((OrdenCompra)aux.getData()).getNumero() == num){
                return (OrdenCompra) aux.getData();
            }
            this.enqueue(this.dequeue());
            aux = this.first;
        }
    }
    
    //Permite eliminar una orden de compra en la cola
    public OrdenCompra eliminarOrden(int num){
        NodoSimple<T> aux = this.first;
        
        while(true){
            if(((OrdenCompra)aux.getData()).getNumero() == num){
                return (OrdenCompra) this.dequeue();
            }
            this.enqueue(this.dequeue());
            aux = this.first;
        }
    }
    
    public int size(){
        int size = 0;
        Cola<T> aux = new Cola<>();
        
        //Vaciamos la cola para contarla
        while(!this.isEmpty()){
            aux.enqueue(this.dequeue());
            size++;
        }
        
        //Volvemos a la cola original
        while(!aux.isEmpty()){
            this.enqueue(aux.dequeue());
        }
        
        return size;
    }
    
    public NodoSimple<T> getFirst() {
        return first;
    }
}
