package model;

import controller.Controlador;
import java.util.Random;
import structures.ArbolBB;

public class Sucursal{
    private ArbolBB salas;
    private int codigo;
    private String ubicacion;

    public Sucursal(String ubicacion) {
        Random r = new Random();
        int code = 1001 + r.nextInt(8999);
        
        /*Si el arbol no está vacío, se crea un código aleatorio de 4 dígitos. Si está 
        vacío, el código de la raiz sera 5420, para intentar balancear el árbol*/
        if(Controlador.sucursales.getRoot() != null){
            //Se crea un código único
            while(Controlador.sucursales.estaCodigo(Controlador.sucursales.getRoot(), code)){
                code = 1001 + r.nextInt(8999);
            }
        }else{
            code = 5420;
        }
        
        this.codigo = code;
        this.ubicacion = ubicacion;
        this.salas = new ArbolBB();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public ArbolBB getSalas() {
        return salas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
