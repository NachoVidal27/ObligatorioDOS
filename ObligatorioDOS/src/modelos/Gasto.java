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
    private boolean reintegrado;

    public Gasto(int monto, int mes, int anio, String descripcion, int numeroDeGasto, Rubro rubro, boolean reintegrado) {
        this.monto = monto;
        this.mes = mes;
        this.anio = anio;
        this.descripcion = descripcion;
        this.numeroDeGasto = numeroDeGasto;
        this.rubro = rubro;
        this.reintegrado = reintegrado;
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

    public boolean getReintegrado() {
        return reintegrado;
    }

    public void setReintegrado(boolean estado) {
        this.reintegrado = reintegrado;
    }

    @Override
    public String toString() {
        String strRet = "Monto: " + this.getMonto() + ", \nMes: " + this.getMes() + ", \nAño: " + this.getAnio() + ", \nDescripcion: " + this.getDescripcion() + ", \nNro gasto: " + this.getNumeroDeGasto() + ", \nRubro: " + this.getRubro() + "\nReintegrado: " + this.getReintegrado() + "\n";
        return strRet;
    }
}
