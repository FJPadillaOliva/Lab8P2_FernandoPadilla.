/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_fernandopadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wendy
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    ArrayList<Pais> paises = new ArrayList();
    ArrayList<Nadador> nadadores = new ArrayList();
    ArrayList<Evento> eventos = new ArrayList();
    ArrayList<Nadador> ganadores = new ArrayList();

    public DefaultComboBoxModel actualizarcbpais() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Pais t : paises) {
            modelo.addElement(t);
        }
        return modelo;
    }

    public DefaultComboBoxModel actualizarcbnadador() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Nadador t : nadadores) {
            modelo.addElement(t);
        }
        return modelo;
    }

    public DefaultComboBoxModel actualizarcbevento() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Evento t : eventos) {
            modelo.addElement(t);
        }
        return modelo;
    }

    public void escribirAPais(){
        File archivo = new File("./PaisesParticipantes.lab");
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
    
    public void escribirANadador(){
        File archivo = new File("./Nadadores.lab");
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
    
    public void escribirAEvento(){
        File archivo = new File("./Eventos.lab");
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
    
    public void leerAPais(){
        try {            
            File archivo = new File("./PaisesParticipantes.lab");
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
    
    public void leerANadador(){
        try {            
            File archivo = new File("./Nadadores.lab");
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
    
    public void leerAEvento(){
        try {            
            File archivo = new File("./Eventos.lab");
            Evento temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Evento) objeto.readObject()) != null) {
                        eventos.add(temp);
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombrePais = new javax.swing.JTextField();
        tf_numMPais = new javax.swing.JTextField();
        btn_crearPais = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreNadador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_estatura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        tf_tiempoNadador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_numMNadador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_nacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cb_distanciaNadador = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_estiloNadador = new javax.swing.JComboBox<>();
        btn_agregarNadador = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_estilosEvento = new javax.swing.JComboBox<>();
        cb_distanciaEvento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tf_recordEvento = new javax.swing.JTextField();
        btn_agregarEvento = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        cb_estilosEvento1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cb_distanciaEvento1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        tf_recordEvento1 = new javax.swing.JTextField();
        btn_modificarEvento = new javax.swing.JButton();
        btn_eliminarEvento = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        cb_evento = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tf_nombreNadador1 = new javax.swing.JTextField();
        tf_estatura1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_edad1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_tiempoNadador1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_numMNadador1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cb_distanciaNadador1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cb_estiloNadador1 = new javax.swing.JComboBox<>();
        btn_modificarNadador = new javax.swing.JButton();
        cb_nadador = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        btn_eliminarNadador = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cb_paises = new javax.swing.JComboBox<>();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("Nombre");

        jLabel2.setText("Num Medallas");

        btn_crearPais.setText("Crear");
        btn_crearPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearPaisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crearPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tf_nombrePais)
                            .addComponent(tf_numMPais, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(0, 408, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_numMPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_crearPais, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Pais", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setText("Nombre");

        jLabel5.setText("Estatura");

        jLabel6.setText("Edad");

        jLabel7.setText("Tiempo mas Rapido");

        jLabel8.setText("Numero de Medallas");

        jLabel4.setText("Nacionalidad");

        jLabel9.setText("Distancia");

        cb_distanciaNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        jLabel10.setText("Estilo");

        cb_estiloNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        btn_agregarNadador.setText("Agregar");
        btn_agregarNadador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarNadadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_agregarNadador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_distanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tf_tiempoNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(tf_numMNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_estiloNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_nombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cb_distanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_estiloNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_tiempoNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_numMNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_agregarNadador, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Nadador", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setText("Estilo");

        jLabel12.setText("Distancia");

        cb_estilosEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        cb_distanciaEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        jLabel13.setText("Record Actual");

        btn_agregarEvento.setText("Crear");
        btn_agregarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_estilosEvento, 0, 170, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(cb_distanciaEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(tf_recordEvento))
                        .addGap(0, 438, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_estilosEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_distanciaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_recordEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btn_agregarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Evento", jPanel4);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel22.setText("Estilo");

        cb_estilosEvento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        jLabel23.setText("Distancia");

        cb_distanciaEvento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        jLabel24.setText("Record Actual");

        btn_modificarEvento.setText("Modificar");
        btn_modificarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarEventoMouseClicked(evt);
            }
        });

        btn_eliminarEvento.setText("Eliminar");
        btn_eliminarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarEventoMouseClicked(evt);
            }
        });

        jLabel25.setText("Evento");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_modificarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(btn_eliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_estilosEvento1, 0, 170, Short.MAX_VALUE)
                            .addComponent(jLabel23)
                            .addComponent(cb_distanciaEvento1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24)
                            .addComponent(tf_recordEvento1))
                        .addGap(178, 178, 178)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_evento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_estilosEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_distanciaEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_recordEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(btn_eliminarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar/Elim Evento", jPanel7);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel14.setText("Nombre");

        jLabel15.setText("Estatura");

        jLabel16.setText("Edad");

        jLabel17.setText("Tiempo mas Rapido");

        jLabel18.setText("Numero de Medallas");

        jLabel19.setText("Distancia");

        cb_distanciaNadador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        jLabel20.setText("Estilo");

        cb_estiloNadador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        btn_modificarNadador.setText("Modificar");
        btn_modificarNadador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarNadadorMouseClicked(evt);
            }
        });

        jLabel21.setText("Nadador");

        btn_eliminarNadador.setText("Eliminar");
        btn_eliminarNadador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarNadadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(tf_estatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_distanciaNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(tf_tiempoNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(tf_numMNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(tf_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_estiloNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tf_nombreNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_nadador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_modificarNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminarNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_nadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_estatura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cb_distanciaNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_estiloNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_tiempoNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_numMNadador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificarNadador, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btn_eliminarNadador, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar/Elim Nadador", jPanel6);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nacionalidad", "Edad", "Estatura", "Estilo", "Distancia", "Tiempo", "Medallas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_paises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btn_actualizar)
                        .addGap(23, 23, 23))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cb_paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Nadadores", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearPaisMouseClicked
        // TODO add your handling code here:
        boolean repetido = false;
        if (tf_nombrePais.getText().isEmpty() || tf_numMPais.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los parametros no deben estar vacios");
        } else {
            for (Pais t : paises) {
                if (t.getNombre().equals(tf_nombrePais.getText())) {
                    repetido = true;
                }
            }
            if (repetido) {
                JOptionPane.showMessageDialog(this, "El pais ya existe");
            } else {
                paises.add(new Pais(tf_nombrePais.getText(), Integer.parseInt(tf_numMPais.getText())));
                JOptionPane.showMessageDialog(this, "Agregado exitosamente");
                cb_nacionalidad.setModel(actualizarcbpais());
                cb_paises.setModel(actualizarcbpais());
                escribirAPais();
            }
            tf_nombrePais.setText("");
            tf_numMPais.setText("");
        }
    }//GEN-LAST:event_btn_crearPaisMouseClicked

    private void btn_agregarNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarNadadorMouseClicked
        // TODO add your handling code here:
        if (tf_nombreNadador.getText().isEmpty()
                || tf_edad.getText().isEmpty()
                || tf_estatura.getText().isEmpty()
                || tf_numMNadador.getText().isEmpty()
                || tf_tiempoNadador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los parametros no deben estar vacios");
        } else {
            Pais nacionalidad = paises.get(cb_nacionalidad.getSelectedIndex());
            if (nacionalidad.getNadadores().size() < 2) {
                String nombre = tf_nombreNadador.getText();
                int edad = Integer.parseInt(tf_edad.getText());
                double estatura = Double.parseDouble(tf_estatura.getText());
                int numMNadador = Integer.parseInt(tf_numMNadador.getText());
                double tiempo = Double.parseDouble(tf_tiempoNadador.getText());
                int distancia = Integer.parseInt(cb_distanciaNadador.getSelectedItem().toString().replace("m", ""));
                String estilo = cb_estiloNadador.getSelectedItem().toString();
                nacionalidad.getNadadores().add(new Nadador(nombre, nacionalidad, edad, estatura, estilo, distancia, tiempo, numMNadador));
                nadadores.add(new Nadador(nombre, nacionalidad, edad, estatura, estilo, distancia, tiempo, numMNadador));
                JOptionPane.showMessageDialog(this, "Agregado exitosamente");
                cb_nadador.setModel(actualizarcbnadador());
                escribirANadador();
            } else {
                JOptionPane.showMessageDialog(this, "El pais seleccionado ya cuenta con dos nadadores");
            }
            tf_nombreNadador.setText("");
            tf_edad.setText("");
            tf_estatura.setText("");
            tf_numMNadador.setText("");
            tf_tiempoNadador.setText("");
        }
    }//GEN-LAST:event_btn_agregarNadadorMouseClicked

    private void btn_modificarNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarNadadorMouseClicked
        // TODO add your handling code here:
        if (cb_nadador.getSelectedIndex() >= 0) {
            if (tf_nombreNadador1.getText().isEmpty()
                    || tf_edad1.getText().isEmpty()
                    || tf_estatura1.getText().isEmpty()
                    || tf_numMNadador1.getText().isEmpty()
                    || tf_tiempoNadador1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Los parametros no deben estar vacios");
            } else {
                Pais nacionalidad = nadadores.get(cb_nadador.getSelectedIndex()).getNacion();
                String nombre = tf_nombreNadador1.getText();
                int edad = Integer.parseInt(tf_edad1.getText());
                double estatura = Double.parseDouble(tf_estatura1.getText());
                int numMNadador = Integer.parseInt(tf_numMNadador1.getText());
                double tiempo = Double.parseDouble(tf_tiempoNadador1.getText());
                int distancia = Integer.parseInt(cb_distanciaNadador1.getSelectedItem().toString().replace("m", ""));
                String estilo = cb_estiloNadador1.getSelectedItem().toString();
                nacionalidad.getNadadores().remove(nadadores.get(cb_nadador.getSelectedIndex()));
                nacionalidad.getNadadores().add(new Nadador(nombre, nacionalidad, edad, estatura, estilo, distancia, tiempo, numMNadador));
                nadadores.remove(cb_nadador.getSelectedItem());
                nadadores.add(new Nadador(nombre, nacionalidad, edad, estatura, estilo, distancia, tiempo, numMNadador));
                JOptionPane.showMessageDialog(this, "Modificado exitosamente");
                tf_nombreNadador1.setText("");
                tf_edad1.setText("");
                tf_estatura1.setText("");
                tf_numMNadador1.setText("");
                tf_tiempoNadador1.setText("");
                cb_nadador.setModel(actualizarcbnadador());
                escribirANadador();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un nadador a modificar");
        }
    }//GEN-LAST:event_btn_modificarNadadorMouseClicked

    private void btn_eliminarNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarNadadorMouseClicked
        // TODO add your handling code here:
        if (cb_nadador.getSelectedIndex() >= 0) {
            nadadores.remove(cb_nadador.getSelectedIndex());
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            cb_nadador.setModel(actualizarcbnadador());
            escribirANadador();
        }
    }//GEN-LAST:event_btn_eliminarNadadorMouseClicked

    private void btn_eliminarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarEventoMouseClicked
        // TODO add your handling code here:
        if (cb_evento.getSelectedIndex() >= 0) {
            eventos.remove(cb_evento.getSelectedIndex());
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            cb_evento.setModel(actualizarcbevento());
            escribirAEvento();
        }
    }//GEN-LAST:event_btn_eliminarEventoMouseClicked

    private void btn_agregarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarEventoMouseClicked
        // TODO add your handling code here:
        if (tf_recordEvento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los parametros no deben estar vacios");
        } else {
            eventos.add(new Evento(cb_estilosEvento.getSelectedItem().toString(),
                    Integer.parseInt(cb_distanciaEvento.getSelectedItem().toString().replace("m", "")),
                    Double.parseDouble(tf_recordEvento.getText())));
            JOptionPane.showMessageDialog(this, "Agregado exitosamente");
            cb_evento.setModel(actualizarcbevento());
            escribirAEvento();
        }
        tf_recordEvento.setText("");
    }//GEN-LAST:event_btn_agregarEventoMouseClicked

    private void btn_modificarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarEventoMouseClicked
        // TODO add your handling code here:
        if (tf_recordEvento1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los parametros no deben estar vacios");
        } else {
            eventos.remove(cb_evento.getSelectedItem());
            eventos.add(new Evento(cb_estilosEvento1.getSelectedItem().toString(),
                    Integer.parseInt(cb_distanciaEvento1.getSelectedItem().toString().replace("m", "")),
                    Double.parseDouble(tf_recordEvento1.getText())));
            JOptionPane.showMessageDialog(this, "Agregado exitosamente");
            cb_evento.setModel(actualizarcbevento());
            escribirAEvento();
        }
        tf_recordEvento1.setText("");
    }//GEN-LAST:event_btn_modificarEventoMouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        // TODO add your handling code here:
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Nacionalidad", "Edad", "Estatura", "Estilo", "Distancia", "Tiempo", "Medallas"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        if (cb_paises.getSelectedIndex() >= 0) {
            for (Nadador t : paises.get(cb_paises.getSelectedIndex()).getNadadores()) {
                Object[] row = {t.getNombre(),t.getNacionalidad(),t.getEdad(),t.getEstatura(),t.getEstilo(),t.getDistancia(),t.getTiempoR(),t.getNumMedallas() 
            };
                modelo.addRow(row);
            }
        }

    }//GEN-LAST:event_btn_actualizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregarEvento;
    private javax.swing.JButton btn_agregarNadador;
    private javax.swing.JButton btn_crearPais;
    private javax.swing.JButton btn_eliminarEvento;
    private javax.swing.JButton btn_eliminarNadador;
    private javax.swing.JButton btn_modificarEvento;
    private javax.swing.JButton btn_modificarNadador;
    private javax.swing.JComboBox<String> cb_distanciaEvento;
    private javax.swing.JComboBox<String> cb_distanciaEvento1;
    private javax.swing.JComboBox<String> cb_distanciaNadador;
    private javax.swing.JComboBox<String> cb_distanciaNadador1;
    private javax.swing.JComboBox<String> cb_estiloNadador;
    private javax.swing.JComboBox<String> cb_estiloNadador1;
    private javax.swing.JComboBox<String> cb_estilosEvento;
    private javax.swing.JComboBox<String> cb_estilosEvento1;
    private javax.swing.JComboBox<String> cb_evento;
    private javax.swing.JComboBox<String> cb_nacionalidad;
    private javax.swing.JComboBox<String> cb_nadador;
    private javax.swing.JComboBox<String> cb_paises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_edad1;
    private javax.swing.JTextField tf_estatura;
    private javax.swing.JTextField tf_estatura1;
    private javax.swing.JTextField tf_nombreNadador;
    private javax.swing.JTextField tf_nombreNadador1;
    private javax.swing.JTextField tf_nombrePais;
    private javax.swing.JTextField tf_numMNadador;
    private javax.swing.JTextField tf_numMNadador1;
    private javax.swing.JTextField tf_numMPais;
    private javax.swing.JTextField tf_recordEvento;
    private javax.swing.JTextField tf_recordEvento1;
    private javax.swing.JTextField tf_tiempoNadador;
    private javax.swing.JTextField tf_tiempoNadador1;
    // End of variables declaration//GEN-END:variables
}
