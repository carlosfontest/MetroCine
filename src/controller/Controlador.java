package controller;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Sala2D;
import model.Sala3D;
import model.Sala4DX;
import model.Sucursal;
import structures.ArbolBB;
import view.*;

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
    
    private void actualizarTablaSucursales(Principal principal){
        // Obtenemos la cantidad de filas que hay en la tabla
        int filas = principal.tableSucursales.getRowCount();
        int aux = 0;
        // Modificamos el valos en la tabla
        aux = Integer.parseInt(String.valueOf( ((DefaultTableModel)principal.tableSucursales.getModel()).getValueAt(principal.tableSucursales.getSelectedRow(), 0) ) );
        principal.tableSucursales.setValueAt(sucursales.buscarSucursal(sucursales.getRoot(), aux).getUbicacion(), principal.tableSucursales.getSelectedRow(), 1);        
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
    
    public void crearSala(Principal principal){
        
        // Si es una sala 2D
        if(principal.radioBoton2D.isSelected()){
            if(principal.tableSucursales.getSelectedRow() != -1){
                principal.grupoBotones.clearSelection();
                // Guardamos en una variable entera el código de la sucursal seleccionada en la tabla
                int numSucursal = Integer.parseInt(String.valueOf( ((DefaultTableModel)principal.tableSucursales.getModel()).getValueAt(principal.tableSucursales.getSelectedRow(), 0) ) );
                principal.tableSucursales.clearSelection();
                
                // Si ya hay alguna sucursal
                if(!sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().isEmpty()){
                    // Se crea la sala
                    Sala2D sala = new Sala2D(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().size(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot()) + 1 );      
                    // Se inserta en el árbol
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Lo mismo que arriba
                    Sala2D sala = new Sala2D(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }       
            }else{
                JOptionPane.showMessageDialog(principal, "Seleccione a que sucursal va a pertenecer la sala", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Si es una sala 3D
        else if(principal.radioBoton3D.isSelected()){
            if(principal.tableSucursales.getSelectedRow() != -1){
                principal.grupoBotones.clearSelection();
                // Guardamos en una variable entera el código de la sucursal seleccionada en la tabla
                int numSucursal = Integer.parseInt(String.valueOf( ((DefaultTableModel)principal.tableSucursales.getModel()).getValueAt(principal.tableSucursales.getSelectedRow(), 0) ) );
                principal.tableSucursales.clearSelection();
                
                // Si ya hay alguna sucursal
                if(!sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().isEmpty()){
                    // Se crea la sala
                    Sala3D sala = new Sala3D(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().size(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot()) + 1 );      
                    // Se inserta en el árbol
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Lo mismo que arriba
                    Sala3D sala = new Sala3D(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(principal, "Seleccione a que sucursal va a pertenecer la sala", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Si es una sala 4DX
        else if(principal.radioBoton4DX.isSelected()){
            if(principal.tableSucursales.getSelectedRow() != -1){
                principal.grupoBotones.clearSelection();
                // Guardamos en una variable entera el código de la sucursal seleccionada en la tabla
                int numSucursal = Integer.parseInt(String.valueOf( ((DefaultTableModel)principal.tableSucursales.getModel()).getValueAt(principal.tableSucursales.getSelectedRow(), 0) ) );
                principal.tableSucursales.clearSelection();
                
                // Si ya hay alguna sucursal
                if(!sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().isEmpty()){
                    // Se crea la sala
                    Sala4DX sala = new Sala4DX(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().size(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot()) + 1 );      
                    // Se inserta en el árbol
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Lo mismo que arriba
                    Sala4DX sala = new Sala4DX(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(principal, "Seleccione a que sucursal va a pertenecer la sala", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Si no se seleccionó ningún tipo de Sala
        else{
            JOptionPane.showMessageDialog(principal, "Seleccione el tipo de sala que desee crear", "Error", JOptionPane.ERROR_MESSAGE);
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
        // Permitir la selección de solo una fila
        principal.tableAdmin.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Tamaño de cada columna
        principal.tableAdmin.getTableHeader().setReorderingAllowed(false);
        principal.tableAdmin.getTableHeader().setResizingAllowed(false);
        principal.tableAdmin.getColumnModel().getColumn(0).setPreferredWidth(170);
        principal.tableAdmin.getColumnModel().getColumn(1).setPreferredWidth(170);
        principal.tableAdmin.getColumnModel().getColumn(2).setPreferredWidth(187);
        // Altura de cada renglón
        principal.tableAdmin.setRowHeight(20);
    }
    public void iniciarTablaClientes(Principal principal){
        // Permitir la selección de solo una fila
        principal.tableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Denegar el acceso a modificar
        principal.tableClientes.getTableHeader().setReorderingAllowed(false);
        principal.tableClientes.getTableHeader().setResizingAllowed(false);
        // Tamaño de cada columna
        principal.tableClientes.getColumnModel().getColumn(0).setPreferredWidth(170);
        principal.tableClientes.getColumnModel().getColumn(1).setPreferredWidth(175);
        principal.tableClientes.getColumnModel().getColumn(2).setPreferredWidth(187);
        // Altura de cada renglón
        principal.tableClientes.setRowHeight(20);
    }
    public void iniciarTablaPeliculas(Principal principal){
        // Permitir la selección de solo una fila
        principal.tablePeli.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Denegar el acceso a modificar
        principal.tablePeli.getTableHeader().setReorderingAllowed(false);
        principal.tablePeli.getTableHeader().setResizingAllowed(false);
        // Tamaño de cada columna
        principal.tablePeli.getColumnModel().getColumn(0).setPreferredWidth(200);
        principal.tablePeli.getColumnModel().getColumn(1).setPreferredWidth(160);
        principal.tablePeli.getColumnModel().getColumn(2).setPreferredWidth(160);
        // Altura de cada renglón
        principal.tablePeli.setRowHeight(20);
    }
    public void iniciarTablaSalas(Principal principal){
        // Permitir la selección de solo una fila
        principal.tableSalas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Denegar el acceso a modificar
        principal.tableSalas.getTableHeader().setReorderingAllowed(false);
        principal.tableSalas.getTableHeader().setResizingAllowed(false);
        // Tamaño de cada columna
        principal.tableSalas.getColumnModel().getColumn(0).setPreferredWidth(140);
        principal.tableSalas.getColumnModel().getColumn(1).setPreferredWidth(150);
        principal.tableSalas.getColumnModel().getColumn(2).setPreferredWidth(232);
        // Altura de cada renglón
        principal.tableSalas.setRowHeight(20);
    }
    public void iniciarTablaSucursales(Principal principal){
        // Permitir la selección de solo una fila
        principal.tableSucursales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Denegar el acceso a modificar
        principal.tableSucursales.getTableHeader().setReorderingAllowed(false);
        principal.tableSucursales.getTableHeader().setResizingAllowed(false);
        // Tamaño de cada columna
        principal.tableSucursales.getColumnModel().getColumn(0).setPreferredWidth(155);
        principal.tableSucursales.getColumnModel().getColumn(1).setPreferredWidth(372);
        // Altura de cada renglón
        principal.tableSucursales.setRowHeight(20);
    }
    public void iniciarTablaTickets(Principal principal){
        // Permitir la selección de solo una fila
        principal.tableTickets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Denegar el acceso a modificar
        principal.tableTickets.getTableHeader().setReorderingAllowed(false);
        principal.tableTickets.getTableHeader().setResizingAllowed(false);
        // Tamaño de cada columna
        principal.tableTickets.getColumnModel().getColumn(0).setPreferredWidth(110);
        principal.tableTickets.getColumnModel().getColumn(1).setPreferredWidth(110);
        principal.tableTickets.getColumnModel().getColumn(2).setPreferredWidth(75);
        principal.tableTickets.getColumnModel().getColumn(3).setPreferredWidth(50);
        principal.tableTickets.getColumnModel().getColumn(4).setPreferredWidth(177);
        // Altura de cada renglón
        principal.tableTickets.setRowHeight(20);
    }
    
    public void minimizar(Principal principal){
        // Permite minimizar la ventana del sistema
        
        principal.setState(view.Inicio.ICONIFIED);
    }
    
    public void modificarUbicacionSucursal(Principal principal, String nuevaUbicacion, int numSucursal){
        sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).setUbicacion(nuevaUbicacion);
        this.actualizarTablaSucursales(principal);
    }
}
