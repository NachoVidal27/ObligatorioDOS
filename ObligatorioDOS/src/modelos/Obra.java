/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author igjov
 */
public class Obra {
    private Propietario propietario;
    private Capataz capataz;
    private String direccion;
    private int mesDeComienzo;
    private int anioDeComienzo;
    private int presupuestoTotal;
    private int numeroDePermiso;
    private ArrayList<Rubro> rubrosPresupuestados = new ArrayList<>();
    private ArrayList<Rubro> rubrosNoPresupuestados = new ArrayList<>();
    private ArrayList<Gasto> gastos = new ArrayList<>();

    public Obra(Propietario propietario, Capataz capataz, String direccion, int mesDeComienzo, int anioDeComienzo,
            int presupuestoTotal, int numeroDePermiso) {
        this.propietario = propietario;
        this.capataz = capataz;
        this.direccion = direccion;
        this.mesDeComienzo = mesDeComienzo;
        this.anioDeComienzo = anioDeComienzo;
        this.presupuestoTotal = presupuestoTotal;
        this.numeroDePermiso = numeroDePermiso;
    }

    public ArrayList<Gasto> getGastos() {
        return this.gastos;
    }

    public ArrayList<Rubro> getRubrosPresupuestados() {
        return this.rubrosPresupuestados;
    }

    public ArrayList<Rubro> getRubrosNoPresupuestados() {
        return this.rubrosNoPresupuestados;
    }

    public Propietario getPropietario() {
        return this.propietario;
    }

    public Capataz getCapataz() {
        return this.capataz;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getMesDeComienzo() {
        return this.mesDeComienzo;
    }

    public int getAnioDeComienzo() {
        return this.anioDeComienzo;
    }

    public int getPresupuestoTotal() {
        return this.presupuestoTotal;
    }

    public int getNumeroDePermiso() {
        return this.numeroDePermiso;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setGastos(Gasto gastos) {
        this.gastos.add(gastos);
    }

    public void setRubrosPresupuestados(Rubro rubrosPresupuestado) {
        this.rubrosPresupuestados.add(rubrosPresupuestado);
    }

    public void setRubrosNoPresupuestados(Rubro rubrosNoPresupuestado) {
        this.rubrosNoPresupuestados.add(rubrosNoPresupuestado);
    }

    public void setCapataz(Capataz capataz) {
        this.capataz = capataz;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMesDeComienzo(int mesDeComienzo) {
        this.mesDeComienzo = mesDeComienzo;
    }

    public void setAnioDeComienzo(int anioDeComienzo) {
        this.anioDeComienzo = anioDeComienzo;
    }

    public void setPresupuestoTotal(int presupuestoTotal) {
        this.presupuestoTotal = presupuestoTotal;
    }

    public void setNumeroDePermiso(int numero) {
        this.numeroDePermiso = numero;
    }

    public int getTotalGastado() {
        int total = 0;
        for (int i = 0; i < gastos.size(); i++) {
            total += gastos.get(i).getMonto();
        }
        return total;
    }

    public ArrayList<Rubro> getRubros() {
        ArrayList<Rubro> rubros = new ArrayList();
        rubros.addAll(rubrosNoPresupuestados);
        rubros.addAll(rubrosPresupuestados);
        return rubros;
    }

    public int getGastosReintegrados() {
        int totalReintegrado = 0;
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getReintegrado() == true) {
                totalReintegrado += gastos.get(i).getMonto();
            }
        }
        return totalReintegrado;
    }

    public int getGastosNoReintegrados() {
        int totalNoReintegrado = 0;
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getReintegrado() == false) {
                totalNoReintegrado += gastos.get(i).getMonto();
            }
        }
        return totalNoReintegrado;
    }

    public boolean rubroEsPresupuestado(String nombreDelRubro) {
        boolean esPresupuestado = false;
        for (int i = 0; i < rubrosPresupuestados.size(); i++) {
            if (rubrosPresupuestados.get(i).getNombre().equals(nombreDelRubro)) {
                esPresupuestado = true;
            }
        }
        return esPresupuestado;
    }

}
