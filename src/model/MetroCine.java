package model;

import javax.swing.JOptionPane;
import structures.ArbolBB;
import view.Inicio;
/**
 * MetroCine. Software de ventas.
 * Estructura de Datos 1718-2
 * Universidad Metropolitana (Caracas, Venezuela)
 * @author Carlos Fontes & Rafael Quintero
 */
public class MetroCine {

    public MetroCine() {
        //Inicio inicio = new Inicio();
        //inicio.setVisible(true);
        
        ArbolBB arbolSucursales = new ArbolBB();
        
        arbolSucursales.insertarSala(arbolSucursales.getRaiz(), new Sala(5, "1w") );
        arbolSucursales.insertarSala(arbolSucursales.getRaiz(), new Sala(84, "2w") );
        arbolSucursales.insertarSala(arbolSucursales.getRaiz(), new Sala(1, "3w") );
        arbolSucursales.insertarSala(arbolSucursales.getRaiz(), new Sala(55, "4w") );
        arbolSucursales.insertarSala(arbolSucursales.getRaiz(), new Sala(3, "5w") );
        
        arbolSucursales.enOrden(arbolSucursales.getRaiz());
       
       
       // SIEMPRE que se busca hay que hacer estre try cath, por si la posición no existe
        try {
            System.out.println( arbolSucursales.buscarSala(arbolSucursales.getRaiz(), 3).getNombre() );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Esa Sucursal/Sala no existe");
        }
        
        
        
        
        
    }
    
    public static void main(String[] args) {
        MetroCine app = new MetroCine();
    }
    
}
