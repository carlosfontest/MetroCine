package structures;

import javax.swing.JOptionPane;
import model.Pelicula;

public class ListaDoble <T>{
    private NodoDoble<T> head;
    private NodoDoble<T> tail;

    // Constructor
    public ListaDoble() {
        this.head = this.tail = null;
    }
    
    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return this.head == null;
    }
    
    // Devuelve el tamaño de la lista
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            NodoDoble<T> aux = this.head;
            int i = 0;
            while (aux != null) {
                aux = aux.getNext();
                i++;
            }
            return i;
        }
    }
    
    // Inserta un nodo de primero
    public void addFirst(T dato){
        NodoDoble<T> n = new NodoDoble<>(dato);
        if (isEmpty()) {
            this.head = this.tail = n;
        } else {
            n.setNext(this.head);
            this.head.setPrev(n);
            this.head = n;
        }
    }
    
    // Inserta un nodo de último
    public void addLast(T dato){
        NodoDoble<T> n = new NodoDoble<>(dato);
        if (isEmpty()) {
            this.head = this.tail = n;
        } else {
            n.setPrev(this.tail);
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    
    // Inserta un nodo en una posición
    public void add (T data, int i) {
        
        if (isEmpty() || i == 1) {
            this.addFirst(data);
        } else if (i == this.size()+1) {
            this.addLast(data);
        } else if (i > this.size() + 1 || i < 1) {
            System.out.println("Index Error [ListaDoble|Insertar]");
        } else {
            NodoDoble<T> n = new NodoDoble<>(data);
            NodoDoble<T> aux = this.head;
            int count = 0;
            while (count < i-1) {
                aux = aux.getNext();
                count++;
            }
            aux.getPrev().setNext(n);
            aux.setPrev(n);
            n.setNext(aux);
            n.setPrev(aux.getPrev());
        }
    }
    
    // Elimina el primer nodo 
    public T deleteFirst () {
        if (isEmpty()) {
            return null;
        } else if(this.size() == 1){
            NodoDoble<T> eliminado = this.head;
            this.head = this.tail = null;
            return eliminado.getData();
        } else {
            NodoDoble<T> eliminado = this.head;
            this.head = this.head.getNext();
            this.head.setPrev(null);
            eliminado.setNext(null);
            return eliminado.getData();
        }
    }
    
    // Elimina el último nodo
    public T deleteLast () {
        if (isEmpty()) {
            return null;
        } else if(this.size() == 1){
            NodoDoble<T> eliminado = this.tail;
            this.head = this.tail = null;
            return eliminado.getData();
        } else {
            NodoDoble<T> eliminado = this.tail;
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
            eliminado.setPrev(null);
            return eliminado.getData();
        }
    }
    
    // Elimina un nodo en una posición cualquiera
    public T delete (int i) {
        if (isEmpty()) {
            return null;
        } else if (i == 1) {
            return this.deleteFirst();
        } else if (i == this.size()) {
            return this.deleteLast();
        } else if (i > this.size() || i < 1) {
            System.out.println("Index Error [ListaDoble|Eliminar]");
            return null;
        } else {
            NodoDoble<T> aux = this.head;
            int count = 1;
            while (count < i-1) {
                aux = aux.getNext();
                count++;
            }
            NodoDoble<T> eliminado = aux.getNext();
            aux.setNext(eliminado.getNext());
            eliminado.getNext().setPrev(aux);
            return eliminado.getData();
        } 
    }

    // Devuelve la cabeza de la lista
    public NodoDoble<T> getHead() {
        return head;
    }

    // Devuelve la cola de la lista
    public NodoDoble<T> getTail() {
        return tail;
    }
    
    // Imprime la lista
    public void print(){
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            NodoDoble<T> aux = this.head;
            while (aux != null) {
                System.out.println(aux.getData());
                aux = aux.getNext();
            }
        }
    }
    
    // Imprime lista de Peliculas
    public void printPeliculas(){
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            NodoDoble<T> aux = this.head;
            while (aux != null) {
                System.out.println( ((Pelicula)aux.getData()).getNombre() );
                aux = aux.getNext();
            }
        }
    }
    
    // Devuelve una pelicula
    public Pelicula buscarPelicula(String nombre){
        Pelicula peli = null;
        
        NodoDoble<T> aux = this.head;
        while(aux != null){
            if( ((Pelicula)aux.getData()).getNombre().equals(nombre) ){
                peli = (Pelicula)aux.getData();
                aux = aux.getNext();
            }else{
                aux = aux.getNext();
            }
        }
        return peli;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
