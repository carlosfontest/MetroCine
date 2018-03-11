package structures;

public class Pila <T>{
    private NodoSimple<T> first;

    // Constructor
    public Pila() {
        this.first = null;
    }
    
    // Verifica si la pila está vacía
    public boolean isEmpty(){
        return this.first == null;
    }
    
    // Ingresa elemento a la pila
    public void push(T dato){
        NodoSimple<T> n = new NodoSimple<>(dato);
        if (isEmpty()) {
            this.first = n;
        } else {
            n.setNext(this.first);
            this.first = n;
        }
    }
    
    // Saca al primero de la pila
    public T pop(){
        if (isEmpty()){
            return null;
        } else {
            NodoSimple<T> aux = this.first;
            this.first = aux.getNext();
            aux.setNext(null);
            return aux.getData();
        }
    }
    
    // Muestra quien está de primero en la pila
    public T peek() {
        if (isEmpty()){
            return null;
        } else {
            NodoSimple<T> aux = this.first;
            return aux.getData();
        }
    }  
    
    // Imprime la pila
    public void print(){
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            NodoSimple<T> aux = this.first;
            while (aux != null) {
                System.out.println(aux.getData());
                aux = aux.getNext();
            }
        }
    }
    
}