
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_canciones = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sp_puntuacion = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        yc_date = new com.toedter.calendar.JYearChooser();
        jLabel7 = new javax.swing.JLabel();
        tf_artista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_album = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jd_playlist = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb_songs = new javax.swing.JComboBox<>();
        bt_addsong = new javax.swing.JButton();
        bt_addPlaylist = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_addC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_main = new javax.swing.JTextArea();
        bt_addP = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_abrir = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();

        jd_canciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Nueva Canción");
        jd_canciones.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setText("Nombre:");
        jd_canciones.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jd_canciones.getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, -1));

        jLabel5.setText("Puntuación:");
        jd_canciones.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        sp_puntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jd_canciones.getContentPane().add(sp_puntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 40, -1));

        jLabel6.setText("Release Date:");
        jd_canciones.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jd_canciones.getContentPane().add(yc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel7.setText("Artista:");
        jd_canciones.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        jd_canciones.getContentPane().add(tf_artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, -1));

        jLabel8.setText("Álbum:");
        jd_canciones.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jd_canciones.getContentPane().add(tf_album, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jd_canciones.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\grandienttt.jpg")); // NOI18N
        jd_canciones.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 470, 520));

        jd_playlist.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Agregar Playlist");
        jd_playlist.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel10.setText("Nombre:");
        jd_playlist.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jd_playlist.getContentPane().add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, -1));

        jLabel11.setText("Canción:");
        jd_playlist.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cb_songs.setBackground(new java.awt.Color(204, 0, 204));
        cb_songs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cb_songs.setForeground(new java.awt.Color(255, 255, 255));
        jd_playlist.getContentPane().add(cb_songs, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, -1));

        bt_addsong.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\1486485579-add-create-new-math-sign-plus_81190.png")); // NOI18N
        jd_playlist.getContentPane().add(bt_addsong, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 40, 40));

        bt_addPlaylist.setBackground(new java.awt.Color(204, 0, 204));
        bt_addPlaylist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_addPlaylist.setText("Agregar Playlist");
        jd_playlist.getContentPane().add(bt_addPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\grandienttt.jpg")); // NOI18N
        jd_playlist.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 470, 520));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PLAYLIST DE CLAU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 46, -1, -1));

        bt_addC.setBackground(new java.awt.Color(204, 0, 204));
        bt_addC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addC.setForeground(new java.awt.Color(255, 255, 255));
        bt_addC.setText("Agregar Canción");
        bt_addC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCMouseClicked(evt);
            }
        });
        getContentPane().add(bt_addC, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 169, -1, -1));

        ta_main.setColumns(20);
        ta_main.setRows(5);
        jScrollPane1.setViewportView(ta_main);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 127, 473, 253));

        bt_addP.setBackground(new java.awt.Color(204, 0, 204));
        bt_addP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_addP.setForeground(new java.awt.Color(255, 255, 255));
        bt_addP.setText("Agregar Playlist");
        bt_addP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addPMouseClicked(evt);
            }
        });
        getContentPane().add(bt_addP, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 254, -1, -1));

        bt_modificar.setBackground(new java.awt.Color(204, 0, 204));
        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar.setForeground(new java.awt.Color(255, 255, 255));
        bt_modificar.setText("Modificar");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });
        getContentPane().add(bt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 398, -1, -1));

        bt_eliminar.setBackground(new java.awt.Color(204, 0, 204));
        bt_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 398, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\1-18_icon-icons.com_69201.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 25, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\grandienttt.jpg")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 800, 480));

        jMenu1.setText("Archivo");

        jmi_abrir.setText("Abrir");
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_abrir);

        jmi_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_guardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirActionPerformed
        
        FileReader fr = null;
        BufferedReader br = null;
        try {
            JFileChooser jfc = new JFileChooser("./"); //donde deseamos que aparezca
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion==JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();//apunta hacia el objeto seleccionado
                fr = new FileReader(fichero);//apunta hacia el archivo
                br = new BufferedReader(fr);//apunta hacia el fileReader
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
            
        }
        
        
    }//GEN-LAST:event_jmi_abrirActionPerformed

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt"); //instanciar filtro
        jfc.addChoosableFileFilter(filtro);//aplicar filtro
        int seleccion = jfc.showSaveDialog(this);//seleccion
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {//si el archivo es un txt
                    fichero = new File(jfc.getSelectedFile().getPath() + ".txt");//el que le ponga el usuario
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < songs.size(); i++) { //recorrer el arraylist
                    Canciones s = songs.get(i);
                    bw.write(s.getNombre()+ "|" + s.getPuntuacion()+ "|" + s.getYear()+ "|" + s.getArtista() + "|" + s.getAlbum() + "|");//agregar al nuevo archivo cada nodo del arraylist
                    bw.newLine();
                }
                bw.flush();
                JOptionPane.showMessageDialog(this,"Se ha guardado el archivo");
            } catch (IOException e) {
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
        Administracion ap = new Administracion("./Vehiculos.txt");
        ap.cargarArchivo();
        ap.setListaVehiculos(songs);
        try {
            ap.escribirArchivo();
        } catch (IOException e) {
        }

        
    }//GEN-LAST:event_jmi_guardarActionPerformed

    private void bt_addCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCMouseClicked
        jd_canciones.setModal(true); //no poder tocar a principal
        jd_canciones.pack();//tamaño se acople a los controles preestablecidos
        jd_canciones.setVisible(true);
    }//GEN-LAST:event_bt_addCMouseClicked

    private void bt_addPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addPMouseClicked
        jd_playlist.setModal(true); //no poder tocar a principal
        jd_playlist.pack();//tamaño se acople a los controles preestablecidos
        jd_playlist.setVisible(true);
    }//GEN-LAST:event_bt_addPMouseClicked

    private void bt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modificarMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliminarMouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addC;
    private javax.swing.JButton bt_addP;
    private javax.swing.JButton bt_addPlaylist;
    private javax.swing.JButton bt_addsong;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JComboBox<String> cb_songs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_canciones;
    private javax.swing.JDialog jd_playlist;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JSpinner sp_puntuacion;
    private javax.swing.JTextArea ta_main;
    private javax.swing.JTextField tf_album;
    private javax.swing.JTextField tf_artista;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_nombre;
    private com.toedter.calendar.JYearChooser yc_date;
    // End of variables declaration//GEN-END:variables

    ArrayList<Canciones> songs = new ArrayList();
    File fichero =null; 
}
