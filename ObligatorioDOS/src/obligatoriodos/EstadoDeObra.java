/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatoriodos;

import java.awt.Color;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import modelos.Obra;

public class EstadoDeObra extends JFrame {

    /**
     * Creates new form EstadoDeObra
     */
    private Sistema sistema;
    public Color[] colors;

    public EstadoDeObra(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
        listRubrosDeObra.setCellRenderer(new BulletListCellRenderer());
        cargarObrasALista();
    }

    private void cargarObrasALista() {
        String empty[] = {""};
        listObrasRegistradas.setListData(empty);
        listRubrosDeObra.setListData(empty);
        listGastosDelRubro.setListData(empty);
        listRubrosConGastos.setListData(empty);
        String[] arrayObras = new String[sistema.getObras().size()];
        for (int i = 0; i < sistema.getObras().size(); i++) {
            arrayObras[i] = sistema.getObras().get(i).getNumeroDePermiso() + ", " + sistema.getObras().get(i).getDireccion();
        }
        listObrasRegistradas.setListData(arrayObras);
    }

    private void cargarRubrosPresupuestadosALista(Obra obra) {
        String empty[] = {""};
        listRubrosDeObra.setListData(empty);
        String[] arrayRubrosPresupuestados = new String[obra.getRubrosPresupuestados().size()];
        for (int i = 0; i < arrayRubrosPresupuestados.length; i++) {
            arrayRubrosPresupuestados[i] = obra.getRubrosPresupuestados().get(i).getNombre() + " $" + obra.getRubrosPresupuestados().get(i).getPresupuesto();
        }
        listRubrosDeObra.setListData(arrayRubrosPresupuestados);
    }

    private void asignarColoresAGastos(Obra obra, String[] arrayGastos) {
        Color PyR = new Color(0, 255, 51);
        Color PyNR = new Color(204, 255, 204);
        Color NPyR = new Color(255, 204, 102);
        Color NPyNR = new Color(255, 153, 153);
        int contador = 0;
        Color[] localColors = new Color[obra.getGastos().size()];
        for (int i = 0; i < obra.getGastos().size(); i++) {
            if (obra.getGastos().get(i).getReintegrado() && obra.rubroEsPresupuestado(obra.getGastos().get(i).getRubro().getNombre())) {
                localColors[contador] = PyR;
                contador++;
            } else if (!obra.getGastos().get(i).getReintegrado() && obra.rubroEsPresupuestado(obra.getGastos().get(i).getRubro().getNombre())) {
                localColors[contador] = PyNR;
                contador++;
            } else if (obra.getGastos().get(i).getReintegrado() && !obra.rubroEsPresupuestado(obra.getGastos().get(i).getRubro().getNombre())) {
                localColors[contador] = NPyR;
                contador++;
            } else {
                localColors[contador] = NPyNR;
                contador++;
            }
        }
        listGastosDelRubro.setListData(arrayGastos);
        listGastosDelRubro.setCellRenderer(new CustomListCellRenderer());
        colors = localColors;
    }

    private void cargarGastosDelRubroALista(Obra obra, String rubroSeleccionado) {
        String empty[] = {""};
        listGastosDelRubro.setListData(empty);
        String[] arrayGastos = new String[obra.getGastos().size()];
        for (int i = 0; i < arrayGastos.length; i++) {
            if (obra.getGastos().get(i).getRubro().getNombre().equals(rubroSeleccionado)) {
                arrayGastos[i] = String.valueOf("Nro. " + obra.getGastos().get(i).getNumeroDeGasto() + " de " + obra.getGastos().get(i).getMes() + "/" + obra.getGastos().get(i).getAnio() + " " + obra.getGastos().get(i).getDescripcion() + " $" + obra.getGastos().get(i).getMonto());
            }
        }
        asignarColoresAGastos(obra, arrayGastos);
    }

