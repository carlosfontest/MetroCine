/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import structures.ArbolBB;

/**
 *
 * @author Carlos Fontes
 */
public class Sucursal {
    private ArbolBB salas;
    private int codigo;
    private String ubicacion;

    
    public Sucursal(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    
    
    
}
