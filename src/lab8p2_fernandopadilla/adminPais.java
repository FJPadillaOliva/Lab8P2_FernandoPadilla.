
package lab8p2_fernandopadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPais {
    
    private ArrayList<Pais> paises = new ArrayList();
    private File archivo = null;

    public adminPais(String path) {
        archivo = new File(path);
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirAPais(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Pais t : paises) {
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
    
    public void leerAPais(){
        try {           
            paises = new ArrayList();
            Pais temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Pais) objeto.readObject()) != null) {
                        paises.add(temp);
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
    
    public void add(Pais pais){
        paises.add(pais);
    }
}
