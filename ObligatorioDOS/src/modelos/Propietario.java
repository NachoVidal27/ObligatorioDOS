/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.io.Serializable;

/**
 *
 * @author igjov
 */
public class Propietario implements Serializable {
    private static final long serialVersionUID = 1L;
  private String nombre;
  private String cedula; 
  private String direccion;
  private int celular;

  public Propietario(String nombre, String cedula, String direccion, int celular) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.direccion = direccion;
    this.celular = celular;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCedula() {
    return cedula;
  }

  public String getDireccion() {
    return direccion;
  }

  public int getCelular() {
    return celular;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public void setCelular(int celular) {
    this.celular = celular;
  }

  @Override
  public String toString() {
    String strRet = this.getNombre() + " (" + this.getCedula() + ")";
    return strRet;
  }
}