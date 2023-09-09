
package lab8p2_fernandopadilla;

import java.util.Random;
import javax.swing.JProgressBar;


public class administrarBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int valorM;

    public administrarBarra(JProgressBar barra, int valorM) {
        this.barra = barra;
        avanzar=true;
        vive=true;
        this.valorM = valorM;
    }
    
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getValorM() {
        return valorM;
    }

    public void setValorM(int valorM) {
        this.valorM = valorM;
    }
    
    
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                Random random = new Random();
                barra.setValue(barra.getValue()+(10+random.nextInt(25)));
                if(barra.getValue()==valorM){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

    
}
