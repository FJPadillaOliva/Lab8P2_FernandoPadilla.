
package lab8p2_fernandopadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminGanadores {
    private ArrayList<Nadador> ganadores = new ArrayList();
    private File archivo = null;

    public adminGanadores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Nadador> getGanadores() {
        return ganadores;
    }

    public void setGanadores(ArrayList<Nadador> ganadores) {
        this.ganadores = ganadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void add(Nadador nadador){
        ganadores.add(nadador);
    }
    
    public void leerAGanador(){
        try {
            ganadores = new ArrayList();
            Nadador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Nadador) objeto.readObject()) != null) {
                        ganadores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirAGanador(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Nadador t : ganadores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
