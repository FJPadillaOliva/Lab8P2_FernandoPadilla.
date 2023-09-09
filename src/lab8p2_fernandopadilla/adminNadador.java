
package lab8p2_fernandopadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminNadador {
    
    private ArrayList<Nadador> nadadores = new ArrayList();
    private File archivo = null;

    public adminNadador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void leerANadador(){
        try {
            nadadores = new ArrayList();
            Nadador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Nadador) objeto.readObject()) != null) {
                        nadadores.add(temp);
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
    
    public void escribirANadador(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Nadador t : nadadores) {
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
    public void add(Nadador nadador){
        nadadores.add(nadador);
    }
}