    private void cargarRubrosConGastoALista(Obra obra) {
        String empty[] = {""};
        listRubrosConGastos.setListData(empty);
        String[] arrayRubrosConGastos = new String[obra.getRubros().size()];
        for (int i = 0; i < arrayRubrosConGastos.length; i++) {
            arrayRubrosConGastos[i] = obra.getRubros().get(i).getNombre();
        }
        listRubrosConGastos.setListData(arrayRubrosConGastos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblComienzo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listObrasRegistradas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        lblCapataz = new javax.swing.JLabel();
        lblTotalPresupuestado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPropietario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTotalGastado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblReintegrado = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblNoReintegrado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listRubrosDeObra = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listRubrosConGastos = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listGastosDelRubro = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estado de obra");
        setMaximumSize(new java.awt.Dimension(755, 464));
        setMinimumSize(new java.awt.Dimension(755, 464));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(755, 464));
        jPanel1.setMinimumSize(new java.awt.Dimension(755, 464));
        jPanel1.setName("Estado de obra"); // NOI18N
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Estado de obra");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 240, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 60, 840, 10);
        jPanel1.add(lblComienzo);
        lblComienzo.setBounds(340, 100, 220, 20);

        listObrasRegistradas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item1", "Item2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listObrasRegistradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listObrasRegistradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listObrasRegistradas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 220, 110);

