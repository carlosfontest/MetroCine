package structures;

public class ListaCDoble <T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;

    // Constructor
    public ListaCDoble() {
        this.head = this.tail = null;
    }
    
    // Verifica si está vacía
    public boolean isEmpty(){
        return this.head == null;
    }
    
    // Devuelve el tamaño de la lista
    public int size() {
        int i = 0;
        if (isEmpty()) {
            return 0;
        } else {
            NodoDoble<T> aux = this.head;
            do {
                aux = aux.getNext();
                i++;
            } while(aux != this.head);
            return i;
        }
    }
    
    // Inserta un nodo de primero
    public void addFirst(T data){
        NodoDoble<T> n = new NodoDoble<>(data);
        if(isEmpty()){
            this.head = this.tail = n;
            this.head.setNext(this.tail);
            this.head.setPrev(this.tail);
            this.tail.setNext(this.head);
            this.tail.setPrev(this.head);
        }else{
            n.setNext(this.head);
            n.setPrev(this.tail);
            this.tail.setNext(n);
            this.head.setPrev(n);
            this.head = n;
        }
    }
    
    // Inserta un nodo de último
    public void addLast(T dato){
        NodoDoble<T> nodish = new NodoDoble<>(dato);
        if(isEmpty()){
            this.head = this.tail = nodish;
            this.head.setNext(this.tail);
            this.head.setPrev(this.tail);
            this.tail.setNext(this.head);
            this.tail.setPrev(this.head);
        }else{
            nodish.setNext(this.head);
            nodish.setPrev(this.tail);
            this.tail.setNext(nodish);
            this.head.setPrev(nodish);
            this.tail = nodish;
        } 
    }
    
    // Inserta un nodo en una posición
    public void add(T data, int i){
        if(isEmpty() || i == 1){
            addFirst(data);
        }else if(i == this.size()+1){
            addLast(data);
        }else if(i > this.size() || i < 1){
            System.out.println("Index Error [ListaCircularDoble|Insertar]");
        }else{
            NodoDoble<T> n = new NodoDoble<>(data);
            NodoDoble<T> aux = this.head;
            int count = 1;
            while(count < i){
                aux = aux.getNext();
                count++;
            }
            n.setNext(aux);
            n.setPrev(aux.getPrev());
            aux.getPrev().setNext(n);
            aux.setPrev(n);  
        }
    }
    
    // Elimina el primer nodo
    public T deleteFirst(){
        if(isEmpty()){
            return null;
        }else if(this.size() == 1){
            NodoDoble<T> eliminado = this.head;
            this.head = null;
            return eliminado.getData();   
        }else{
            NodoDoble<T> eliminado = this.head;
            this.head = this.head.getNext();
            this.tail.setNext(this.head);
            this.head.setPrev(this.tail);
            eliminado.setNext(null);
            return eliminado.getData();
        }
    }
    
    // Elimina el último nodo
    public T deleteLast(){
        if(isEmpty()){
            return null;
        }else if(this.size() == 1){
            NodoDoble<T> eliminado = this.head;
            this.head = null;
            return eliminado.getData();        
        }else{
            NodoDoble<T> eliminado = this.tail;
            this.tail = eliminado.getPrev();
            this.tail.setNext(this.head);
            this.head.setPrev(this.tail);
            eliminado.setPrev(null);
            return eliminado.getData();
        }
    }
    
    // Elimina un nodo en una posición cualquiera
    public T eliminar(int i){
        if(i <= 0 || i > this.size()){
            System.out.println("Index Error [ListaCircularDoble|Eliminar]");
            return null;
        }else if(i == this.size()){
            return deleteLast();
        }else if(i == 1){
            return deleteFirst();
        }else{
            NodoDoble<T> aux = this.head;
            int count = 0;
            while(count < i - 1){
                aux = aux.getNext();
                count++;
            }
            NodoDoble<T> eliminado = aux;
            eliminado.getPrev().setNext(eliminado.getNext());
            eliminado.getNext().setPrev(eliminado.getPrev());
            eliminado.setNext(null);
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
            do{
                System.out.println(aux.getData());
                aux = aux.getNext();
            }while(aux != this.head); 
        }
    }
    
}
