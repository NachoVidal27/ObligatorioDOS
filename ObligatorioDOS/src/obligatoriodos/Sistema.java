package obligatoriodos;

import javax.swing.*;
import modelos.*;
import java.util.ArrayList;

public class Sistema {

    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<Capataz> capataces = new ArrayList<>();

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        // RegistrarPropietario vent = new RegistrarPropietario(sistema);
        // RegistrarPropietario vent = new RegistrarPropietario(sistema);
        RegistrarCapataz vent2 = new RegistrarCapataz(sistema);
        vent2.setVisible(true);
        // vent.setVisible(true);
    }

    // metodos de propietario
    public void setPropietario(Propietario propietario) {
        this.propietarios.add(propietario);
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
    public void setRubro(Rubro rurbro) {
        this.rubros.add(rurbro);
    }

    public ArrayList<Rubro> getRubrors() {
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

}
