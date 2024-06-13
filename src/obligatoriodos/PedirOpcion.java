package obligatoriodos;

public class PedirOpcion extends javax.swing.JFrame {

    public PedirOpcion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        pnlPanelPrimerOpcion = new javax.swing.JPanel();
        lblSeleccioneOpcion = new javax.swing.JLabel();
        btnSoloRubros = new javax.swing.JButton();
        btnSistemaAnterior = new javax.swing.JButton();
        btnSistemaVacio = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comenzar con...");
        setIconImages(null);
        setName(""); // NOI18N
        setResizable(false);

        pnlPanelPrimerOpcion.setToolTipText("");
        pnlPanelPrimerOpcion.setMinimumSize(new java.awt.Dimension(300, 140));
        pnlPanelPrimerOpcion.setName(""); // NOI18N
        pnlPanelPrimerOpcion.setLayout(null);

        lblSeleccioneOpcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSeleccioneOpcion.setText("Seleccione una opción:");
        lblSeleccioneOpcion.setIconTextGap(20);
        pnlPanelPrimerOpcion.add(lblSeleccioneOpcion);
        lblSeleccioneOpcion.setBounds(20, 10, 220, 60);

        btnSoloRubros.setText("Solo rubros");
        pnlPanelPrimerOpcion.add(btnSoloRubros);
        btnSoloRubros.setBounds(320, 80, 130, 23);

        btnSistemaAnterior.setText("Sistema Anterior");
        pnlPanelPrimerOpcion.add(btnSistemaAnterior);
        btnSistemaAnterior.setBounds(170, 80, 130, 23);

        btnSistemaVacio.setText("Sistema Vacío");
        btnSistemaVacio.setName("btnSistemaVacio"); // NOI18N
        pnlPanelPrimerOpcion.add(btnSistemaVacio);
        btnSistemaVacio.setBounds(20, 80, 130, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlPanelPrimerOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 467,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlPanelPrimerOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void ventana() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedirOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedirOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedirOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedirOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PedirOpcion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSistemaAnterior;
    private javax.swing.JButton btnSistemaVacio;
    private javax.swing.JButton btnSoloRubros;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lblSeleccioneOpcion;
    private javax.swing.JPanel pnlPanelPrimerOpcion;
    // End of variables declaration//GEN-END:variables
}
