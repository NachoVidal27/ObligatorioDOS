/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatoriodos;

import javax.swing.*;
import modelos.Rubro;

public class RegistrarRubro extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarRubro
     */
    private Sistema sistema;

    public RegistrarRubro(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        cargarRubrosALista();
    }

    private void cargarRubrosALista() {
        String empty[] = { "" };
        listRubrosRegistrados.setListData(empty);
        String[] arrayRubros = new String[sistema.getRubros().size()];
        for (int i = 0; i < sistema.getRubros().size(); i++) {
            arrayRubros[i] = sistema.getRubros().get(i).getNombre();
        }
        listRubrosRegistrados.setListData(arrayRubros);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings()
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listRubrosRegistrados = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRubrosRegistrados = new javax.swing.JLabel();
        lblNombreRubro = new javax.swing.JLabel();
        txtNombreRubro = new javax.swing.JTextField();
        lblDescripcionRubro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDescripcionRubro = new javax.swing.JTextArea();
        btnRegistrarRubro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar rubro");
        setMinimumSize(new java.awt.Dimension(400, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        listRubrosRegistrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRubrosRegistrados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 100, 130, 160);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Registrar rubro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 240, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 400, 10);

        lblRubrosRegistrados.setText("Rubros registrados:");
        getContentPane().add(lblRubrosRegistrados);
        lblRubrosRegistrados.setBounds(230, 80, 140, 16);

        lblNombreRubro.setText("Nombre del rubro:");
        getContentPane().add(lblNombreRubro);
        lblNombreRubro.setBounds(20, 80, 140, 16);
        getContentPane().add(txtNombreRubro);
        txtNombreRubro.setBounds(20, 100, 150, 22);

        lblDescripcionRubro.setText("Descripción del rubro:");
        getContentPane().add(lblDescripcionRubro);
        lblDescripcionRubro.setBounds(20, 140, 150, 16);

        txtAreaDescripcionRubro.setColumns(20);
        txtAreaDescripcionRubro.setLineWrap(true);
        txtAreaDescripcionRubro.setRows(5);
        txtAreaDescripcionRubro.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtAreaDescripcionRubro);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 150, 100);

        btnRegistrarRubro.setText("Registrar");
        btnRegistrarRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarRubroMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrarRubro);
        btnRegistrarRubro.setBounds(130, 290, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRubroMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegistrarRubroMouseClicked
        String nombre = txtNombreRubro.getText();
        String descripcion = txtAreaDescripcionRubro.getText();
        if (nombre.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return; // Salir del método si algún campo está vacío
        }
        Rubro nuevoRubro = new Rubro(nombre, descripcion, 0);
        for (int i = 0; i < sistema.getRubros().size(); i++) {
            if (nuevoRubro.getNombre().equals(sistema.getRubros().get(i).getNombre())
                    && !descripcion.isEmpty()) {
                sistema.getRubros().get(i).setDescripcion(descripcion);
                JOptionPane.showMessageDialog(this, "El rubro ingresado ya existe, la descripcion fue modificada");
                txtNombreRubro.setText("");
                txtAreaDescripcionRubro.setText("");
                return; // Si el nombre del rubro ya esta en la lista modifica solo la descripcion y
                        // sale del metodo
            }
        }
        sistema.setRubro(nuevoRubro);
        JOptionPane.showMessageDialog(this, "Nuevo rubro agregado.");
        txtNombreRubro.setText("");
        txtAreaDescripcionRubro.setText("");
        cargarRubrosALista();
    }// GEN-LAST:event_btnRegistrarRubroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRubro.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new RegistrarRubro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarRubro;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcionRubro;
    private javax.swing.JLabel lblNombreRubro;
    private javax.swing.JLabel lblRubrosRegistrados;
    private javax.swing.JList<String> listRubrosRegistrados;
    private javax.swing.JTextArea txtAreaDescripcionRubro;
    private javax.swing.JTextField txtNombreRubro;
    // End of variables declaration//GEN-END:variables

}