        jLabel2.setText("Obras:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 50, 16);
        jPanel1.add(lblCapataz);
        lblCapataz.setBounds(610, 70, 180, 20);

        lblTotalPresupuestado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalPresupuestado.setText("0");
        jPanel1.add(lblTotalPresupuestado);
        lblTotalPresupuestado.setBounds(380, 140, 90, 16);

        jLabel6.setText("Saldo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 140, 40, 16);

        jLabel7.setText("Propietario:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 70, 70, 20);
        jPanel1.add(lblPropietario);
        lblPropietario.setBounds(320, 70, 220, 20);

        jLabel9.setText("Comienzo obra:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 100, 90, 20);

        jLabel10.setText("Total presupuestado:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 140, 120, 16);

        jLabel11.setText("Total gastado:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 140, 80, 16);

        lblTotalGastado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalGastado.setText("0");
        jPanel1.add(lblTotalGastado);
        lblTotalGastado.setBounds(580, 140, 80, 16);

        jLabel13.setText("Total gastado reintegrado:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(250, 180, 150, 16);

        lblReintegrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReintegrado.setText("0");
        jPanel1.add(lblReintegrado);
        lblReintegrado.setBounds(400, 180, 70, 16);

        jLabel15.setText("Total gastado no reintegrado:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(490, 180, 170, 16);

        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("0");
        jPanel1.add(lblSaldo);
        lblSaldo.setBounds(730, 140, 70, 16);

        jLabel17.setText("Capataz:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(560, 70, 60, 20);

        lblNoReintegrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoReintegrado.setText("0");
        jPanel1.add(lblNoReintegrado);
        lblNoReintegrado.setBounds(690, 180, 110, 16);

        jLabel19.setText("Presupuesto (Rubros y montos):");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 230, 220, 16);

        jLabel20.setText("Codigo de colores:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(130, 420, 110, 16);

        jLabel21.setText("Rubros con gastos en la obra:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(250, 230, 180, 16);

        listRubrosDeObra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item1", "Item2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listRubrosDeObra);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 220, 160);

        listRubrosConGastos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item1", "Item2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listRubrosConGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listRubrosConGastosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listRubrosConGastos);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(250, 250, 220, 160);

        listGastosDelRubro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item1", "Item2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(listGastosDelRubro);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(490, 250, 320, 160);

        jLabel22.setText("Gastos del rubro seleccionado:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(490, 230, 240, 16);

        jLabel23.setBackground(new java.awt.Color(255, 204, 102));
        jLabel23.setText("No presupuestado y reintegrado");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(490, 420, 220, 16);

        jLabel24.setBackground(new java.awt.Color(0, 255, 51));
        jLabel24.setText("Presupuestado y reintegrado");
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24);
        jLabel24.setBounds(250, 420, 220, 16);

        jLabel25.setBackground(new java.awt.Color(204, 255, 204));
        jLabel25.setText("Presupuestado y no reintegrado");
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(250, 440, 220, 16);

        jLabel26.setBackground(new java.awt.Color(255, 153, 153));
        jLabel26.setText("No presupuestado y no reintegrado");
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(490, 440, 220, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listObrasRegistradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listObrasRegistradasMouseClicked
        String empty[] = {""};
        listGastosDelRubro.setListData(empty);
        for (int i = 0; i < sistema.getObras().size(); i++) {
            if (parseInt(listObrasRegistradas.getSelectedValue().split(",", 2)[0]) == (sistema.getObras().get(i).getNumeroDePermiso())) {
                lblPropietario.setText(sistema.getObras().get(i).getPropietario().getNombre() + " (" + sistema.getObras().get(i).getPropietario().getCedula()+")");
                lblCapataz.setText(sistema.getObras().get(i).getCapataz().getNombre()+ " (" + sistema.getObras().get(i).getCapataz().getCedula()+")");
                lblComienzo.setText(sistema.getObras().get(i).getMesDeComienzo() + "/" + sistema.getObras().get(i).getAnioDeComienzo());
                lblTotalPresupuestado.setText("" + sistema.getObras().get(i).getPresupuestoTotal());
                lblTotalGastado.setText("" + sistema.getObras().get(i).getTotalGastado());
                lblSaldo.setText("" + (sistema.getObras().get(i).getPresupuestoTotal() - sistema.getObras().get(i).getTotalGastado()));
                lblReintegrado.setText("" + sistema.getObras().get(i).getGastosReintegrados());
                lblNoReintegrado.setText("" + sistema.getObras().get(i).getGastosNoReintegrados());
                cargarRubrosConGastoALista(sistema.getObras().get(i));
                cargarRubrosPresupuestadosALista(sistema.getObras().get(i));
            }
        }
    }//GEN-LAST:event_listObrasRegistradasMouseClicked

    private void listRubrosConGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listRubrosConGastosMouseClicked
        for (int i = 0; i < sistema.getObras().size(); i++) {
            if (parseInt(listObrasRegistradas.getSelectedValue().split(",", 2)[0]) == (sistema.getObras().get(i).getNumeroDePermiso())) {
                cargarGastosDelRubroALista(sistema.getObras().get(i), listRubrosConGastos.getSelectedValue());
            }
        }
    }//GEN-LAST:event_listRubrosConGastosMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstadoDeObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadoDeObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadoDeObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadoDeObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new RegistrarRubro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCapataz;
    private javax.swing.JLabel lblComienzo;
    private javax.swing.JLabel lblNoReintegrado;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblReintegrado;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotalGastado;
    private javax.swing.JLabel lblTotalPresupuestado;
    private javax.swing.JList<String> listGastosDelRubro;
    private javax.swing.JList<String> listObrasRegistradas;
    private javax.swing.JList<String> listRubrosConGastos;
    private javax.swing.JList<String> listRubrosDeObra;
    // End of variables declaration//GEN-END:variables

    class BulletListCellRenderer extends JLabel implements ListCellRenderer<String> {

        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            // Agregar bullet al texto
            if (value.equals("")) {
                setText(value);
            } else {
                setText("• " + value);
            }

            return this;
        }
    }

    class CustomListCellRenderer extends JLabel implements ListCellRenderer<String> {

        @Override
        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            // Establecer el texto del elemento
            setText(value);
            setBackground(colors[index]); // Color según el parámetro
            setForeground(list.getForeground());

            // Configurar la fuente y el borde
            setFont(list.getFont());
            setOpaque(true);

            return this;
        }
    }

}
