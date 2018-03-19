package view;

import controller.Controlador;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {
    Controlador controlador;

    public Principal(Controlador controlador) {
        this.controlador = controlador;
        UIManager.put("TabbedPane.selected", new Color(57,62,70));
        initComponents();
        jTabbedPane2.setForeground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("../images/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelVentas = new javax.swing.JPanel();
        textFieldClienteV = new javax.swing.JTextField();
        botonBuscarClienteV = new javax.swing.JButton();
        comboClientesV = new javax.swing.JComboBox<>();
        textFieldPeliculaV = new javax.swing.JTextField();
        comboPeliculasV = new javax.swing.JComboBox<>();
        botonBuscarPeliculaV = new javax.swing.JButton();
        botonAgregarClienteV = new javax.swing.JButton();
        spinnerTicketsV = new javax.swing.JSpinner();
        labelCantidadTicketsV = new javax.swing.JLabel();
        comboSalasV = new javax.swing.JComboBox<>();
        comboSucursalesV = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        labelPrecioV = new javax.swing.JLabel();
        textFieldPrecioV = new javax.swing.JTextField();
        botonAgregarCarritoV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelImagenPelicula = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelPeliculas = new javax.swing.JPanel();
        comboGeneroP = new javax.swing.JComboBox<>();
        comboIdiomaP = new javax.swing.JComboBox<>();
        comboSucursalP = new javax.swing.JComboBox<>();
        comboSalaP = new javax.swing.JComboBox<>();
        botonRadioAZ = new javax.swing.JRadioButton();
        botonRadioZA = new javax.swing.JRadioButton();
        textFieldPeliculaP = new javax.swing.JTextField();
        botonBuscarPeliculaP = new javax.swing.JButton();
        botonModificarPeliculaP = new javax.swing.JButton();
        botonAgregarPeliculaP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        panelClientes = new javax.swing.JPanel();
        botonCarritoC = new javax.swing.JButton();
        botonRegistrarC = new javax.swing.JButton();
        textFieldCedulaC = new javax.swing.JTextField();
        botonBuscarClienteC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableC = new javax.swing.JTable();
        panelSalas = new javax.swing.JPanel();
        botonCambiarPeliculaSa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSa = new javax.swing.JTable();
        comboPeliculasSa = new javax.swing.JComboBox<>();
        panelSucursales = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSu = new javax.swing.JTable();
        botonAgregarSucursalSu = new javax.swing.JButton();
        botonModificarSucursalSu = new javax.swing.JButton();
        botonAgregarSalasSu = new javax.swing.JButton();
        panelTickets = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableT = new javax.swing.JTable();
        botonCambiarPrecio2DT = new javax.swing.JButton();
        botonCambiarPrecio3DT = new javax.swing.JButton();
        botonCambiarPrecio4DT = new javax.swing.JButton();
        textFieldPrecio2DT = new javax.swing.JTextField();
        textFieldPrecio3DT = new javax.swing.JTextField();
        textFieldPrecio4DT = new javax.swing.JTextField();
        label2DT = new javax.swing.JLabel();
        label3DT = new javax.swing.JLabel();
        label4DT = new javax.swing.JLabel();
        label$1T = new javax.swing.JLabel();
        label$2T = new javax.swing.JLabel();
        label$3T = new javax.swing.JLabel();
        panelAdministrar = new javax.swing.JPanel();
        labelSalasFrecuentesA = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableA = new javax.swing.JTable();
        labelIngresosA = new javax.swing.JLabel();
        textFieldIngresosA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(720, 400));

        panelVentas.setBackground(new java.awt.Color(57, 62, 70));
        panelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldClienteV.setBackground(new java.awt.Color(51, 51, 51));
        textFieldClienteV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldClienteV.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClienteV.setText("Ingrese Cédula");
        textFieldClienteV.setBorder(null);
        textFieldClienteV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldClienteVFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldClienteVFocusLost(evt);
            }
        });
        textFieldClienteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldClienteVActionPerformed(evt);
            }
        });
        panelVentas.add(textFieldClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 76, 107, 26));

        botonBuscarClienteV.setBackground(new java.awt.Color(38, 38, 38));
        botonBuscarClienteV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarClienteV.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarClienteV.setText("Buscar");
        botonBuscarClienteV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        botonBuscarClienteV.setFocusPainted(false);
        botonBuscarClienteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteVActionPerformed(evt);
            }
        });
        panelVentas.add(botonBuscarClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, 30));

        comboClientesV.setBackground(new java.awt.Color(153, 153, 153));
        comboClientesV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboClientesV.setForeground(new java.awt.Color(255, 255, 255));
        comboClientesV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));
        comboClientesV.setFocusable(false);
        panelVentas.add(comboClientesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, 107, 26));

        textFieldPeliculaV.setBackground(new java.awt.Color(51, 51, 51));
        textFieldPeliculaV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPeliculaV.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPeliculaV.setText("Ingrese Película");
        textFieldPeliculaV.setBorder(null);
        textFieldPeliculaV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPeliculaVFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPeliculaVFocusLost(evt);
            }
        });
        textFieldPeliculaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPeliculaVActionPerformed(evt);
            }
        });
        panelVentas.add(textFieldPeliculaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 75, 107, 26));

        comboPeliculasV.setBackground(new java.awt.Color(153, 153, 153));
        comboPeliculasV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboPeliculasV.setForeground(new java.awt.Color(255, 255, 255));
        comboPeliculasV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas" }));
        comboPeliculasV.setFocusable(false);
        panelVentas.add(comboPeliculasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 105, 107, 26));

        botonBuscarPeliculaV.setBackground(new java.awt.Color(38, 38, 38));
        botonBuscarPeliculaV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarPeliculaV.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarPeliculaV.setText("Buscar");
        botonBuscarPeliculaV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        botonBuscarPeliculaV.setFocusPainted(false);
        botonBuscarPeliculaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPeliculaVActionPerformed(evt);
            }
        });
        panelVentas.add(botonBuscarPeliculaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 80, 30));

        botonAgregarClienteV.setBackground(new java.awt.Color(38, 38, 38));
        botonAgregarClienteV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarClienteV.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarClienteV.setText("Agregar Nuevo Cliente");
        botonAgregarClienteV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        botonAgregarClienteV.setFocusPainted(false);
        panelVentas.add(botonAgregarClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 180, 30));

        spinnerTicketsV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        panelVentas.add(spinnerTicketsV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 26));

        labelCantidadTicketsV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labelCantidadTicketsV.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidadTicketsV.setText("Cantidad");
        panelVentas.add(labelCantidadTicketsV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        comboSalasV.setBackground(new java.awt.Color(153, 153, 153));
        comboSalasV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSalasV.setForeground(new java.awt.Color(255, 255, 255));
        comboSalasV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salas" }));
        comboSalasV.setFocusable(false);
        panelVentas.add(comboSalasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 26));

        comboSucursalesV.setBackground(new java.awt.Color(153, 153, 153));
        comboSucursalesV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSucursalesV.setForeground(new java.awt.Color(255, 255, 255));
        comboSucursalesV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucursales" }));
        comboSucursalesV.setFocusable(false);
        panelVentas.add(comboSucursalesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 26));
        panelVentas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 327, 60, 10));

        labelPrecioV.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        labelPrecioV.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecioV.setText("Precio Total");
        panelVentas.add(labelPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        textFieldPrecioV.setEditable(false);
        textFieldPrecioV.setBackground(new java.awt.Color(51, 51, 51));
        textFieldPrecioV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPrecioV.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPrecioV.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldPrecioV.setText("Precio");
        textFieldPrecioV.setBorder(null);
        panelVentas.add(textFieldPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 307, 60, 26));

        botonAgregarCarritoV.setBackground(new java.awt.Color(38, 38, 38));
        botonAgregarCarritoV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarCarritoV.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarCarritoV.setText("Agregar al carrito");
        botonAgregarCarritoV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30)));
        botonAgregarCarritoV.setFocusPainted(false);
        panelVentas.add(botonAgregarCarritoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 305, 140, 30));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");
        panelVentas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 7, -1, -1));
        panelVentas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 130, 10));
        panelVentas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 108, 10));

        javax.swing.GroupLayout panelImagenPeliculaLayout = new javax.swing.GroupLayout(panelImagenPelicula);
        panelImagenPelicula.setLayout(panelImagenPeliculaLayout);
        panelImagenPeliculaLayout.setHorizontalGroup(
            panelImagenPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelImagenPeliculaLayout.setVerticalGroup(
            panelImagenPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        panelVentas.add(panelImagenPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, 170));
        panelVentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 101, 107, 10));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, 70));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 250, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 90));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 40));

        jTabbedPane2.addTab("Ventas", panelVentas);

        comboGeneroP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboIdiomaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSucursalP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSalaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        grupoBotones.add(botonRadioAZ);
        botonRadioAZ.setText("A-Z");

        grupoBotones.add(botonRadioZA);
        botonRadioZA.setText("Z-A");

        textFieldPeliculaP.setText("pelicula");
        textFieldPeliculaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPeliculaPActionPerformed(evt);
            }
        });

        botonBuscarPeliculaP.setText("buscar");

        botonModificarPeliculaP.setText("modificar");

        botonAgregarPeliculaP.setText("agregar Pelicula");
        botonAgregarPeliculaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPeliculaPActionPerformed(evt);
            }
        });

        tableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableP);

        javax.swing.GroupLayout panelPeliculasLayout = new javax.swing.GroupLayout(panelPeliculas);
        panelPeliculas.setLayout(panelPeliculasLayout);
        panelPeliculasLayout.setHorizontalGroup(
            panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasLayout.createSequentialGroup()
                        .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboGeneroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPeliculasLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(textFieldPeliculaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboIdiomaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarPeliculaP))
                        .addGap(71, 71, 71)
                        .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModificarPeliculaP)
                            .addGroup(panelPeliculasLayout.createSequentialGroup()
                                .addComponent(comboSucursalP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(comboSalaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRadioAZ)
                                    .addComponent(botonRadioZA))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasLayout.createSequentialGroup()
                        .addComponent(botonAgregarPeliculaP)
                        .addGap(21, 21, 21))))
        );
        panelPeliculasLayout.setVerticalGroup(
            panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboGeneroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboIdiomaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSucursalP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSalaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPeliculaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarPeliculaP)
                            .addComponent(botonModificarPeliculaP))
                        .addGap(5, 5, 5))
                    .addGroup(panelPeliculasLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(botonRadioAZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonRadioZA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(botonAgregarPeliculaP)
                .addGap(54, 54, 54))
        );

        jTabbedPane2.addTab("Peliculas", panelPeliculas);

        botonCarritoC.setText("Carrito");

        botonRegistrarC.setText("Registrar");

        textFieldCedulaC.setText("Cedula");
        textFieldCedulaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCedulaCActionPerformed(evt);
            }
        });

        botonBuscarClienteC.setText("Buscar");

        tableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableC);

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(botonCarritoC)
                .addGap(125, 125, 125)
                .addComponent(botonRegistrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarClienteC))
                        .addGap(154, 154, 154))))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCarritoC)
                    .addComponent(botonRegistrarC)
                    .addComponent(textFieldCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botonBuscarClienteC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", panelClientes);

        botonCambiarPeliculaSa.setText("CambiarPeli");

        tableSa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableSa);

        comboPeliculasSa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSalasLayout = new javax.swing.GroupLayout(panelSalas);
        panelSalas.setLayout(panelSalasLayout);
        panelSalasLayout.setHorizontalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasLayout.createSequentialGroup()
                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalasLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(comboPeliculasSa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(botonCambiarPeliculaSa)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panelSalasLayout.setVerticalGroup(
            panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPeliculaSa)
                    .addComponent(comboPeliculasSa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Salas", panelSalas);

        tableSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableSu);

        botonAgregarSucursalSu.setText("agg Sucursal");

        botonModificarSucursalSu.setText("Modificar");

        botonAgregarSalasSu.setText("Agg Sala");

        javax.swing.GroupLayout panelSucursalesLayout = new javax.swing.GroupLayout(panelSucursales);
        panelSucursales.setLayout(panelSucursalesLayout);
        panelSucursalesLayout.setHorizontalGroup(
            panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSucursalesLayout.createSequentialGroup()
                .addGroup(panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSucursalesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(botonAgregarSucursalSu)
                        .addGap(86, 86, 86)
                        .addComponent(botonModificarSucursalSu)
                        .addGap(90, 90, 90)
                        .addComponent(botonAgregarSalasSu))
                    .addGroup(panelSucursalesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelSucursalesLayout.setVerticalGroup(
            panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(panelSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarSucursalSu)
                    .addComponent(botonModificarSucursalSu)
                    .addComponent(botonAgregarSalasSu))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Sucursales", panelSucursales);

        tableT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableT);

        botonCambiarPrecio2DT.setText("cambiar");
        botonCambiarPrecio2DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio2DTActionPerformed(evt);
            }
        });

        botonCambiarPrecio3DT.setText("cambiar");
        botonCambiarPrecio3DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio3DTActionPerformed(evt);
            }
        });

        botonCambiarPrecio4DT.setText("cambiar");
        botonCambiarPrecio4DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio4DTActionPerformed(evt);
            }
        });

        label2DT.setText("2D");

        label3DT.setText("3D");

        label4DT.setText("4DX");

        label$1T.setText("$");

        label$2T.setText("$");

        label$3T.setText("$");

        javax.swing.GroupLayout panelTicketsLayout = new javax.swing.GroupLayout(panelTickets);
        panelTickets.setLayout(panelTicketsLayout);
        panelTicketsLayout.setHorizontalGroup(
            panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketsLayout.createSequentialGroup()
                .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTicketsLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTicketsLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2DT)
                            .addComponent(label3DT)
                            .addComponent(label4DT))
                        .addGap(18, 18, 18)
                        .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldPrecio2DT)
                            .addComponent(textFieldPrecio3DT)
                            .addComponent(textFieldPrecio4DT, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelTicketsLayout.createSequentialGroup()
                                .addComponent(label$3T)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCambiarPrecio4DT))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTicketsLayout.createSequentialGroup()
                                .addComponent(label$2T)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCambiarPrecio3DT))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTicketsLayout.createSequentialGroup()
                                .addComponent(label$1T)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCambiarPrecio2DT)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelTicketsLayout.setVerticalGroup(
            panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPrecio2DT)
                    .addComponent(textFieldPrecio2DT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2DT)
                    .addComponent(label$1T))
                .addGap(29, 29, 29)
                .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPrecio3DT)
                    .addComponent(textFieldPrecio3DT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3DT)
                    .addComponent(label$2T))
                .addGap(29, 29, 29)
                .addGroup(panelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPrecio4DT)
                    .addComponent(textFieldPrecio4DT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4DT)
                    .addComponent(label$3T))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Tickets", panelTickets);

        labelSalasFrecuentesA.setText("Salas más frecuentadas");

        tableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableA);

        labelIngresosA.setText("Ingresos");

        textFieldIngresosA.setText("xd");

        javax.swing.GroupLayout panelAdministrarLayout = new javax.swing.GroupLayout(panelAdministrar);
        panelAdministrar.setLayout(panelAdministrarLayout);
        panelAdministrarLayout.setHorizontalGroup(
            panelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministrarLayout.createSequentialGroup()
                .addGroup(panelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdministrarLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdministrarLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIngresosA)
                            .addComponent(labelSalasFrecuentesA)
                            .addComponent(textFieldIngresosA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(266, 266, 266))
        );
        panelAdministrarLayout.setVerticalGroup(
            panelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministrarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelSalasFrecuentesA)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIngresosA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldIngresosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Administrar", panelAdministrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldClienteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldClienteVActionPerformed
    }//GEN-LAST:event_textFieldClienteVActionPerformed
    private void botonBuscarClienteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteVActionPerformed
    }//GEN-LAST:event_botonBuscarClienteVActionPerformed
    private void textFieldPeliculaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPeliculaVActionPerformed
    }//GEN-LAST:event_textFieldPeliculaVActionPerformed
    private void botonBuscarPeliculaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPeliculaVActionPerformed
    }//GEN-LAST:event_botonBuscarPeliculaVActionPerformed
    private void textFieldPeliculaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPeliculaPActionPerformed
    }//GEN-LAST:event_textFieldPeliculaPActionPerformed
    private void botonAgregarPeliculaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPeliculaPActionPerformed
    }//GEN-LAST:event_botonAgregarPeliculaPActionPerformed
    private void textFieldCedulaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCedulaCActionPerformed
    }//GEN-LAST:event_textFieldCedulaCActionPerformed
    private void botonCambiarPrecio4DTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecio4DTActionPerformed
    }//GEN-LAST:event_botonCambiarPrecio4DTActionPerformed
    private void botonCambiarPrecio3DTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecio3DTActionPerformed
    }//GEN-LAST:event_botonCambiarPrecio3DTActionPerformed
    private void botonCambiarPrecio2DTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecio2DTActionPerformed
    }//GEN-LAST:event_botonCambiarPrecio2DTActionPerformed

    private void textFieldClienteVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldClienteVFocusGained
        if(textFieldClienteV.getText().equals("Ingrese Cédula") == true){
            textFieldClienteV.setText("");
        }
    }//GEN-LAST:event_textFieldClienteVFocusGained

    private void textFieldPeliculaVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPeliculaVFocusGained
        if(textFieldPeliculaV.getText().equals("Ingrese Película") == true){
            textFieldPeliculaV.setText("");
        }
    }//GEN-LAST:event_textFieldPeliculaVFocusGained

    private void textFieldClienteVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldClienteVFocusLost
        if(textFieldClienteV.getText().equals("") == true){
            textFieldClienteV.setText("Ingrese Cédula");
        }
    }//GEN-LAST:event_textFieldClienteVFocusLost

    private void textFieldPeliculaVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPeliculaVFocusLost
        if(textFieldPeliculaV.getText().equals("") == true){
            textFieldPeliculaV.setText("Ingrese Película");
        }
    }//GEN-LAST:event_textFieldPeliculaVFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCarritoV;
    private javax.swing.JButton botonAgregarClienteV;
    private javax.swing.JButton botonAgregarPeliculaP;
    private javax.swing.JButton botonAgregarSalasSu;
    private javax.swing.JButton botonAgregarSucursalSu;
    private javax.swing.JButton botonBuscarClienteC;
    private javax.swing.JButton botonBuscarClienteV;
    private javax.swing.JButton botonBuscarPeliculaP;
    private javax.swing.JButton botonBuscarPeliculaV;
    private javax.swing.JButton botonCambiarPeliculaSa;
    private javax.swing.JButton botonCambiarPrecio2DT;
    private javax.swing.JButton botonCambiarPrecio3DT;
    private javax.swing.JButton botonCambiarPrecio4DT;
    private javax.swing.JButton botonCarritoC;
    private javax.swing.JButton botonModificarPeliculaP;
    private javax.swing.JButton botonModificarSucursalSu;
    private javax.swing.JRadioButton botonRadioAZ;
    private javax.swing.JRadioButton botonRadioZA;
    private javax.swing.JButton botonRegistrarC;
    private javax.swing.JComboBox<String> comboClientesV;
    private javax.swing.JComboBox<String> comboGeneroP;
    private javax.swing.JComboBox<String> comboIdiomaP;
    private javax.swing.JComboBox<String> comboPeliculasSa;
    private javax.swing.JComboBox<String> comboPeliculasV;
    private javax.swing.JComboBox<String> comboSalaP;
    private javax.swing.JComboBox<String> comboSalasV;
    private javax.swing.JComboBox<String> comboSucursalP;
    private javax.swing.JComboBox<String> comboSucursalesV;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label$1T;
    private javax.swing.JLabel label$2T;
    private javax.swing.JLabel label$3T;
    private javax.swing.JLabel label2DT;
    private javax.swing.JLabel label3DT;
    private javax.swing.JLabel label4DT;
    private javax.swing.JLabel labelCantidadTicketsV;
    private javax.swing.JLabel labelIngresosA;
    private javax.swing.JLabel labelPrecioV;
    private javax.swing.JLabel labelSalasFrecuentesA;
    private javax.swing.JPanel panelAdministrar;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelImagenPelicula;
    private javax.swing.JPanel panelPeliculas;
    private javax.swing.JPanel panelSalas;
    private javax.swing.JPanel panelSucursales;
    private javax.swing.JPanel panelTickets;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JSpinner spinnerTicketsV;
    private javax.swing.JTable tableA;
    private javax.swing.JTable tableC;
    private javax.swing.JTable tableP;
    private javax.swing.JTable tableSa;
    private javax.swing.JTable tableSu;
    private javax.swing.JTable tableT;
    private javax.swing.JTextField textFieldCedulaC;
    private javax.swing.JTextField textFieldClienteV;
    private javax.swing.JTextField textFieldIngresosA;
    private javax.swing.JTextField textFieldPeliculaP;
    private javax.swing.JTextField textFieldPeliculaV;
    private javax.swing.JTextField textFieldPrecio2DT;
    private javax.swing.JTextField textFieldPrecio3DT;
    private javax.swing.JTextField textFieldPrecio4DT;
    private javax.swing.JTextField textFieldPrecioV;
    // End of variables declaration//GEN-END:variables
}
