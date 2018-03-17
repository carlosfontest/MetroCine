package structures;

import model.Sala;
import model.Sucursal;

public class NodoABB {
    private Object data;
    private NodoABB hijoIzq;
    private NodoABB hijoDer;
    
    public NodoABB(Object data) {
        this.data = data;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    
    public Object getData() {
        return data;
    }

    public void setData(int dato) {
        this.data = dato;
    }

    public NodoABB getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoABB hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoABB getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoABB hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    // Verifica si un nodo es Hoja
    public boolean EsHoja() {
        return (hijoIzq == null && hijoDer == null);
    }
    
    public void ImprimeNodo() {
        if(data instanceof Sucursal){
            System.out.println( ((Sucursal)data).getCodigo() );
        }else{
            System.out.println( ((Sala)data).getCodigo() );
        }
    }
}
