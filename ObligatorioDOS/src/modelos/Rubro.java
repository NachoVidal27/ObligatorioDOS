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
    private int presupuesto; //indica el presupuesto alocado a los gastos de este rubro

    public Rubro(String nombre, String descripcion, int presupuesto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
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
