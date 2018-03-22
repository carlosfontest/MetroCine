package view;

import controller.Controlador;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        this.setSize(600, 430);
        this.setBackground(new Color(0,0,0,0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelVentas = new javax.swing.JPanel();
        botonBuscarClienteV = new javax.swing.JButton();
        comboClientesV = new javax.swing.JComboBox<>();
        textFieldPeliculaV = new javax.swing.JTextField();
        comboPeliculasV = new javax.swing.JComboBox<>();
        botonBuscarPeliculaV = new javax.swing.JButton();
        botonAgregarClienteV = new javax.swing.JButton();
        spinnerTicketsV = new javax.swing.JSpinner();
        comboSalasV = new javax.swing.JComboBox<>();
        comboSucursalesV = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        labelPrecioV = new javax.swing.JLabel();
        textFieldPrecioV = new javax.swing.JTextField();
        botonAgregarCarritoV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        textFieldClienteV = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labelCantidadTicketsV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        panelPeliculas = new javax.swing.JPanel();
        botonModificarPeliculaP = new javax.swing.JButton();
        botonAgregarPeliculaP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        comboGeneroP = new javax.swing.JComboBox<>();
        comboIdiomaP = new javax.swing.JComboBox<>();
        comboSucursalP = new javax.swing.JComboBox<>();
        comboSalaP = new javax.swing.JComboBox<>();
        botonRadioAZ = new javax.swing.JRadioButton();
        botonRadioZA = new javax.swing.JRadioButton();
        textFieldPeliculaP = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        botonBuscarPeliculaP = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        botonCarritoC = new javax.swing.JButton();
        botonRegistrarC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        textFieldCedulaC = new javax.swing.JTextField();
        botonBuscarClienteC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        panelSalas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        comboPeliculasSa = new javax.swing.JComboBox<>();
        botonCambiarPeliculaSa = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fondo4 = new javax.swing.JLabel();
        panelSucursales = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSu = new javax.swing.JTable();
        botonAgregarSucursalSu = new javax.swing.JButton();
        botonModificarSucursalSu = new javax.swing.JButton();
        botonAgregarSalasSu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fondo5 = new javax.swing.JLabel();
        panelTickets = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableT = new javax.swing.JTable();
        textFieldPrecio2DT = new javax.swing.JTextField();
        textFieldPrecio3DT = new javax.swing.JTextField();
        textFieldPrecio4DT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        label$1T = new javax.swing.JLabel();
        label$2T = new javax.swing.JLabel();
        label$3T = new javax.swing.JLabel();
        botonCambiarPrecio2DT = new javax.swing.JButton();
        botonCambiarPrecio3DT = new javax.swing.JButton();
        botonCambiarPrecio4DT = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fondo6 = new javax.swing.JLabel();
        panelAdministrar = new javax.swing.JPanel();
        labelSalasFrecuentesA = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableA = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        textFieldIngresosA = new javax.swing.JTextField();
        labelIngresosA = new javax.swing.JLabel();
        label$1T1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fondo7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(500, 400));

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(700, 900));

        panelVentas.setBackground(new java.awt.Color(255, 255, 255));
        panelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscarClienteV.setBackground(new java.awt.Color(153, 153, 153));
        botonBuscarClienteV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarClienteV.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarClienteV.setText("Buscar");
        botonBuscarClienteV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarClienteV.setFocusPainted(false);
        botonBuscarClienteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteVActionPerformed(evt);
            }
        });
        panelVentas.add(botonBuscarClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 80, 30));

        comboClientesV.setBackground(new java.awt.Color(153, 153, 153));
        comboClientesV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboClientesV.setForeground(new java.awt.Color(255, 255, 255));
        comboClientesV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));
        comboClientesV.setFocusable(false);
        panelVentas.add(comboClientesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 137, 107, 26));

        textFieldPeliculaV.setBackground(new java.awt.Color(102, 102, 102));
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
        panelVentas.add(textFieldPeliculaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 105, 107, 26));

        comboPeliculasV.setBackground(new java.awt.Color(153, 153, 153));
        comboPeliculasV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboPeliculasV.setForeground(new java.awt.Color(255, 255, 255));
        comboPeliculasV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas" }));
        comboPeliculasV.setFocusable(false);
        panelVentas.add(comboPeliculasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 137, 107, 26));

        botonBuscarPeliculaV.setBackground(new java.awt.Color(153, 153, 153));
        botonBuscarPeliculaV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarPeliculaV.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarPeliculaV.setText("Buscar");
        botonBuscarPeliculaV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarPeliculaV.setFocusPainted(false);
        botonBuscarPeliculaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPeliculaVActionPerformed(evt);
            }
        });
        panelVentas.add(botonBuscarPeliculaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 80, 30));

        botonAgregarClienteV.setBackground(new java.awt.Color(153, 153, 153));
        botonAgregarClienteV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarClienteV.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarClienteV.setText("Nuevo Cliente");
        botonAgregarClienteV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarClienteV.setFocusPainted(false);
        botonAgregarClienteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteVActionPerformed(evt);
            }
        });
        panelVentas.add(botonAgregarClienteV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 50));

        spinnerTicketsV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        spinnerTicketsV.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        panelVentas.add(spinnerTicketsV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 26));

        comboSalasV.setBackground(new java.awt.Color(153, 153, 153));
        comboSalasV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSalasV.setForeground(new java.awt.Color(255, 255, 255));
        comboSalasV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salas" }));
        comboSalasV.setFocusable(false);
        panelVentas.add(comboSalasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, 26));

        comboSucursalesV.setBackground(new java.awt.Color(153, 153, 153));
        comboSucursalesV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSucursalesV.setForeground(new java.awt.Color(255, 255, 255));
        comboSucursalesV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucursales" }));
        comboSucursalesV.setBorder(null);
        comboSucursalesV.setFocusable(false);
        panelVentas.add(comboSucursalesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 90, 26));
        panelVentas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 60, 10));

        labelPrecioV.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        labelPrecioV.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecioV.setText("Precio Total");
        panelVentas.add(labelPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        textFieldPrecioV.setEditable(false);
        textFieldPrecioV.setBackground(new java.awt.Color(102, 102, 102));
        textFieldPrecioV.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPrecioV.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPrecioV.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldPrecioV.setText("Precio");
        textFieldPrecioV.setBorder(null);
        panelVentas.add(textFieldPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 60, 26));

        botonAgregarCarritoV.setBackground(new java.awt.Color(153, 153, 153));
        botonAgregarCarritoV.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarCarritoV.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarCarritoV.setText("Agregar al carrito");
        botonAgregarCarritoV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarCarritoV.setFocusPainted(false);
        panelVentas.add(botonAgregarCarritoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 140, 40));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ventas.png"))); // NOI18N
        panelVentas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 50));
        panelVentas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 108, 10));
        panelVentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 107, 10));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textFieldClienteV.setBackground(new java.awt.Color(102, 102, 102));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(textFieldClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        panelVentas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 70));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 250, 70));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 90));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        panelVentas.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 40));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelCantidadTicketsV.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        labelCantidadTicketsV.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidadTicketsV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCantidadTicketsV.setText("Cantidad");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCantidadTicketsV, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(labelCantidadTicketsV)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        panelVentas.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelVentas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panelVentas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelVentas.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Ventas", panelVentas);

        panelPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonModificarPeliculaP.setBackground(new java.awt.Color(153, 153, 153));
        botonModificarPeliculaP.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonModificarPeliculaP.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarPeliculaP.setText("Modificar");
        botonModificarPeliculaP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonModificarPeliculaP.setFocusPainted(false);
        panelPeliculas.add(botonModificarPeliculaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 80, 30));

        botonAgregarPeliculaP.setBackground(new java.awt.Color(153, 153, 153));
        botonAgregarPeliculaP.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarPeliculaP.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarPeliculaP.setText("Agregar Película");
        botonAgregarPeliculaP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarPeliculaP.setFocusPainted(false);
        botonAgregarPeliculaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPeliculaPActionPerformed(evt);
            }
        });
        panelPeliculas.add(botonAgregarPeliculaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 130, 30));

        tableP.setBackground(new java.awt.Color(204, 204, 204));
        tableP.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableP);

        panelPeliculas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 70, 540, 120));

        jLabel4.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peliculas.png"))); // NOI18N
        panelPeliculas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 7, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        comboGeneroP.setBackground(new java.awt.Color(153, 153, 153));
        comboGeneroP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboGeneroP.setForeground(new java.awt.Color(255, 255, 255));
        comboGeneroP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboIdiomaP.setBackground(new java.awt.Color(153, 153, 153));
        comboIdiomaP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboIdiomaP.setForeground(new java.awt.Color(255, 255, 255));
        comboIdiomaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSucursalP.setBackground(new java.awt.Color(153, 153, 153));
        comboSucursalP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSucursalP.setForeground(new java.awt.Color(255, 255, 255));
        comboSucursalP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSalaP.setBackground(new java.awt.Color(153, 153, 153));
        comboSalaP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboSalaP.setForeground(new java.awt.Color(255, 255, 255));
        comboSalaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonRadioAZ.setBackground(new java.awt.Color(102, 102, 102));
        grupoBotones.add(botonRadioAZ);
        botonRadioAZ.setForeground(new java.awt.Color(255, 255, 255));
        botonRadioAZ.setText("A-Z");

        botonRadioZA.setBackground(new java.awt.Color(102, 102, 102));
        grupoBotones.add(botonRadioZA);
        botonRadioZA.setForeground(new java.awt.Color(255, 255, 255));
        botonRadioZA.setText("Z-A");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboGeneroP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboIdiomaP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSucursalP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(comboSalaP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRadioAZ)
                    .addComponent(botonRadioZA))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(botonRadioAZ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRadioZA)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSalaP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSucursalP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboIdiomaP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGeneroP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelPeliculas.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 450, 60));

        textFieldPeliculaP.setBackground(new java.awt.Color(102, 102, 102));
        textFieldPeliculaP.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPeliculaP.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPeliculaP.setText("Ingrese Película");
        textFieldPeliculaP.setBorder(null);
        textFieldPeliculaP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPeliculaPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPeliculaPFocusLost(evt);
            }
        });
        textFieldPeliculaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPeliculaPActionPerformed(evt);
            }
        });
        panelPeliculas.add(textFieldPeliculaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 315, 110, 26));
        panelPeliculas.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, -1));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        botonBuscarPeliculaP.setBackground(new java.awt.Color(153, 153, 153));
        botonBuscarPeliculaP.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarPeliculaP.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarPeliculaP.setText("Buscar");
        botonBuscarPeliculaP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarPeliculaP.setFocusPainted(false);
        botonBuscarPeliculaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPeliculaPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(botonBuscarPeliculaP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonBuscarPeliculaP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelPeliculas.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        panelPeliculas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panelPeliculas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelPeliculas.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Peliculas", panelPeliculas);

        panelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCarritoC.setBackground(new java.awt.Color(153, 153, 153));
        botonCarritoC.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonCarritoC.setForeground(new java.awt.Color(255, 255, 255));
        botonCarritoC.setText("Carrito");
        botonCarritoC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCarritoC.setFocusPainted(false);
        panelClientes.add(botonCarritoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 30));

        botonRegistrarC.setBackground(new java.awt.Color(153, 153, 153));
        botonRegistrarC.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonRegistrarC.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarC.setText("Registrar");
        botonRegistrarC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegistrarC.setFocusPainted(false);
        panelClientes.add(botonRegistrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 80, 30));

        tableC.setBackground(new java.awt.Color(204, 204, 204));
        tableC.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableC);

        panelClientes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 550, 160));

        jLabel5.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        panelClientes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panelClientes.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 311, 100, 10));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textFieldCedulaC.setBackground(new java.awt.Color(102, 102, 102));
        textFieldCedulaC.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldCedulaC.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCedulaC.setText("Ingrese Cédula");
        textFieldCedulaC.setBorder(null);
        textFieldCedulaC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCedulaCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCedulaCFocusLost(evt);
            }
        });
        textFieldCedulaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCedulaCActionPerformed(evt);
            }
        });

        botonBuscarClienteC.setBackground(new java.awt.Color(153, 153, 153));
        botonBuscarClienteC.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonBuscarClienteC.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarClienteC.setText("Buscar");
        botonBuscarClienteC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarClienteC.setFocusPainted(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldCedulaC, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonBuscarClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldCedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelClientes.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 220, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        panelClientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        panelClientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelClientes.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Clientes", panelClientes);

        panelSalas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSa.setBackground(new java.awt.Color(204, 204, 204));
        tableSa.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableSa);

        panelSalas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 540, 180));

        jLabel6.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salas.png"))); // NOI18N
        panelSalas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        comboPeliculasSa.setBackground(new java.awt.Color(153, 153, 153));
        comboPeliculasSa.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        comboPeliculasSa.setForeground(new java.awt.Color(255, 255, 255));
        comboPeliculasSa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonCambiarPeliculaSa.setBackground(new java.awt.Color(153, 153, 153));
        botonCambiarPeliculaSa.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonCambiarPeliculaSa.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarPeliculaSa.setText("Cambiar Película");
        botonCambiarPeliculaSa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCambiarPeliculaSa.setFocusPainted(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comboPeliculasSa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(botonCambiarPeliculaSa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPeliculaSa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPeliculasSa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelSalas.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 320, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        panelSalas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        panelSalas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelSalas.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Salas", panelSalas);

        panelSucursales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSu.setBackground(new java.awt.Color(204, 204, 204));
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

        panelSucursales.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 530, 210));

        botonAgregarSucursalSu.setBackground(new java.awt.Color(153, 153, 153));
        botonAgregarSucursalSu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarSucursalSu.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarSucursalSu.setText("Agregar Sucursal");
        botonAgregarSucursalSu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarSucursalSu.setFocusPainted(false);
        panelSucursales.add(botonAgregarSucursalSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 30));

        botonModificarSucursalSu.setBackground(new java.awt.Color(153, 153, 153));
        botonModificarSucursalSu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonModificarSucursalSu.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarSucursalSu.setText("Modificar");
        botonModificarSucursalSu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonModificarSucursalSu.setFocusPainted(false);
        panelSucursales.add(botonModificarSucursalSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, 30));

        botonAgregarSalasSu.setBackground(new java.awt.Color(153, 153, 153));
        botonAgregarSalasSu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonAgregarSalasSu.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarSalasSu.setText("Agregar Sala");
        botonAgregarSalasSu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarSalasSu.setFocusPainted(false);
        panelSucursales.add(botonAgregarSalasSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 100, 30));

        jLabel7.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sucursales.png"))); // NOI18N
        panelSucursales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        panelSucursales.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        panelSucursales.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelSucursales.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Sucursales", panelSucursales);

        panelTickets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(153, 153, 153));

        tableT.setBackground(new java.awt.Color(204, 204, 204));
        tableT.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableT);

        panelTickets.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, 110));

        textFieldPrecio2DT.setBackground(new java.awt.Color(102, 102, 102));
        textFieldPrecio2DT.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPrecio2DT.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPrecio2DT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelTickets.add(textFieldPrecio2DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, 40));

        textFieldPrecio3DT.setBackground(new java.awt.Color(102, 102, 102));
        textFieldPrecio3DT.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPrecio3DT.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPrecio3DT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelTickets.add(textFieldPrecio3DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, 40));

        textFieldPrecio4DT.setBackground(new java.awt.Color(102, 102, 102));
        textFieldPrecio4DT.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldPrecio4DT.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPrecio4DT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelTickets.add(textFieldPrecio4DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 40));

        jLabel8.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tickets.png"))); // NOI18N
        panelTickets.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        label$1T.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        label$1T.setForeground(new java.awt.Color(255, 255, 255));
        label$1T.setText("$");

        label$2T.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        label$2T.setForeground(new java.awt.Color(255, 255, 255));
        label$2T.setText("$");

        label$3T.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        label$3T.setForeground(new java.awt.Color(255, 255, 255));
        label$3T.setText("$");

        botonCambiarPrecio2DT.setBackground(new java.awt.Color(153, 153, 153));
        botonCambiarPrecio2DT.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonCambiarPrecio2DT.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarPrecio2DT.setText("Cambiar");
        botonCambiarPrecio2DT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCambiarPrecio2DT.setFocusPainted(false);
        botonCambiarPrecio2DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio2DTActionPerformed(evt);
            }
        });

        botonCambiarPrecio3DT.setBackground(new java.awt.Color(153, 153, 153));
        botonCambiarPrecio3DT.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonCambiarPrecio3DT.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarPrecio3DT.setText("Cambiar");
        botonCambiarPrecio3DT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCambiarPrecio3DT.setFocusPainted(false);
        botonCambiarPrecio3DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio3DTActionPerformed(evt);
            }
        });

        botonCambiarPrecio4DT.setBackground(new java.awt.Color(153, 153, 153));
        botonCambiarPrecio4DT.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonCambiarPrecio4DT.setForeground(new java.awt.Color(255, 255, 255));
        botonCambiarPrecio4DT.setText("Cambiar");
        botonCambiarPrecio4DT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCambiarPrecio4DT.setFocusPainted(false);
        botonCambiarPrecio4DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecio4DTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label$1T)
                    .addComponent(label$2T)
                    .addComponent(label$3T))
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCambiarPrecio2DT, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(botonCambiarPrecio3DT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCambiarPrecio4DT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label$1T)
                    .addComponent(botonCambiarPrecio2DT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label$2T)
                    .addComponent(botonCambiarPrecio3DT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPrecio4DT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label$3T))
                .addContainerGap())
        );

        panelTickets.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 320, 160));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        panelTickets.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        panelTickets.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelTickets.add(fondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Tickets", panelTickets);

        panelAdministrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSalasFrecuentesA.setFont(new java.awt.Font("Calibri Light", 2, 36)); // NOI18N
        labelSalasFrecuentesA.setForeground(new java.awt.Color(255, 255, 255));
        labelSalasFrecuentesA.setText("Salas más frecuentadas");
        panelAdministrar.add(labelSalasFrecuentesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        tableA.setBackground(new java.awt.Color(204, 204, 204));
        tableA.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableA);

        panelAdministrar.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 530, 110));

        jLabel9.setFont(new java.awt.Font("Meiryo UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrar.png"))); // NOI18N
        panelAdministrar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panelAdministrar.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 80, 10));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textFieldIngresosA.setBackground(new java.awt.Color(102, 102, 102));
        textFieldIngresosA.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        textFieldIngresosA.setForeground(new java.awt.Color(255, 255, 255));
        textFieldIngresosA.setText("0.0");
        textFieldIngresosA.setBorder(null);

        labelIngresosA.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        labelIngresosA.setForeground(new java.awt.Color(255, 255, 255));
        labelIngresosA.setText("Ingresos");

        label$1T1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        label$1T1.setForeground(new java.awt.Color(255, 255, 255));
        label$1T1.setText("$");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIngresosA)
                .addGap(48, 48, 48)
                .addComponent(textFieldIngresosA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label$1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldIngresosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIngresosA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label$1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAdministrar.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 320, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EquisBlanca.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        panelAdministrar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizarBlanca.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        panelAdministrar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        fondo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        panelAdministrar.add(fondo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Administrar", panelAdministrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
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

    private void botonBuscarPeliculaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPeliculaPActionPerformed
    }//GEN-LAST:event_botonBuscarPeliculaPActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel3MouseClicked
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel11MouseClicked
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel13MouseClicked
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel17MouseClicked
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel19MouseClicked
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel21MouseClicked
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        controlador.cerrar(this);
    }//GEN-LAST:event_jLabel15MouseClicked
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel10MouseClicked
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel12MouseClicked
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel14MouseClicked
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel18MouseClicked
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel20MouseClicked
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel22MouseClicked
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        controlador.minimizar(this);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void textFieldPeliculaPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPeliculaPFocusGained
        if(textFieldPeliculaP.getText().equals("Ingrese Película") == true){
            textFieldPeliculaP.setText("");
        }
    }//GEN-LAST:event_textFieldPeliculaPFocusGained

    private void textFieldPeliculaPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPeliculaPFocusLost
        if(textFieldPeliculaP.getText().equals("") == true){
            textFieldPeliculaP.setText("Ingrese Película");
        }
    }//GEN-LAST:event_textFieldPeliculaPFocusLost

    private void textFieldCedulaCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaCFocusGained
        if(textFieldCedulaC.getText().equals("Ingrese Cédula") == true){
            textFieldCedulaC.setText("");
        }
    }//GEN-LAST:event_textFieldCedulaCFocusGained

    private void textFieldCedulaCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCedulaCFocusLost
        if(textFieldCedulaC.getText().equals("") == true){
            textFieldCedulaC.setText("Ingrese Cédula");
        }
    }//GEN-LAST:event_textFieldCedulaCFocusLost

    private void botonAgregarClienteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarClienteVActionPerformed

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
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel fondo4;
    private javax.swing.JLabel fondo5;
    private javax.swing.JLabel fondo6;
    private javax.swing.JLabel fondo7;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label$1T;
    private javax.swing.JLabel label$1T1;
    private javax.swing.JLabel label$2T;
    private javax.swing.JLabel label$3T;
    private javax.swing.JLabel labelCantidadTicketsV;
    private javax.swing.JLabel labelIngresosA;
    private javax.swing.JLabel labelPrecioV;
    private javax.swing.JLabel labelSalasFrecuentesA;
    private javax.swing.JPanel panelAdministrar;
    private javax.swing.JPanel panelClientes;
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
