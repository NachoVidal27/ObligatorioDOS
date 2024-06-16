package obligatoriodos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.*;

public class Sistema implements Serializable {

    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<Capataz> capataces = new ArrayList<>();
    String modo;

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        //Crea rubros
        // cargarRubros(sistema);
        //Termina de crear rubros
        //--
        //iniciamos abriendo una ventana con el hero y configurando un time out para que se cierre en 3 segundos
        Hero heroVent = new Hero();
        heroVent.setVisible(true);
        //accionamos el time out para cerrar la ventana luego de 3 segundos
        CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS).execute(() -> {
            heroVent.setVisible(false);
            PedirOpcion pedirOpcionVent = new PedirOpcion(sistema);
            while (!pedirOpcionVent.haySeleccion) {
                pedirOpcionVent.setVisible(true);
            }
            if (pedirOpcionVent.haySeleccion) {
                System.out.println("hay seleccion");
                pedirOpcionVent.setVisible(false);
                String opcion = sistema.getModo();
                switch (opcion) {
                    case "soloRubros":
                        System.out.println("elegiste soloRubros");
                        cargarRubros(sistema);
                        break;
                    case "sistemaAnterior":
                        System.out.println("elegiste sistemaAnterior");
                        try {
                            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SistemaPrevio"));
                            sistema.propietarios = (ArrayList<Propietario>) in.readObject();
                            sistema.rubros = (ArrayList<Rubro>) in.readObject();
                            sistema.obras = (ArrayList<Obra>) in.readObject();
                            sistema.capataces = (ArrayList<Capataz>) in.readObject();
                        } catch (FileNotFoundException ex) {
                            JOptionPane.showMessageDialog(heroVent, "No se pudo encontrar un archivo para cargar el sistema previo.");
                            RegistrarRubro regVent = new RegistrarRubro(sistema);
                            regVent.setVisible(true);
                        } catch (IOException ex) {
                            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    default:
                        System.out.println("elegiste sistema vacio por descarte");
                        break;
                }

                MenuPrincipal menuPrincipalVent = new MenuPrincipal(sistema);
                menuPrincipalVent.setVisible(true);
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SistemaPrevio"));
                    out.writeObject(sistema.propietarios);
                    out.writeObject(sistema.rubros);
                    out.writeObject(sistema.obras);
                    out.writeObject(sistema.capataces);
                    out.close();
                } catch (NotSerializableException e) {
                    System.out.println(e);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }, "Shutdown thread"));

    }

    private String getModo() {
        return this.modo;
    }

    private void abrirRegistrarCapataz(Sistema sistema) {
        new RegistrarCapataz(sistema).setVisible(true);
    }

    public static void cargarRubros(Sistema sistema) {
        Rubro Pintura = new Rubro("Pintura", "Renovación de Pintura", 0);
        Rubro Sanitaria = new Rubro("Sanitaria", "Reparación de Sanitaria", 0);
        Rubro Eléctrica = new Rubro("Eléctrica", "Instalación Eléctrica", 0);
        Rubro Carpintería = new Rubro("Carpintería", "Trabajo en Madera", 0);
        Rubro Albañilería = new Rubro("Albañilería", "Reparación de Paredes", 0);
        Rubro Pisos = new Rubro("Pisos", "Instalación de pisos", 0);
        Rubro CambiodeVentanas = new Rubro("Cambio de Ventanas", "Reemplazo de Ventanas", 0);
        Rubro Baño = new Rubro("Baño", "Remodelación de Baño", 0);
        Rubro Cocina = new Rubro("Cocina", "Renovación de Cocina", 0);
        Rubro Aislamiento = new Rubro("Aislamiento", "Mejora Térmica", 0);
        sistema.setRubro(Pintura);
        sistema.setRubro(Sanitaria);
        sistema.setRubro(Eléctrica);
        sistema.setRubro(Carpintería);
        sistema.setRubro(Albañilería);
        sistema.setRubro(Pisos);
        sistema.setRubro(CambiodeVentanas);
        sistema.setRubro(Baño);
        sistema.setRubro(Cocina);
        sistema.setRubro(Aislamiento);

        //precargar datos         
        Propietario prop = new Propietario("ajuan", "123", "abc", 123);
        sistema.setPropietario(prop);
        Propietario prop2 = new Propietario("bjuan", "1234", "abc", 123);
        sistema.setPropietario(prop2);
        Capataz cap = new Capataz("apedro", "123", "abc");
        sistema.setCapataz(cap);
        Capataz cap2 = new Capataz("bpedro", "1234", "abc");
        sistema.setCapataz(cap2);
        Obra Eléctrica2 = new Obra(prop, cap, "obra 1", 0, 0, 10000, 524);
        sistema.setObra(Eléctrica2);
        Eléctrica2.setRubrosNoPresupuestados(Aislamiento);
        Cocina.setPresupuesto(1000);
        Eléctrica2.setRubrosPresupuestados(Cocina);
        Obra Eléctrica3 = new Obra(prop, cap, "obra 2", 0, 0, 0, 54);
        sistema.setObra(Eléctrica3);
        Gasto gasto = new Gasto(1200, 6, 2024, "desc", 1, Aislamiento, false);
        Eléctrica2.setGastos(gasto);
        Gasto gasto2 = new Gasto(1800, 6, 2024, "desc2", 2, Aislamiento, true);
        Eléctrica2.setGastos(gasto2);
        Gasto gasto3 = new Gasto(600, 6, 2024, "desc3", 1, Aislamiento, false);
        Eléctrica3.setGastos(gasto3);
        Gasto gasto4 = new Gasto(600, 6, 2024, "desc3", 2, Aislamiento, false);
        Eléctrica3.setGastos(gasto4);
        Gasto gasto5 = new Gasto(1200, 6, 2024, "desc", 4, Cocina, true);
        Eléctrica2.setGastos(gasto5);
        Gasto gasto6 = new Gasto(1200, 6, 2024, "desc", 3, Cocina, false);
        Eléctrica2.setGastos(gasto6);
        sistema.generarCapataces();
        sistema.generarPropietarios();
        sistema.generarCapataces();
        sistema.generarPropietarios();
    }

