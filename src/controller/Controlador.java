package controller;

import javax.swing.JOptionPane;
import model.Sucursal;
import structures.ArbolBB;
import view.Inicio;
import view.Loading;
import view.Principal;

public class Controlador {
    public static ArbolBB sucursales = new ArbolBB();
    public static ArbolBB clientes = new ArbolBB();
    
    // Abre la ventana del JFrame Principal
    public void abrirPrincipal(){
        Principal principal = new Principal(this);
        principal.setVisible(true);
        principal.setTitle("MetroCine");
    }
    
    // Metodo para cerrar el sistema
    public void cerrar(Principal principal){
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el sistema?", "Salir", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(principal, e);
        }
    }
    
    // Crea una nueva sucursal y se inserta en el arbol "salas"
    public void crearSucursal(String ubicacion){
        sucursales.insertarSucursal(sucursales.getRoot(), new Sucursal(ubicacion));
    }
    
    // Inicia el sistema
    public void iniciarPrograma(){
        Principal inicio = new Principal(this);
        inicio.setVisible(true);
    }
    
    // Validacion de usuario para acceder al sistema
    public void iniciarSesion(Inicio inicio){
        if(inicio.jTextFieldUsuario.getText().trim().equals("admin") && inicio.jPasswordField.getText().equals("admin")){
            // Inicio frame Loading
            Loading loading = new Loading();
            
            Runnable miRunnable = new Runnable(){
            @Override
            public void run(){
                try
                {
                    // Si no hay ningun error carga el juego
                    inicio.dispose();
                    loading.setVisible(true);
                    for (int i = 0; i <= 100; i++) {
                        // Tiempo que tardará la carga
                        Thread.sleep(13);
                        loading.loadingBar.setValue(i);

                        if(i==100){
                            Thread.sleep(1000);
                        }
                    }
                    loading.dispose();
                    abrirPrincipal();
                }catch (InterruptedException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                }
            };
            Thread hilo = new Thread (miRunnable);
            hilo.start();
            
            // Fin frame loading
        }else{
            JOptionPane.showMessageDialog(inicio, "Usuario o contraseña inválidos");
            inicio.jTextFieldUsuario.setText("Ingrese su usuario");
            inicio.jPasswordField.setText("jPasswordField1");
        }
    }
    
    // Permite minimizar la ventana del sistema
    public void minimizar(Principal principal){
        principal.setState(view.Inicio.ICONIFIED);
    }
}
