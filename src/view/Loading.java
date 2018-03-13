package view;

import javax.swing.ImageIcon;

public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../images/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelSepArriba = new javax.swing.JLabel();
        jLabelSepIzquierda = new javax.swing.JLabel();
        jLabelSepDerecha = new javax.swing.JLabel();
        jLabelSepAbajo = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        jLabelPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(536, 268));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSepArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/separador2.png"))); // NOI18N
        jPanel2.add(jLabelSepArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelSepIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/separador3.png"))); // NOI18N
        jPanel2.add(jLabelSepIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, -1, -1));

        jLabelSepDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/separador3.png"))); // NOI18N
        jPanel2.add(jLabelSepDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 8, -1, -1));

        jLabelSepAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/separador2.png"))); // NOI18N
        jPanel2.add(jLabelSepAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        jPanel2.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 154, 220, 53));

        jLabelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tickett.png"))); // NOI18N
        jPanel2.add(jLabelPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JLabel jLabelSepAbajo;
    private javax.swing.JLabel jLabelSepArriba;
    private javax.swing.JLabel jLabelSepDerecha;
    private javax.swing.JLabel jLabelSepIzquierda;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JProgressBar loadingBar;
    // End of variables declaration//GEN-END:variables
}
