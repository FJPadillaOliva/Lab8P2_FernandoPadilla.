
package lab8p2_fernandopadilla;


public class Nadador {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private double estatura;
    private String estilo;
    private int distancia;
    private double tiempoR;
    private int numMedallas;

    public Nadador() {
    }

    public Nadador(String nombre, String nacionalidad, int edad, double estatura, String estilo, int distancia, double tiempoR, int numMedallas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
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

    @Override
    public String toString() {
        return  nombre + ", " + nacionalidad;
    }
    
    
}
