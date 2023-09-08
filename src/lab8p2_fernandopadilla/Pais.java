
package lab8p2_fernandopadilla;

import java.io.Serializable;
import java.util.ArrayList;


public class Pais implements Serializable{
    private String nombre;
    private ArrayList<Nadador> nadadores = new ArrayList();
    private int numMedallas;

    public Pais() {
    }

    public Pais(String nombre, int numMedallas) {
        this.nombre = nombre;
        this.numMedallas = numMedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getNumMedallas() {
        return numMedallas;
    }

    public void setNumMedallas(int numMedallas) {
        this.numMedallas = numMedallas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
