/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Gasto {

    private int monto;
    private int mes;
    private int anio;
    private String descripcion;
    private int numeroDeGasto;
    private Rubro rubro;

    public Gasto(int monto, int mes, int anio, String descripcion, int numeroDeGasto, Rubro rubro) {
        this.monto = monto;
        this.mes = mes;
        this.anio = anio;
        this.descripcion = descripcion;
        this.numeroDeGasto = numeroDeGasto;
        this.rubro = rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public int getMonto() {
        return monto;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroDeGasto() {
        return numeroDeGasto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumeroDeGasto(int numeroDeGasto) {
        this.numeroDeGasto = numeroDeGasto;
    }

    @Override
    public String toString() {
        String strRet = "Monto: " + this.getMonto() + ", \nMes: " + this.getMes() + ", \nAño: " + this.getAnio() + ", \nDescripcion: " + this.getDescripcion() + ", \nNro gasto: " + this.getNumeroDeGasto() + ", \nRubro: " + this.getRubro().getNombre() + "\n";
        return strRet;
    }
}
