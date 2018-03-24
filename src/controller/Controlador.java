package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sucursal;
import structures.ArbolBB;
import view.Inicio;
import view.Loading;
import view.Principal;

public class Controlador {
    // Creación de los 2 árboles principales del proyecto
    public static ArbolBB sucursales = new ArbolBB();
    public static ArbolBB clientes = new ArbolBB();
    
    
    public void abrirPrincipal(){
        // Abre la ventana del JFrame Principal
        
        Principal principal = new Principal(this);
        principal.setVisible(true);
        
        // Creación de las sucursales iniciales
            Sucursal sucursal1 = new Sucursal("Country Club");
            this.crearSucursal(sucursal1, principal);
            Sucursal sucursal2 = new Sucursal("Altamira Hills");
            this.crearSucursal(sucursal2, principal);
            Sucursal sucursal3 = new Sucursal("La Lagunita");
            this.crearSucursal(sucursal3, principal);
        
        
    }
    
    private void agregarATablaSucursales(Principal principal, Sucursal sucursal, DefaultTableModel model){
        // Agrega la sala creada en la tabla
        
        model.addRow(new Object[]{
            sucursal.getCodigo(), sucursal.getUbicacion()
        });
    }
    
    public void cerrar(Principal principal){
        // Metodo para cerrar el sistema
        
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
    
    public void crearSucursal(Sucursal sucursal, Principal principal){
        // Crea una nueva sucursal y se inserta en el arbol "salas"
        
        // Inserto la nueva sucursal en el árbol y lo añado al comboBox de ventas
        sucursales.insertarSucursal(sucursales.getRoot(), sucursal);
        principal.comboSucursalesV.addItem(String.valueOf(sucursal.getCodigo()));
        principal.comboSucursalesSalas.addItem(String.valueOf(sucursal.getCodigo()));
        // Agrego la nueva sucursal a la tabla
        this.agregarATablaSucursales(principal, sucursal, (DefaultTableModel)principal.tableSucursales.getModel());
    }
    
    public void iniciarPrograma(){
        // Inicia el sistema
        
        Principal inicio = new Principal(this);
        inicio.setVisible(true);
        
        // SOLO ESTA ACA TEMPORALMENTE, EN REALIDAD VA EN ABRIR PRINCIPAL
            Sucursal sucursal1 = new Sucursal("Country Club");
            this.crearSucursal(sucursal1, inicio);
            Sucursal sucursal2 = new Sucursal("Altamira Hills");
            this.crearSucursal(sucursal2, inicio);
            Sucursal sucursal3 = new Sucursal("La Lagunita");
            this.crearSucursal(sucursal3, inicio);
        
        
    }
    
    public void iniciarSesion(Inicio inicio){
        // Validacion de usuario para acceder al sistema
        
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
    
    // INICIALIZACIÓN DE TABLAS
    public void iniciarTablaAdministrar(Principal principal){
    }
    public void iniciarTablaClientes(Principal principal){
    }
    public void iniciarTablaPeliculas(Principal principal){
    }
    public void iniciarTablaSalas(Principal principal){
    }
    public void iniciarTablaSucursales(Principal principal){
        // Tamaño de cada columna
        principal.tableSucursales.getColumnModel().getColumn(0).setPreferredWidth(150);
        principal.tableSucursales.getColumnModel().getColumn(1).setPreferredWidth(362);
        // Altura de cada renglón
        principal.tableSucursales.setRowHeight(19);
    }
    public void iniciarTablaTickets(Principal principal){
    }
    
    public void minimizar(Principal principal){
        // Permite minimizar la ventana del sistema
        
        principal.setState(view.Inicio.ICONIFIED);
    }
}
