package structures;

public class NodoSimple <T>{
    private T data;
    private NodoSimple<T> next;
    
    public NodoSimple (T dato){
        this.data = dato;
        this.next = null;
    }

    public T getData(){
        return data;
    }
    
    public NodoSimple<T> getNext(){
        return next;
    }

    public void setData(T dato){
        this.data = dato;
    }

    public void setNext(NodoSimple<T> next){
        this.next = next;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
