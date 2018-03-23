package model;

import controller.Controlador;
/**
 * MetroCine. Software de ventas.
 * Estructura de Datos 1718-2
 * Universidad Metropolitana (Caracas, Venezuela)
 * @author Carlos Fontes & Rafael Quintero
 */
public class MetroCine {

    public MetroCine() {
        Controlador controlador = new Controlador();
        controlador.iniciarPrograma();
        Sucursal sucursal1 = new Sucursal("Tocuyito");
        Sucursal sucursal2 = new Sucursal("San Fernando de Apure");
        Sucursal sucursal3 = new Sucursal("Tucacas");
        
        System.out.println(sucursal1.getCodigo());
        System.out.println(sucursal2.getCodigo());
        System.out.println(sucursal3.getCodigo());
    }
    
    public static void main(String[] args) {
        MetroCine metrocine = new MetroCine();
    }
    
}
