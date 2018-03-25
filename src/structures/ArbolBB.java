package structures;

import model.Cliente;
import model.Sala;
import model.Sucursal;
import model.Ticket;

public class ArbolBB {
    private NodoABB root;

    // Constructor
    public ArbolBB() {
        this.root = null;
    }
    
    public boolean isEmpty(){
        return this.root == null;
    }
    
    // Insertar nodo de tipo Sucursal. aux -> Raiz; sucur -> Sucursal a ingresar
    public void insertarSucursal(NodoABB aux, Sucursal sucur) {
        NodoABB nuevo = new NodoABB(sucur);
        if (aux == null) {
            this.root = nuevo;
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
    
    // Insertar nodo de tipo Sala. aux -> Raiz; sala -> Sala a ingresar
    public void insertarSala(NodoABB aux, Sala sala) {
        NodoABB nuevo = new NodoABB(sala);
        if (aux == null) {
            this.root = nuevo;
        } else {
            if ( ((Sala)nuevo.getData()).getNumero()< ((Sala)aux.getData()).getNumero() ) {
                if (aux.getHijoIzq() == null) {
                    aux.setHijoIzq(nuevo);
                } else {
                    insertarSala(aux.getHijoIzq(), sala);
                }
            } else if ( ((Sala)nuevo.getData()).getNumero()> ((Sala)aux.getData()).getNumero() ) {
                if (aux.getHijoDer() == null) {
                    aux.setHijoDer(nuevo);
                } else {
                    insertarSala(aux.getHijoDer(), sala);
                }
            }
        }
    }
    
    // Insertar nodo de tipo Cliente. aux -> Raiz; cliente -> Cliente a ingresar
    public void insertarCliente(NodoABB aux, Cliente cliente) {
        NodoABB nuevo = new NodoABB(cliente);
        if (aux == null) {
            this.root = nuevo;
        } else {
            if ( ((Cliente)nuevo.getData()).getCedula()< ((Cliente)aux.getData()).getCedula() ) {
                if (aux.getHijoIzq() == null) {
                    aux.setHijoIzq(nuevo);
                } else {
                    insertarCliente(aux.getHijoIzq(), cliente);
                }
            } else if ( ((Cliente)nuevo.getData()).getCedula() > ((Cliente)aux.getData()).getCedula() ) {
                if (aux.getHijoDer() == null) {
                    aux.setHijoDer(nuevo);
                } else {
                    insertarCliente(aux.getHijoDer(), cliente);
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
            return null;
        }
    }
    
    // Busca un Ticket en el árbol. aux -> Raiz; identificador -> identificador del Ticket a buscar
    public Ticket buscarTicket(NodoABB aux, int identificador) {
        if (aux != null) {
            if ( ((Ticket)aux.getData()).getIdentificador()== identificador) {
                return (Ticket)aux.getData();
            } else if (identificador < ((Ticket)aux.getData()).getIdentificador() ) {
                return buscarTicket(aux.getHijoIzq(), identificador);
            } else {
                return buscarTicket(aux.getHijoDer(), identificador);
            }
        } else {
            return null;
        }
    }
    
    // Busca un Cliente en el árbol. aux -> Raiz; cedula -> cedula del cliente a buscar
    public Cliente buscarCliente(NodoABB aux, int cedula) {
        if (aux != null) {
            if ( ((Cliente)aux.getData()).getCedula() == cedula) {
                return (Cliente)aux.getData();
            } else if (cedula < ((Cliente)aux.getData()).getCedula()) {
                return buscarCliente(aux.getHijoIzq(), cedula);
            } else {
                return buscarCliente(aux.getHijoDer(), cedula);
            }
        } else {
            return null;
        }
    }
    
    // Devuelve un booleano que dice si el código de la sucursal está en el árbol o no
    public boolean estaCodigo(NodoABB aux, int data) {
        if (aux != null) {
            if (((Sucursal)aux.getData()).getCodigo() == data) {
                return true;
            } else {
                return (estaCodigo(aux.getHijoIzq(), data) || estaCodigo(aux.getHijoDer(), data));
            }
        } else {
            return false;
        }
    }
    
    public int size(NodoABB aux){
        if(aux!=null){
            return (1 + size(aux.getHijoDer()) + size(aux.getHijoIzq()));
        }else{
            return 0;
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
    
    public NodoABB getRoot() {
        return root;
    }
}
