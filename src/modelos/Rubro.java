/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author igjov
 */
public class Rubro implements Serializable{

    private String nombre; // unique
    private String descripcion;
    private int costo;

    public Rubro(String nombre, String descripcion, int costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String strRet = this.getNombre() + ": " + this.getDescripcion() + "\n";
        return strRet;
    }
}
