package controller;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Pelicula;
import model.Sala;
import model.Sala2D;
import model.Sala3D;
import model.Sala4DX;
import model.Sucursal;
import structures.ArbolBB;
import structures.ListaDoble;
import view.*;

public class Controlador {
    // Creación de los 2 árboles principales del proyecto
    public static ArbolBB sucursales = new ArbolBB();
    public static ArbolBB clientes = new ArbolBB();
    public static ListaDoble<Pelicula> peliculas = new ListaDoble<>();
    
    
    public void abrirPrincipal(){
        // Abre la ventana del JFrame Principal
        
        Principal principal = new Principal(this);
        principal.setVisible(true);
        
        // Creación de las Sucursales iniciales
            Sucursal sucursal1 = new Sucursal("Country Club");
                this.crearSucursal(sucursal1, principal);
            Sucursal sucursal2 = new Sucursal("Altamira Hills");
                this.crearSucursal(sucursal2, principal);
            Sucursal sucursal3 = new Sucursal("La Lagunita");
                this.crearSucursal(sucursal3, principal);
                
        // Creacion de las Películas iniciales
            Pelicula pelicula1 = new Pelicula("Matrix", "Acción", "Español");
                peliculas.addLast(pelicula1);
                this.crearPelicula(pelicula1, principal);
            Pelicula pelicula2 = new Pelicula("El Entierro", "Aventura", "Inglés");
                peliculas.addLast(pelicula2);
                this.crearPelicula(pelicula2, principal);
            Pelicula pelicula3 = new Pelicula("El Padrino", "Suspenso", "Francés");
                peliculas.addLast(pelicula3);
                this.crearPelicula(pelicula3, principal);
            Pelicula pelicula4 = new Pelicula("CF&RQ: Power", "Amor", "Español");
                peliculas.addLast(pelicula4);
                this.crearPelicula(pelicula4, principal);
            Pelicula pelicula5 = new Pelicula("Now You See Me", "Acción", "Inglés");
                peliculas.addLast(pelicula5);
                this.crearPelicula(pelicula5, principal);
            
        // Creacion de las Salas iniciales
            Sala2D sala1 = new Sala2D(1);
                sala1.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala1, sucursal1, principal);
            Sala2D sala2 = new Sala2D(2);
                sala2.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala2, sucursal1, principal);
            Sala3D sala3 = new Sala3D(3);
                sala3.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala3, sucursal1, principal);
            Sala4DX sala4 = new Sala4DX(4);
                sala4.setPelicula(pelicula4);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala4, sucursal1, principal);
            Sala4DX sala5 = new Sala4DX(5);
                sala5.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala5, sucursal1, principal);
                
            Sala4DX sala6 = new Sala4DX(1);
                sala6.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala6, sucursal2, principal);
            Sala2D sala7 = new Sala2D(2);
                sala7.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala7, sucursal2, principal);
            Sala3D sala8 = new Sala3D(3);
                sala8.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala8, sucursal2, principal);
            Sala3D sala9 = new Sala3D(4);
                sala9.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala9, sucursal2, principal);
            Sala2D sala10 = new Sala2D(5);
                sala10.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala10, sucursal2, principal);
                
            Sala3D sala11 = new Sala3D(1);
                sala11.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala11, sucursal3, principal);
            Sala2D sala12 = new Sala2D(2);
                sala12.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala12, sucursal3, principal);
            Sala4DX sala13 = new Sala4DX(3);
                sala13.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala13, sucursal3, principal);
            Sala4DX sala14 = new Sala4DX(4);
                sala14.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala14, sucursal3, principal);
            Sala3D sala15 = new Sala3D(5);
                sala15.setPelicula(pelicula4);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala15, sucursal3, principal);
    }
    
    private void actualizarTablaSucursales(Principal principal){
        // Obtenemos la cantidad de filas que hay en la tabla
        int filas = principal.tableSucursales.getRowCount();
        int aux = 0;
        // Modificamos el valos en la tabla
        aux = Integer.parseInt(String.valueOf( ((DefaultTableModel)principal.tableSucursales.getModel()).getValueAt(principal.tableSucursales.getSelectedRow(), 0) ) );
        principal.tableSucursales.setValueAt(sucursales.buscarSucursal(sucursales.getRoot(), aux).getUbicacion(), principal.tableSucursales.getSelectedRow(), 1);        
    }
    
    private void agregarATablaSucursales(Sucursal sucursal, DefaultTableModel model){
        // Agrega la sala creada en la tabla
        
        model.addRow(new Object[]{
            sucursal.getCodigo(), sucursal.getUbicacion()
        });
    }
    
    public void botonAgregarPelicula(Principal principal){
        // Se pide el nombre por JOptionPane y se valida que el nombre sea adecuado (ni 0 caracteres, ni mayor a 20)
        String nombre = JOptionPane.showInputDialog("     Ingrese el nombre de la película\n        (No más de 20 caracteres)");
        try {
            if(nombre.length() > 20 || nombre.length() == 0){
                JOptionPane.showMessageDialog(principal, "Ingrese el nombre de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(principal, "Ingrese el nombre de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Declaramos los idiomas y los géneros
        String[] idiomas = {"Español", "Inglés", "Francés"};
        String[] generos = {"Acción", "Amor", "Suspenso", "Aventura"};
        // Guardamos las variables en un JOption con ComboBox
        String idioma = (String)JOptionPane.showInputDialog(principal, "   Elija el idioma de la Película", "Selección Idioma", JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
        String genero = (String)JOptionPane.showInputDialog(principal, "   Elija el género de la Película", "Selección Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]); 
        
        // Llamamos al metodo crearPelicula y añadimos la pelicula a la lista de peliculas
        Pelicula pelicula = new Pelicula(nombre, genero, idioma);
        peliculas.addLast(pelicula);
        this.crearPelicula(pelicula, principal);
    }
    
    public void botonCambiarPeliculasSalas(Principal principal){
        // Se verifica en que sucursal está
        if(String.valueOf(principal.comboSucursalesSalas.getSelectedItem()).equals("Sucursal")){
            JOptionPane.showMessageDialog(principal, "No se encuentra en ninguna Sucursal.\n             Seleccione una.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(principal.tableSalas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(principal, "No seleccionó ninguna Sala.\n           Seleccione una.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(String.valueOf(principal.comboPeliculasSa1.getSelectedItem()).equals("Películas") ){
            JOptionPane.showMessageDialog(principal, "Seleccione la película que desea poner.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            Sucursal sucursal = sucursales.buscarSucursal( sucursales.getRoot(), Integer.parseInt( String.valueOf( principal.comboSucursalesSalas.getSelectedItem() ) ) );
            Sala sala = sucursal.getSalas().buscarSala(sucursal.getSalas().getRoot(), principal.tableSalas.getSelectedRow() + 1);
            Pelicula pelicula = peliculas.buscarPelicula(String.valueOf(principal.comboPeliculasSa1.getSelectedItem()));
            // Modificamos la pelicula
            sala.setPelicula(pelicula);
            // Modificamos el valor en la tabla
            principal.tableSalas.setValueAt(sala.getPelicula().getNombre(), sala.getNumero() - 1, 2);
            
            principal.tableSalas.clearSelection();
        }
        
    }
    
    public void buscarPelicula(Principal principal){
        // Se verifica si se ingresó algún nombre
        if(principal.textFieldPeliculaP.getText().equals("Ingrese Película")){
            JOptionPane.showMessageDialog(principal, "Ingrese el nombre de la Película que desee buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Se verifica si el nombre ingresado pertenece al de alguna película
        String nombreBuscar = principal.textFieldPeliculaP.getText();
        if(peliculas.buscarPelicula(nombreBuscar) == null){
            JOptionPane.showMessageDialog(principal, "La Película que ingresó no existe", "Error", JOptionPane.ERROR_MESSAGE);
            principal.textFieldPeliculaP.setText("Ingrese Película");
            return;
        }
        
        for (int i = 0; i < principal.tablePeli.getRowCount(); i++) {
            if(String.valueOf(principal.tablePeli.getValueAt(i, 0)).equals(nombreBuscar)){
                principal.tablePeli.changeSelection(i, 1, false, false);
                principal.textFieldPeliculaP.setText("Ingrese Película");
                break;
            }
        }
    }
    
    public void cambiarSalaVentas(Principal principal){
        if(!String.valueOf(principal.comboSalasV.getSelectedItem()).equals("Sala")){
            int numSucursal = Integer.parseInt(String.valueOf(principal.comboSucursalesV.getSelectedItem()));
            Sucursal sucursal = sucursales.buscarSucursal(sucursales.getRoot(), numSucursal);
            int numSala = Integer.parseInt(String.valueOf(principal.comboSalasV.getSelectedItem()));
            
            principal.labelPelicula.setText(sucursal.getSalas().buscarSala(sucursal.getSalas().getRoot(), numSala).getPelicula().getNombre());
        }else{
            principal.labelPelicula.setText("-----------------------");
        }
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
    
    private void crearPelicula(Pelicula pelicula, Principal principal){
        // Creamos el objetos y llamamos al método mostrar en tabla
        this.mostrarPeliculasEnTablaPeliculas(pelicula, (DefaultTableModel)principal.tablePeli.getModel() );
        // Mostramos las peliculas en el comboBox de peliculas en la pestaña Salas
        principal.comboPeliculasSa1.addItem(pelicula.getNombre());
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
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
                }else{
                    // Lo mismo que arriba
                    Sala2D sala = new Sala2D(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
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
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
                }else{
                    // Lo mismo que arriba
                    Sala3D sala = new Sala3D(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
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
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
                }else{
                    // Lo mismo que arriba
                    Sala4DX sala = new Sala4DX(1);
                    sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().insertarSala(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot(), sala);
                    JOptionPane.showMessageDialog(principal, "Sala número " + sala.getNumero() + " creada con éxito", "Sala creada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(principal, "Recuerde indicar la película que se verá en la Sala.\n                  Vaya a la pestaña Salas");
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
    
    // Método que solo se utiliza para crear las salas que vienen desde el inicio del programa
    private void crearSalaInicio(Sala sala, Sucursal sucursal, Principal principal){
        // Se inserta la Sala en el árbol respectivo
        sucursal.getSalas().insertarSala(sucursal.getSalas().getRoot(), sala);
        // Se muestra las Salas en la tabla
        this.mostrarSalasEnTablaSalas(principal, sucursal.getCodigo(), true);
    }
    
    public void crearSucursal(Sucursal sucursal, Principal principal){
        // Crea una nueva sucursal y se inserta en el arbol "salas"
        
        // Inserto la nueva sucursal en el árbol y lo añado al comboBox de ventas
        sucursales.insertarSucursal(sucursales.getRoot(), sucursal);
        principal.comboSucursalesV.addItem(String.valueOf(sucursal.getCodigo()));
        principal.comboSucursalesSalas.addItem(String.valueOf(sucursal.getCodigo()));
        // Agrego la nueva sucursal a la tabla
        this.agregarATablaSucursales(sucursal, (DefaultTableModel)principal.tableSucursales.getModel());
    }
    
    public void iniciarPrograma(){
        // Inicia el sistema
        
        // CAMBIAR Principal POR Inicio
        Principal inicio = new Principal(this);
        inicio.setVisible(true);
        
        // SOLO ESTA ACA TEMPORALMENTE, EN REALIDAD VA EN ABRIR PRINCIPAL
            // Creación de las Sucursales iniciales
            Sucursal sucursal1 = new Sucursal("Country Club");
                this.crearSucursal(sucursal1, inicio);
            Sucursal sucursal2 = new Sucursal("Altamira Hills");
                this.crearSucursal(sucursal2, inicio);
            Sucursal sucursal3 = new Sucursal("La Lagunita");
                this.crearSucursal(sucursal3, inicio);
                
        // Creacion de las Películas iniciales
            Pelicula pelicula1 = new Pelicula("Matrix", "Acción", "Español");
                peliculas.addLast(pelicula1);
                this.crearPelicula(pelicula1, inicio);
            Pelicula pelicula2 = new Pelicula("El Entierro", "Aventura", "Inglés");
                peliculas.addLast(pelicula2);
                this.crearPelicula(pelicula2, inicio);
            Pelicula pelicula3 = new Pelicula("El Padrino", "Suspenso", "Francés");
                peliculas.addLast(pelicula3);
                this.crearPelicula(pelicula3, inicio);
            Pelicula pelicula4 = new Pelicula("CF&RQ: Power", "Amor", "Español");
                peliculas.addLast(pelicula4);
                this.crearPelicula(pelicula4, inicio);
            Pelicula pelicula5 = new Pelicula("Now You See Me", "Acción", "Inglés");
                peliculas.addLast(pelicula5);
                this.crearPelicula(pelicula5, inicio);
            
        // Creacion de las Salas iniciales
            Sala2D sala1 = new Sala2D(1);
                sala1.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala1, sucursal1, inicio);
            Sala2D sala2 = new Sala2D(2);
                sala2.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala2, sucursal1, inicio);
            Sala3D sala3 = new Sala3D(3);
                sala3.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala3, sucursal1, inicio);
            Sala4DX sala4 = new Sala4DX(4);
                sala4.setPelicula(pelicula4);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala4, sucursal1, inicio);
            Sala4DX sala5 = new Sala4DX(5);
                sala5.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala5, sucursal1, inicio);
                
            Sala4DX sala6 = new Sala4DX(1);
                sala6.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala6, sucursal2, inicio);
            Sala2D sala7 = new Sala2D(2);
                sala7.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala7, sucursal2, inicio);
            Sala3D sala8 = new Sala3D(3);
                sala8.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala8, sucursal2, inicio);
            Sala3D sala9 = new Sala3D(4);
                sala9.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala9, sucursal2, inicio);
            Sala2D sala10 = new Sala2D(5);
                sala10.setPelicula(pelicula1);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala10, sucursal2, inicio);
                
            Sala3D sala11 = new Sala3D(1);
                sala11.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala11, sucursal3, inicio);
            Sala2D sala12 = new Sala2D(2);
                sala12.setPelicula(pelicula2);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala12, sucursal3, inicio);
            Sala4DX sala13 = new Sala4DX(3);
                sala13.setPelicula(pelicula5);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala13, sucursal3, inicio);
            Sala4DX sala14 = new Sala4DX(4);
                sala14.setPelicula(pelicula3);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala14, sucursal3, inicio);
            Sala3D sala15 = new Sala3D(5);
                sala15.setPelicula(pelicula4);  // Seteamos la pelicula que tendrá la Sala
                this.crearSalaInicio(sala15, sucursal3, inicio);
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
        ((DefaultTableModel)principal.tableSalas.getModel()).setRowCount(0);
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
    
    public void modificarPelicula(Principal principal){
        // Se crea los Strings para los combosBox del JOption con comboBox
        String[] idiomas = {"Español", "Inglés", "Francés"};
        String[] generos = {"Acción", "Amor", "Suspenso", "Aventura"};
        
        // Se valida si no se seleccionó ninguna pelicula, si no se seleccionó que se va a modificar y finalmente se cambia
        String modificar = String.valueOf(principal.comboModificarPelicula.getSelectedItem());
        if(principal.tablePeli.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(principal, "Seleccione la Película que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Modificar")){
            JOptionPane.showMessageDialog(principal, "Seleccione que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Género")){
            String peliculaModificar = String.valueOf( ((DefaultTableModel)principal.tablePeli.getModel()).getValueAt(principal.tablePeli.getSelectedRow(), 0) );
            String genero = (String)JOptionPane.showInputDialog(principal, "Seleccione el nuevo género de la Película", "Modificación Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            peliculas.buscarPelicula(peliculaModificar).setGenero(genero);
            principal.tablePeli.setValueAt(peliculas.buscarPelicula(peliculaModificar).getGenero() , principal.tablePeli.getSelectedRow(), 1);
            principal.tablePeli.clearSelection();
            principal.comboModificarPelicula.setSelectedIndex(0);
        }else if(modificar.equals("Idioma")){
            String peliculaModificar = String.valueOf( ((DefaultTableModel)principal.tablePeli.getModel()).getValueAt(principal.tablePeli.getSelectedRow(), 0) );
            String idioma = (String)JOptionPane.showInputDialog(principal, "Seleccione el nuevo idioma de la Película", "Modificación Idioma", JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
            peliculas.buscarPelicula(peliculaModificar).setIdioma(idioma);
            principal.tablePeli.setValueAt(peliculas.buscarPelicula(peliculaModificar).getIdioma(), principal.tablePeli.getSelectedRow(), 2);
            principal.tablePeli.clearSelection();
            principal.comboModificarPelicula.setSelectedIndex(0);
        }
    }
    
    public void modificarUbicacionSucursal(Principal principal, String nuevaUbicacion, int numSucursal){
        sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).setUbicacion(nuevaUbicacion);
        this.actualizarTablaSucursales(principal);
    }
    
    public void mostrarPeliculasEnComboPeliculas(Principal principal){
        // Valida todo lo necesario para mostar las salas y peliculas
        principal.comboSalasV.removeAllItems();
        principal.comboSalasV.addItem("Sala");
        if(String.valueOf(principal.comboSucursalesV.getSelectedItem()).equals("Sucursal")){
            principal.comboSalasV.removeAllItems();
            principal.comboSalasV.addItem("Sala");
            principal.labelPelicula.setText("-----------------------");
        }else if(String.valueOf(principal.comboSalasV.getSelectedItem()).equals("Sala") && String.valueOf(principal.comboSucursalesV.getSelectedItem()).equals("Sucursal")){
            principal.labelPelicula.setText("-----------------------");
        }else if(!String.valueOf(principal.comboSucursalesV.getSelectedItem()).equals("Sucursal") && String.valueOf(principal.comboSalasV.getSelectedItem()).equals("Sala")){
            principal.comboSalasV.removeAllItems();
            principal.comboSalasV.addItem("Sala");
            principal.labelPelicula.setText("-----------------------");
            int numSucursal = Integer.parseInt(String.valueOf(principal.comboSucursalesV.getSelectedItem()));
            Sucursal sucursal = sucursales.buscarSucursal(sucursales.getRoot(), numSucursal);
            
            for (int i = 0; i < sucursal.getSalas().size(sucursal.getSalas().getRoot()); i++) {
                principal.comboSalasV.addItem(String.valueOf(i+1));
            }
        }
    }
    
    private void mostrarPeliculasEnTablaPeliculas(Pelicula pelicula, DefaultTableModel modelo){
        modelo.addRow(new Object[]{
            pelicula.getNombre(), pelicula.getGenero(), pelicula.getIdioma()
        });
    }
    
    public void mostrarSalasEnTablaSalas(Principal principal, int numSucursal, boolean flag){
        // Se crea una Sucursal aux para ahorrar código
        Sucursal aux = sucursales.buscarSucursal(sucursales.getRoot(), numSucursal);
        // Se determina la cantidad de salas que hay en la sucursal seleccionada para así saber cuantas filas habrán
        int cantFilas = sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().size(sucursales.buscarSucursal(sucursales.getRoot(), numSucursal).getSalas().getRoot());
        DefaultTableModel model = (DefaultTableModel)principal.tableSalas.getModel();
        
        
        // Agregamos las salas a la Tabla
        for (int i = 0; i < cantFilas; i++) {
            // Si ya tienen nombre puesto
            if(aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1).getPelicula() != null){
                if( aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala2D){
                    model.addRow(new Object[]{
                        i+1, "2D", aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1).getPelicula().getNombre()
                    });  
                }else if(aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala3D){
                    model.addRow(new Object[]{
                        i+1, "3D", aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1).getPelicula().getNombre()
                    });
                }else if(aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala4DX){
                    model.addRow(new Object[]{
                        i+1, "4DX" , aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1).getPelicula().getNombre()
                    });
                }
            }else{
                if( aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala2D){
                    model.addRow(new Object[]{
                        i+1, "2D", "--------------------------------"
                    });  
                }else if(aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala3D){
                    model.addRow(new Object[]{
                        i+1, "3D", "--------------------------------"
                    });
                }else if(aux.getSalas().buscarSala(aux.getSalas().getRoot(), i+1) instanceof Sala4DX){
                    model.addRow(new Object[]{
                        i+1, "4DX" , "--------------------------------"
                    });
                }
            }
        }
        
        if(flag){
            this.iniciarTablaSalas(principal);
        }
        
        
    }
    
    
}
