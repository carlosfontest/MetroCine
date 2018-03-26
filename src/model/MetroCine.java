package model;

import controller.Controlador;
/**
 * MetroCine. Software de ventas.
 * Estructura de Datos 1718-2
 * Universidad Metropolitana (Caracas, Venezuela)
 * @author Carlos Fontes & Rafael Quintero.
 */
public class MetroCine {

    public MetroCine() {
        Controlador controlador = new Controlador();
        controlador.iniciarPrograma();
    }
    
    public static void main(String[] args) {
        MetroCine metrocine = new MetroCine();
    }
    
}