// metodos de propietario
    public void setPropietario(Propietario propietario) {
        this.propietarios.add(propietario);
    }

    public void generarPropietarios() {
        this.propietarios.add(new Propietario("PropNacho", "49007203", "Rivera 5013", Integer.parseInt("091459408")));
        this.propietarios
                .add(new Propietario("PropNicolas", "49323003", "Amazonas 1340", Integer.parseInt("09144448")));
    }

    public void generarCapataces() {
        this.capataces.add(new Capataz("CapatazNacho", "49007203", "Av italia 5012"));
        this.capataces.add(new Capataz("CapatazNicolas", "49037203", "Michigan 2980"));
    }

    public ArrayList<Propietario> getPropietarios() {
        return this.propietarios;
    }

    public boolean validarPropietario(Propietario propietario) {
        boolean esValido = true;
        String cedula = propietario.getCedula();
        for (Propietario p : propietarios) {
            if (p.getCedula().equals(cedula)) {
                esValido = false;
            }
        }
        return esValido;
    }

    public boolean validarPermiso(int permiso) {
        boolean esValido = true;
        for (Obra obra : obras) {
            if (permiso == obra.getNumeroDePermiso()) {
                esValido = false;
            }
        }
        return esValido;
    }

    // metodos rubros
    public void setRubro(Rubro rubro) {
        this.rubros.add(rubro);
    }

    public ArrayList<Rubro> getRubros() {
        return this.rubros;
    }

    // metodos obras
    public void setObra(Obra obra) {
        this.obras.add(obra);
    }

    public ArrayList<Obra> getObras() {
        return this.obras;
    }

    // metodos catapaces
    public void setCapataz(Capataz capataz) {
        this.capataces.add(capataz);
    }

    public ArrayList<Capataz> getCapataces() {
        return this.capataces;
    }

    public boolean validarCapataz(Capataz capataz) {
        boolean esValido = true;
        String cedula = capataz.getCedula();
        for (Capataz p : capataces) {
            if (p.getCedula().equals(cedula)) {
                esValido = false;
            }
        }
        return esValido;
    }

    public Capataz devolverCapatazPorCedula(String cedula) {
        Capataz capataz = new Capataz("nombre capataz", "Sin datos", "Sin datos");
        for (int i = 0; i < capataces.size(); i++) {
            if (capataces.get(i).getCedula().equals(cedula)) {
                capataz = capataces.get(i);
            }
        }
        return capataz;
    }

    public Propietario devolverPropietarioPorCedula(String cedula) {
        Propietario propietario = new Propietario("nombre propietario", "Sin datos", "Sin datos", 0);
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getCedula().equals(cedula)) {
                propietario = propietarios.get(i);
            }
        }
        return propietario;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Rubro devolverRubroPorNombre(String nombreRubro) {
        Rubro rubro = new Rubro("", "", 0);
        for (int i = 0; i < rubros.size(); i++) {
            if (rubros.get(i).getNombre().equals(nombreRubro)) {
                rubro = rubros.get(i);
            }
        }
        return rubro;
    }

}
