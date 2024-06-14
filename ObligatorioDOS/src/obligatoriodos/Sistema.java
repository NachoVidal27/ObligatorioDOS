package obligatoriodos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelos.*;

public class Sistema {

    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<Capataz> capataces = new ArrayList<>();

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
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
        sistema.generarCapataces();
        sistema.generarPropietarios();
        RegistroObra vent = new RegistroObra(sistema);
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

}
