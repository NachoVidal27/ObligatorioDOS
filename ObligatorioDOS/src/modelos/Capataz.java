package modelos;

public class Capataz {

    private String nombre;
    private String cedula;
    private String direccion;
    private int anioDeIngreso;

    public Capataz(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioDeIngreso(int anio) {
        return this.anioDeIngreso;
    }

    public void setAnioDeIngreso(int anio) {
        this.anioDeIngreso = anio;
    }

    @Override
    public String toString() {
        String strRet = this.getNombre() + " (" + this.getCedula() + ")";
        return strRet;
    }
}
