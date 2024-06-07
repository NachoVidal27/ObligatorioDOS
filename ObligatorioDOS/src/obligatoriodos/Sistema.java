package obligatoriodos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import modelos.*;
import java.util.ArrayList;

public class Sistema {

    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<Capataz> capataces = new ArrayList<>();

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Rubros"));
            Rubro Pintura = (Rubro) in.readObject();
            sistema.setRubro(Pintura);
            Rubro Sanitaria = (Rubro) in.readObject();
            sistema.setRubro(Sanitaria);
            Rubro Eléctrica = (Rubro) in.readObject();
            sistema.setRubro(Eléctrica);
            Rubro Carpintería = (Rubro) in.readObject();
            sistema.setRubro(Carpintería);
            Rubro Albañilería = (Rubro) in.readObject();
            sistema.setRubro(Albañilería);
            Rubro Pisos = (Rubro) in.readObject();
            sistema.setRubro(Pisos);
            Rubro CambiodeVentanas = (Rubro) in.readObject();
            sistema.setRubro(CambiodeVentanas);
            Rubro Baño = (Rubro) in.readObject();
            sistema.setRubro(Baño);
            Rubro Cocina = (Rubro) in.readObject();
            sistema.setRubro(Cocina);
            Rubro Aislamiento = (Rubro) in.readObject();
            sistema.setRubro(Aislamiento);
            in.close();
            System.out.println(sistema.getRubros().toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        // RegistrarPropietario vent = new RegistrarPropietario(sistema);
        //RegistrarPropietario vent = new RegistrarPropietario(sistema);
        RegistrarRubro vent = new RegistrarRubro(sistema);
        vent.setVisible(true);
    }

    //metodos de propietario
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

    //metodos rubros
    public void setRubro(Rubro rubro) {
        this.rubros.add(rubro);
    }

    public ArrayList<Rubro> getRubros() {
        return this.rubros;
    }

    //metodos obras
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
