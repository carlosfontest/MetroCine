package structures;

public class ListaSimple <T>{
    private NodoSimple<T> head;
    private NodoSimple<T> tail;

    // Constructor
    public ListaSimple() {
        this.head = this.tail = null;
    }
    
    // Verifica si la lista está vacía
    public boolean isEmpty(){
        return this.head == null;
    }
    
    // Devuelve el tamaño de la lista
    public int size() {
        int i = 0;
        if (isEmpty()) {
            return 0;
        } else {
            NodoSimple<T> aux = this.head;
            while(aux != null){
                aux = aux.getNext();
                i++;
            }
            return i;
        }
    }
    
    // Inserta un nodo de primero
    public void addFirst(T data) {
        NodoSimple<T> n = new NodoSimple<>(data);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            n.setNext(this.head);
            this.head = n;
        }
    }
    
    // Inserta un nodo de último
    public void addLast(T data) {
        NodoSimple<T> n = new NodoSimple<>(data);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    
    // Inserta un nodo en una posición cualquiera
    public void add(T data, int i) {
        if (isEmpty() || i == 1) {
            this.addFirst(data);
        } else if (i == this.size() + 1) {
            this.addLast(data);
        } else if (i > this.size() + 1 || i < 1) {
            System.out.println("Index Error [ListaSimple|Insertar]");
        } else {
            NodoSimple<T> n = new NodoSimple<>(data);
            NodoSimple<T> aux = this.head;
            int count = 1;
            while (count < i-1) {
                aux = aux.getNext();
                count++;
            }
            n.setNext(aux.getNext());
            aux.setNext(n);
        }
    }
    
    // Elimina el primer nodo
    public T deleteFirst() {
        if (isEmpty()){
            return null;
        } else {
            NodoSimple<T> eliminado = this.head;
            this.head = this.head.getNext();
            eliminado.setNext(null);
            return eliminado.getData();
        }
    }
    
    // Elimina el último nodo
    public T deleteLast() {
        if (isEmpty()) {
            return null;
        }else if(this.size() == 1){
            NodoSimple<T> aux = this.head;
            this.head = null;
            return aux.getData();        
        
        }else {
            NodoSimple<T> aux = this.head;
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            NodoSimple<T> eliminado = aux.getNext();
            aux.setNext(null);
            this.tail = aux;
            eliminado.setNext(null);
            return eliminado.getData();
        }
    }
    
    // Elimina un nodo en una posición cualquiera
    public T delete(int i) {
        if (isEmpty()) {
            return null;
        } else if (i == 1) {
            return this.deleteFirst();
        } else if (i == this.size()) {
            return this.deleteLast();
        } else if (i >= this.size() + 1 || i < 1) {
            System.out.println("Index Error [Lista Simple|Eliminar]");
            return null;
        } else{
            NodoSimple<T> aux = this.head;
            int count = 1;
            while (count < i-1) {
                aux = aux.getNext();
                count++;
            }
            NodoSimple<T> eliminado = aux.getNext();
            aux.setNext(eliminado.getNext());
            eliminado.setNext(null);
            return eliminado.getData();
        }
    }

    // Devuelve la cabeza de la lista
    public NodoSimple<T> getHead() {
        return head;
    }

    // Devuelve la cola de la lista
    public NodoSimple<T> getTail() {
        return tail;
    }
    
    // Imprime la lista
    public void print(){
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            NodoSimple<T> aux = this.head;
            while (aux != null) {
                System.out.println(aux.getData());
                aux = aux.getNext();
            }
        }
    }
    
}
