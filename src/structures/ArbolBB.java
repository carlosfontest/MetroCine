package structures;

import model.Sala;
import model.Sucursal;

public class ArbolBB {
    private NodoABB raiz;

    // Constructor
    public ArbolBB() {
        this.raiz = null;
    }
    
    // Insertar nodo de tipo Sucursal. aux -> Raiz; sucur -> Sucursal a ingresar
    public void insertarSucursal(NodoABB aux, Sucursal sucur) {
        NodoABB nuevo = new NodoABB(sucur);
        if (aux == null) {
            this.raiz = nuevo;
        } else {
            if ( ((Sucursal)nuevo.getData()).getCodigo() < ((Sucursal)aux.getData()).getCodigo() ) {
                if (aux.getHijoIzq() == null) {
                    aux.setHijoIzq(nuevo);
                } else {
                    insertarSucursal(aux.getHijoIzq(), sucur);
                }
            } else if ( ((Sucursal)nuevo.getData()).getCodigo() > ((Sucursal)aux.getData()).getCodigo() ) {
                if (aux.getHijoDer() == null) {
                    aux.setHijoDer(nuevo);
                } else {
                    insertarSucursal(aux.getHijoDer(), sucur);
                }
            }
        }
    }
    
    // Insertar nodo de tipo Sala. aux -> Raiz; nuevo -> Nodo a ingresar
    public void insertarSala(NodoABB aux, Sala sala) {
        NodoABB nuevo = new NodoABB(sala);
        if (aux == null) {
            this.raiz = nuevo;
        } else {
            if ( ((Sala)nuevo.getData()).getCodigo() < ((Sala)aux.getData()).getCodigo() ) {
                if (aux.getHijoIzq() == null) {
                    aux.setHijoIzq(nuevo);
                } else {
                    insertarSala(aux.getHijoIzq(), sala);
                }
            } else if ( ((Sala)nuevo.getData()).getCodigo() > ((Sala)aux.getData()).getCodigo() ) {
                if (aux.getHijoDer() == null) {
                    aux.setHijoDer(nuevo);
                } else {
                    insertarSala(aux.getHijoDer(), sala);
                }
            }
        }
    }
    
    // Busca una Sucursal en el árbol. aux -> Raiz; código -> codigo de la sucursal a buscar
    public Sucursal buscarSucursal(NodoABB aux, int codigo) {
        if (aux != null) {
            if ( ((Sucursal)aux.getData()).getCodigo() == codigo) {
                return (Sucursal)aux.getData();
            } else if (codigo < ((Sucursal)aux.getData()).getCodigo() ) {
                return buscarSucursal(aux.getHijoIzq(), codigo);
            } else {
                return buscarSucursal(aux.getHijoDer(), codigo);
            }
        } else {
            System.out.println("cdcdcd");
            return null;
        }
    }
    
    // Busca una Sala en el árbol. aux -> Raiz; codigo -> código de la sucursal a buscar
    public Sala buscarSala(NodoABB aux, int codigo) {
        if (aux != null) {
            if ( ((Sala)aux.getData()).getCodigo() == codigo) {
                return (Sala)aux.getData();
            } else if (codigo < ((Sala)aux.getData()).getCodigo() ) {
                return buscarSala(aux.getHijoIzq(), codigo);
            } else {
                return buscarSala(aux.getHijoDer(), codigo);
            }
        } else {
            return null;
        }
    }
    
    // Imprime el arbol enOrden. aux -> Raiz
    public void enOrden(NodoABB aux) {
        if (aux != null) {
            enOrden(aux.getHijoIzq());
            aux.ImprimeNodo();
            enOrden(aux.getHijoDer());
        }
    }
    
    // Imprime el arbol preOrden. aux -> Raiz
    public void preOrden(NodoABB aux) {
        if (aux != null) {
            aux.ImprimeNodo();
            preOrden(aux.getHijoIzq());
            preOrden(aux.getHijoDer());
        }
    }
    
    // Imprime el arbol postOrden. aux -> Raiz
    public void postOrden(NodoABB aux) {
        if (aux != null) {
            postOrden(aux.getHijoIzq());
            postOrden(aux.getHijoDer());
            aux.ImprimeNodo();
        }
    }
    
    public NodoABB getRaiz() {
        return raiz;
    }
}
