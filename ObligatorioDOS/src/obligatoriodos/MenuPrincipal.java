/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package obligatoriodos;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelos.Obra;
import modelos.Rubro;


public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private Sistema sistema;

    public MenuPrincipal(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
    }

    private int CalcularTotalPresupuestado(String[] datos) {
        int presupuestoTotal = 0;
        System.out.println(datos[1]);
        //for (int x = 1; x < parseInt(datos[6]); x += 2) {
        //presupuestoTotal += parseInt(datos[x + 7]);
        //    System.out.println(datos[x]);
        // }
        return presupuestoTotal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        subMenuRegistrarRubro = new javax.swing.JMenuItem();
        subMenuRegistrarCapataz = new javax.swing.JMenuItem();
        subMenuRegistroPropietario = new javax.swing.JMenuItem();
        subMenuRegistroObra = new javax.swing.JMenuItem();
        menuGastos = new javax.swing.JMenu();
        subMenuRegistroGasto = new javax.swing.JMenuItem();
        subMenuPagoGasto = new javax.swing.JMenuItem();
        subMenuEstadoObra = new javax.swing.JMenuItem();
        menuImpYExp = new javax.swing.JMenu();
        subMenuImportacionDatosObra = new javax.swing.JMenuItem();
        subMenuExportacionDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Pequeñas Obras - Realizado por Nicolas Remigio e Ignacio Vidal");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(800, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        menuRegistros.setText("Registros");

        subMenuRegistrarRubro.setText("Registrar/modificar rubro");
        menuRegistros.add(subMenuRegistrarRubro);

        subMenuRegistrarCapataz.setText("Registrar capataz");
        subMenuRegistrarCapataz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRegistrarCapatazActionPerformed(evt);
            }
        });
        menuRegistros.add(subMenuRegistrarCapataz);

        subMenuRegistroPropietario.setText("Registro de propietario");
        menuRegistros.add(subMenuRegistroPropietario);

        subMenuRegistroObra.setText("Registro de obra");
        menuRegistros.add(subMenuRegistroObra);

        jMenuBar1.add(menuRegistros);

        menuGastos.setText("Gastos");

        subMenuRegistroGasto.setText("Registro de gasto para obra");
        menuGastos.add(subMenuRegistroGasto);

        subMenuPagoGasto.setText("Pago de gasto");
        menuGastos.add(subMenuPagoGasto);

        subMenuEstadoObra.setText("Estado de obra");
        menuGastos.add(subMenuEstadoObra);

        jMenuBar1.add(menuGastos);

        menuImpYExp.setText("Importación y Exportación");

        subMenuImportacionDatosObra.setText("Importación de datos para obra nueva");
        subMenuImportacionDatosObra.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                subMenuImportacionDatosObraMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        subMenuImportacionDatosObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMenuImportacionDatosObraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMenuImportacionDatosObraMousePressed(evt);
            }
        });
        menuImpYExp.add(subMenuImportacionDatosObra);

        subMenuExportacionDatos.setText("Exportación de datos de Propietarios y Capataces");
        subMenuExportacionDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMenuExportacionDatosMousePressed(evt);
            }
        });
        menuImpYExp.add(subMenuExportacionDatos);

        jMenuBar1.add(menuImpYExp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuImportacionDatosObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuImportacionDatosObraMouseClicked
    }//GEN-LAST:event_subMenuImportacionDatosObraMouseClicked

    private void subMenuImportacionDatosObraMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_subMenuImportacionDatosObraMenuKeyPressed
    }//GEN-LAST:event_subMenuImportacionDatosObraMenuKeyPressed

    private void subMenuImportacionDatosObraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuImportacionDatosObraMousePressed
      try {
            Scanner arch = new Scanner(Paths.get("archivo.txt"));
            int totalPresupuestado = 0;
            String[] datosObra = new String[6];
            ArrayList<Rubro> rubros = new ArrayList();
            while (arch.hasNext()) {
                String[] datos = arch.nextLine().split("#");
                if (datos.length == 6) {
                    //Carga los datos de la obra al array datosObra
                    // CI capataz
                    datosObra[0] = datos[0];
                    // CI propietario
                    datosObra[1] = datos[1];
                    // Direccion
                    datosObra[2] = datos[2];
                    // Mes de comienzo
                    datosObra[3] = datos[3];
                    // Anio de comienzo
                    datosObra[4] = datos[4];
                    //Numero de permiso
                    datosObra[5] = datos[5];
                }
                if (datos.length == 2) {
                    //Carga los datos de los rubros al arraylist rubros
                    Rubro nuevoRubro = new Rubro(datos[0], "", parseInt(datos[1]));
                    rubros.add(nuevoRubro);
                    totalPresupuestado += parseInt(datos[1]);
                }
            }
            arch.close();
 
            //Valida que el capataz este en el sistema
            if (!sistema.validarCapataz(sistema.devolverCapatazPorCedula(datosObra[0]))) {
                //Valida que el propietario este en el sistema
                if (!sistema.validarPropietario(sistema.devolverPropietarioPorCedula(datosObra[1]))) {
                    //Valida que una obra con ese numero de permiso no este ya registrada
                    if (sistema.validarPermiso(parseInt(datosObra[5]))) {
 
                        //Crea la obra con los datos nuevos
                        Obra nuevaObra = new Obra(sistema.devolverPropietarioPorCedula(datosObra[1]), sistema.devolverCapatazPorCedula(datosObra[0]), datosObra[2], parseInt(datosObra[3]), parseInt(datosObra[4]), totalPresupuestado, parseInt(datosObra[5]));
                        sistema.setObra(nuevaObra);
 
                        //Agrega los rubros a la obra y los crea si no existen
                        for (int i = 0; i < rubros.size(); i++) {
                            if (sistema.devolverRubroPorNombre(rubros.get(i).getNombre()).getNombre().equals(rubros.get(i).getNombre())) {
                                nuevaObra.setRubrosPresupuestados(sistema.devolverRubroPorNombre(rubros.get(i).getNombre()));
                            } else {
                                Rubro nuevoRubro = new Rubro(rubros.get(i).getNombre(), "Descripción a Definir", rubros.get(i).getPresupuesto());
                                sistema.setRubro(nuevoRubro);
                                nuevaObra.setRubrosPresupuestados(nuevoRubro);
                            }
                        }
                        JOptionPane.showMessageDialog(this, "Se creo la obra con nro de permiso " + nuevaObra.getNumeroDePermiso());
                        System.out.println(nuevaObra.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe una obra con ese numero de permiso en el sistema, no se creo la obra.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay un propietario con ese numero de cedula registrado en el sistema, no se creo la obra.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay un capataz con ese numero de cedula registrado en el sistema, no se creo la obra.", "Error", JOptionPane.ERROR_MESSAGE);
            }
 
        } catch (IOException e) {
            System.out.println(e);
            //Se hace el catch de IndexOutOfBoundsException por si hay un error con el largo de datosObra
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Verifique que se hayan ingresado todos los datos necesarios en el formato correcto en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_subMenuImportacionDatosObraMousePressed

    private void subMenuExportacionDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuExportacionDatosMousePressed
         try {
            String title = "Determinar ordenamiento";
            String message = "¿Como se ordenaran los datos?";
            Object[] options = {"Número de cédula creciente", "Nombre creciente"};
            int choice = JOptionPane.showOptionDialog(
                    null, 
                    message, 
                    title, 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    options, 
                    options[0]
            );
 
            // Procesar la opción seleccionada
            if (choice == JOptionPane.YES_OPTION) {
                sistema.getPropietarios().sort((p2, p1) -> Integer.compare(parseInt(p2.getCedula()), parseInt(p1.getCedula())));
                sistema.getCapataces().sort((p2, p1) -> Integer.compare(parseInt(p2.getCedula()), parseInt(p1.getCedula())));
            } else if (choice == JOptionPane.NO_OPTION) {
                sistema.getPropietarios().sort((p1, p2) -> p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
                sistema.getCapataces().sort((p1, p2) -> p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
            } else {
                System.out.println("No se eligio opcion.");
            }
            Formatter arch = new Formatter("Personas.txt");
            arch.format("%s%n", "Propietarios");
            for (int i = 0; i < sistema.getPropietarios().size(); i++) {
                arch.format("%s%n", "" + sistema.getPropietarios().get(i).getNombre() + " " + sistema.getPropietarios().get(i).getCedula() + " " + sistema.getPropietarios().get(i).getDireccion() + " " + sistema.getPropietarios().get(i).getCelular());
            }
            arch.format("%s%n", "");
            arch.format("%s%n", "Capataces");
            for (int i = 0; i < sistema.getCapataces().size(); i++) {
                arch.format("%s%n", "" + sistema.getCapataces().get(i).getNombre() + " " + sistema.getCapataces().get(i).getCedula() + " " + sistema.getCapataces().get(i).getDireccion());
            }
            arch.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_subMenuExportacionDatosMousePressed

    private void subMenuRegistrarCapatazActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_subMenuRegistrarCapatazActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_subMenuRegistrarCapatazActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuGastos;
    private javax.swing.JMenu menuImpYExp;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenuItem subMenuEstadoObra;
    private javax.swing.JMenuItem subMenuExportacionDatos;
    private javax.swing.JMenuItem subMenuImportacionDatosObra;
    private javax.swing.JMenuItem subMenuPagoGasto;
    private javax.swing.JMenuItem subMenuRegistrarCapataz;
    private javax.swing.JMenuItem subMenuRegistrarRubro;
    private javax.swing.JMenuItem subMenuRegistroGasto;
    private javax.swing.JMenuItem subMenuRegistroObra;
    private javax.swing.JMenuItem subMenuRegistroPropietario;
    // End of variables declaration//GEN-END:variables
}
