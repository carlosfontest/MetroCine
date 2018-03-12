package model;

import view.Inicio;

/**
 * MetroCine. Software de ventas.
 * Estructura de Datos 1718-2
 * Universidad Metropolitana (Caracas, Venezuela)
 * @author Carlos Fontes & Rafael Quintero
 */
public class MetroCine {

    public MetroCine() {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        
        
        
    }
    
    public static void main(String[] args) {
        MetroCine app = new MetroCine();
    }
    
}
