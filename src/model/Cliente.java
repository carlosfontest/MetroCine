/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Carlos Fontes
 */
public class Cliente {
    private Carrito carrito;
    private long cedula;
    private String nombre;
    private String telefono;

    public Cliente(long cedula) {
        this.cedula = cedula;
    }

    public long getCedula() {
        return cedula;
    }
    
    
    
    
    
}
