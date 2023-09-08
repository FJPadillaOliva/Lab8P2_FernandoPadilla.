
package lab8p2_fernandopadilla;

import java.io.Serializable;


public class Nadador implements Serializable{
    private String nombre;
    private Pais nacion;
    private String nacionalidad;
    private int edad;
    private double estatura;
    private String estilo;
    private int distancia;
    private double tiempoR;
    private int numMedallas;

    public Nadador() {
    }

    public Nadador(String nombre, Pais nacion,int edad, double estatura, String estilo, int distancia, double tiempoR, int numMedallas) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.nacionalidad = nacion.getNombre();
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.distancia = distancia;
        this.tiempoR = tiempoR;
        this.numMedallas = numMedallas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTiempoR() {
        return tiempoR;
    }

    public void setTiempoR(double tiempoR) {
        this.tiempoR = tiempoR;
    }

    public int getNumMedallas() {
        return numMedallas;
    }

    public void setNumMedallas(int numMedallas) {
        this.numMedallas = numMedallas;
    }

    public Pais getNacion() {
        return nacion;
    }

    public void setNacion(Pais nacion) {
        this.nacion = nacion;
    }
    

    @Override
    public String toString() {
        return  nombre + ", " + nacionalidad + ", " + distancia +"m, "+ estilo;
    }
    
    
}
