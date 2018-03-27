package view;

import controller.Controlador;
import model.Cliente;
import model.OrdenCompra;
import structures.Cola;

public class Carrito extends javax.swing.JFrame {
    private Cola<OrdenCompra> ordenes;
    private Principal principal;
    private Controlador controlador;
    private Cliente cliente;
    

    public Carrito(Principal principal, Controlador controlador, Cliente cliente) {
        this.cliente = cliente;
        this.ordenes = new Cola<>();
        this.principal = principal;
        this.controlador = controlador;
        initComponents();
        this.setSize(720, 350);
        this.setLocationRelativeTo(null);
        
        controlador.iniciarCarrito(this, cliente);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();
        labelCedula = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonPagar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden N°", "Cantidad", "Sucursal", "Sala", "Tipo", "Película", "Fecha", "Precio", "¿Pagada?"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 690, 140));

        botonRegresar.setBackground(new java.awt.Color(153, 153, 153));
        botonRegresar.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setFocusPainted(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        labelCedula.setFont(new java.awt.Font("Calibri Light", 2, 18)); // NOI18N
        labelCedula.setText("cedula");
        jPanel1.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 36, 130, 30));

        labelNombre1.setFont(new java.awt.Font("Calibri Light", 2, 18)); // NOI18N
        labelNombre1.setText("Cédula:");
        jPanel1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 40, 60, -1));

        labelNombre.setFont(new java.awt.Font("Calibri Light", 3, 30)); // NOI18N
        labelNombre.setText("Cliente");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 250, -1));

        botonPagar.setBackground(new java.awt.Color(153, 153, 153));
        botonPagar.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        botonPagar.setForeground(new java.awt.Color(255, 255, 255));
        botonPagar.setText("Pagar Orden");
        botonPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonPagar.setFocusPainted(false);
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });
        jPanel1.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoCarrito.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel labelCedula;
    public javax.swing.JLabel labelNombre;
    public javax.swing.JLabel labelNombre1;
    // End of variables declaration//GEN-END:variables
}
