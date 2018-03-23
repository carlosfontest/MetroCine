package model;

import static controller.Controlador.sucursales;
import java.util.Random;
import structures.ArbolBB;

public class Sucursal{
    private ArbolBB salas;
    private int codigo;
    private String ubicacion;

    public Sucursal(String ubicacion) {
        Random r = new Random();
        int codigo = 1001 + r.nextInt(8999);
        
        //Se crea un código único
        while(sucursales.estaCodigo(sucursales.getRoot(), codigo)){
            codigo = 1001 + r.nextInt(8999);
        }
        
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        
        //Se inserta la nueva sucursal en el arbol de sucursales
        sucursales.insertarSucursal(sucursales.getRoot(), this);
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    
    
    
}
