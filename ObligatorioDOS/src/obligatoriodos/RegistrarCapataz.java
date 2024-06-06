/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatoriodos;

import java.awt.*;
import javax.swing.JOptionPane;
import modelos.Capataz;
public class RegistrarCapataz extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCapataz
     */
    public RegistrarCapataz() {
        initComponents();
    }
    private Sistema sistema;
    
    private void btnRegistrarCapatazActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    String nombre = txtNombre.getText();
    String cedula = txtCedula.getText();
    String direccion = txtDireccion.getText();
    int anioIngreso = Integer.parseInt(txtAnio.getText());

    Capataz capataz = new Capataz(nombre, cedula, direccion);
    capataz.setAnioDeIngreso(anioIngreso);

    if (sistema.validarCapataz(capataz)) {
        sistema.setCapataz(capataz);
        JOptionPane.showMessageDialog(this, "Capataz registrado con éxito!");
        System.out.println(sistema.getCapataces());
        // Limpiar campos después de registrar
        txtNombre.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtAnio.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "El número de cédula debe ser único. Por favor, introduzca una cédula diferente.");
        // Limpiar campo de cédula y mantener otros campos
        txtCedula.setText("");
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        lblAnio = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarCapataz = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar capataz");
        setMinimumSize(new java.awt.Dimension(400, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 380));
        jPanel1.setLayout(null);

        lblAnio.setText("Año de ingreso:");
        jPanel1.add(lblAnio);
        lblAnio.setBounds(70, 216, 90, 30);

        txtCedula.setForeground(java.awt.Color.lightGray);
        txtCedula.setText("Ej: 12345678");
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        jPanel1.add(txtCedula);
        txtCedula.setBounds(170, 140, 170, 30);

        lblNombre.setText("Nombre completo:");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(50, 96, 110, 30);

        txtNombre.setForeground(java.awt.Color.lightGray);
        txtNombre.setText("Ej: Juan Gonzalez");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(170, 100, 170, 30);

        lblCedula.setText("Numero de cedula:");
        jPanel1.add(lblCedula);
        lblCedula.setBounds(50, 136, 110, 30);

        lblDireccion.setText("Direccion:");
        jPanel1.add(lblDireccion);
        lblDireccion.setBounds(100, 176, 60, 30);

        txtDireccion.setForeground(java.awt.Color.lightGray);
        txtDireccion.setText("Ej: Cuareim 1451");
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(170, 180, 170, 30);

        txtAnio.setForeground(java.awt.Color.lightGray);
        txtAnio.setText("Ej: 2024");
        txtAnio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnioFocusLost(evt);
            }
        });
        jPanel1.add(txtAnio);
        txtAnio.setBounds(170, 220, 170, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 60, 400, 10);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Registrar capataz");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 240, 40);

        btnRegistrarCapataz.setText("Registrar");
        jPanel1.add(btnRegistrarCapataz);
        btnRegistrarCapataz.setBounds(130, 290, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained
        if (txtCedula.getText().equals("Ej: 12345678")) {
            txtCedula.setText("");
            txtCedula.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtAnioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioFocusLost
        if (txtAnio.getText().isEmpty()) {
            txtAnio.setForeground(Color.LIGHT_GRAY);
            txtAnio.setText("Ej: 2024");
        }
    }//GEN-LAST:event_txtAnioFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setForeground(Color.LIGHT_GRAY);
            txtCedula.setText("Ej: 12345678");
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtAnioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnioFocusGained
        if (txtAnio.getText().equals("Ej: 2024")) {
            txtAnio.setText("");
            txtAnio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAnioFocusGained

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().equals("Ej: Juan Gonzalez")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setForeground(Color.LIGHT_GRAY);
            txtNombre.setText("Ej: Juan Gonzalez");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        if (txtDireccion.getText().equals("Ej: Cuareim 1451")) {
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setForeground(Color.LIGHT_GRAY);
            txtDireccion.setText("Ej: Cuareim 1451");
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(RegistrarCapataz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    Sistema sistema = new Sistema(); // Crear una instancia de Sistema
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new RegistrarCapataz().setVisible(true); // Pasar la instancia de Sistema al constructor de RegistrarCapataz
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCapataz;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}