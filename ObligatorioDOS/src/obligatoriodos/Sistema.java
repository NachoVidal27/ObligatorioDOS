package obligatoriodos;
 
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import modelos.*;
 
public class Sistema {
 
    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<Capataz> capataces = new ArrayList<>();
 
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        //Crea rubros
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
        //Termina de crear rubros
 
        //Crea datos de prueba
        Propietario prop = new Propietario("juan", "123", "abc", 123);
        Capataz cap = new Capataz("pedro", "123", "abc");
        Obra Eléctrica2 = new Obra(prop, cap, "obra 1", 0, 0, 0, 524);
        sistema.setObra(Eléctrica2);
        Eléctrica2.setRubrosNoPresupuestados(Aislamiento);
        Cocina.setPresupuesto(1000);
        Eléctrica2.setRubrosPresupuestados(Cocina);
        Obra Eléctrica3 = new Obra(prop, cap, "obra 2", 0, 0, 0, 54);
        sistema.setObra(Eléctrica3);
        Gasto gasto = new Gasto(1200, 6, 2024, "desc", 1, Aislamiento, false);
        Eléctrica2.setGastos(gasto);
        Gasto gasto5 = new Gasto(1200, 6, 2024, "desc", 4, Cocina, true);
        Eléctrica2.setGastos(gasto5);
        Gasto gasto6 = new Gasto(1200, 6, 2024, "desc", 3, Cocina, false);
        Eléctrica2.setGastos(gasto6);
        Gasto gasto2 = new Gasto(1800, 6, 2024, "desc2", 2, Aislamiento, true);
        Eléctrica2.setGastos(gasto2);
        Gasto gasto3 = new Gasto(600, 6, 2024, "desc3", 1, Aislamiento, false);
        Eléctrica3.setGastos(gasto3);
        Gasto gasto4 = new Gasto(600, 6, 2024, "desc3", 2, Aislamiento, false);
        Eléctrica3.setGastos(gasto4);
        sistema.generarCapataces();
        sistema.generarPropietarios();
        //Termina de crear datos de prueba

        MenuPrincipal vent = new MenuPrincipal(sistema);
        vent.setVisible(true);
 
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
 
}