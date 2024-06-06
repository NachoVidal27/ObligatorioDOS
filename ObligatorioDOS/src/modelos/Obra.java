/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

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
    private String numeroDePermiso;

    public Obra(Propietario propietario, Capataz capataz, String direccion, int mesDeComienzo, int anioDeComienzo,
            int presupuestoTotal) {
        this.propietario = propietario;
        this.capataz = capataz;
        this.direccion = direccion;
        this.mesDeComienzo = mesDeComienzo;
        this.anioDeComienzo = anioDeComienzo;
        this.presupuestoTotal = presupuestoTotal;
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

    public String getNumeroDePermiso() {
        return this.numeroDePermiso;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
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

    public void setNumeroDePermiso(String numero) {
        this.numeroDePermiso = numero;
    }

}
