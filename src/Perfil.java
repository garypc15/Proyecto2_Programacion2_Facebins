
import java.awt.Image;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Perfil.java
 *
 * Created on 11-22-2011, 07:17:20 PM
 */
/**
 *
 * @author Gary
 */
public class Perfil extends javax.swing.JFrame {
           
            static String correo= "";
            Date d = new Date();
            static int CONT = 0;
            static String a = "";
        
     
    /** Creates new form Perfil */
    public Perfil() {
     

    
        initComponents();
 
        Registro rg = new Registro();
                 
        Facebook fb = new Facebook();
        
        infoPerfil.setText(fb.iPerfil(correo));
       
        //if(!poster.getText().equals(""))
        poster.setText(fb.showComment(correo));
        // fb.closePost(correo);
 
       String amm[]=  fb.misAmigos(Perfil.correo);
          
       DefaultListModel modelo = new DefaultListModel();
                   for(int i=0;i<amm.length;i++ ){
                
           modelo.add(i,amm[i]);
           }
     
           
       listAmigos.setModel(modelo);      
 
    }
    
    private ImageIcon getFoto() {
JFileChooser chooser = new JFileChooser();
chooser.setDialogTitle("Foto de Perfil");
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
int opcion = chooser.showOpenDialog(this);
if (opcion == JFileChooser.APPROVE_OPTION){

String fotoPath = chooser.getSelectedFile().getAbsolutePath();
ImageIcon foto= new ImageIcon(fotoPath);

ImageIcon fotoReal1= new ImageIcon(foto.getImage().getScaledInstance(this.CuadroFoto.getWidth(), this.CuadroFoto.getHeight(), Image.SCALE_DEFAULT));
CuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silueta.jpg"))); // NOI18N
return fotoReal1;
}
return null;
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Solicitudes = new javax.swing.JButton();
        request = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoPerfil = new javax.swing.JTextPane();
        CuadroFoto = new javax.swing.JLabel();
        BotFoto = new javax.swing.JButton();
        ClickPost = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        post = new javax.swing.JEditorPane();
        poster = new java.awt.TextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAmigos = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        verPerfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(935, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        Solicitudes.setText("Buscar Amigos");
        Solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SolicitudesMouseReleased(evt);
            }
        });
        Solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitudesActionPerformed(evt);
            }
        });
        getContentPane().add(Solicitudes);
        Solicitudes.setBounds(770, 500, 140, 20);

        request.setText("Solicitudes");
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                requestMouseReleased(evt);
            }
        });
        getContentPane().add(request);
        request.setBounds(770, 550, 150, 30);

        jButton3.setText("Modificar Perfil");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(770, 610, 150, 30);

        LogOut.setText("LogOut");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LogOutMouseReleased(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(830, 10, 86, 23);

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36));
        jLabel2.setForeground(new java.awt.Color(51, 255, 153));
        jLabel2.setText("FACEBINS 3.0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 640, 229, 30);

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 255, 102));
        jLabel3.setText("Mi Perfil");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 10, 130, 30);

        infoPerfil.setBackground(new java.awt.Color(102, 102, 102));
        infoPerfil.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 255, 102)));
        infoPerfil.setEditable(false);
        infoPerfil.setForeground(new java.awt.Color(51, 255, 102));
        jScrollPane1.setViewportView(infoPerfil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 210, 160);

        CuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silueta.jpg"))); // NOI18N
        CuadroFoto.setText("cuadrofoto");
        CuadroFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 255, 153)));
        getContentPane().add(CuadroFoto);
        CuadroFoto.setBounds(30, 60, 160, 170);

        BotFoto.setText("Cambiar Foto");
        BotFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotFotoMouseReleased(evt);
            }
        });
        getContentPane().add(BotFoto);
        BotFoto.setBounds(60, 260, 110, 23);

        ClickPost.setText("Post");
        ClickPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ClickPostMouseReleased(evt);
            }
        });
        getContentPane().add(ClickPost);
        ClickPost.setBounds(630, 160, 70, 23);

        jScrollPane4.setHorizontalScrollBar(null);

        post.setBackground(new java.awt.Color(153, 153, 153));
        post.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 102)));
        post.setFont(new java.awt.Font("Tahoma", 1, 11));
        post.setForeground(new java.awt.Color(0, 255, 153));
        post.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                postKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(post);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(290, 60, 420, 70);

        poster.setBackground(new java.awt.Color(153, 153, 153));
        poster.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        poster.setEditable(false);
        poster.setFont(new java.awt.Font("Dialog", 1, 12));
        poster.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(poster);
        poster.setBounds(300, 250, 410, 400);

        listAmigos.setBackground(new java.awt.Color(102, 102, 102));
        listAmigos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listAmigos.setForeground(new java.awt.Color(0, 255, 153));
        jScrollPane2.setViewportView(listAmigos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(780, 150, 120, 240);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setText("MIS AMIGOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(790, 90, 130, 50);

        verPerfil.setText("Ver Pefil");
        verPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verPerfilMouseReleased(evt);
            }
        });
        getContentPane().add(verPerfil);
        verPerfil.setBounds(800, 400, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LogOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseReleased

        
        login lg = new login();
        
        this.dispose();
        lg.setVisible(true);

        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutMouseReleased

    private void BotFotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotFotoMouseReleased
ImageIcon foto= this.getFoto();

if ( foto!= null){
this.CuadroFoto.setIcon(foto);

} else {
JOptionPane.showMessageDialog(this, "Ocurrio un error");
}        // TODO add your handling code here:
    }//GEN-LAST:event_BotFotoMouseReleased

    private void SolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitudesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolicitudesActionPerformed

    private void postKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postKeyTyped

        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_postKeyTyped

    private void ClickPostMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickPostMouseReleased

        Facebook fb = new Facebook();  
   
        if(post.getText().equals("")){
            return;
        }
            
        Calendar c = Calendar.getInstance();
        
        if(poster.getText().equals("")){
        String   ff =post.getText()+"\n"+c.getTime()+"\n\n";
        fb.addComment(correo, ff);
        poster.setText(fb.showComment(correo));
       
        }else{
        
        String pp =poster.getText();
        String   ff = post.getText()+"\n"+c.getTime()+"\n\n"+pp;
        fb.addComment(correo, ff);
        poster.setText(fb.showComment(correo));
       
       
        }
          
        post.setText("");
    }//GEN-LAST:event_ClickPostMouseReleased

    private void SolicitudesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitudesMouseReleased

        BuscarAmigos ba = new BuscarAmigos();
        
        ba.setVisible(true) ;
   
        
        
        
        // TODO add your handling code here:ll
        
    }//GEN-LAST:event_SolicitudesMouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseReleased

    private void requestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseReleased

        FriendRequest amiguito = new FriendRequest();
       
        Facebook fb = new Facebook();
//        fb.arrAmigos(Perfil.correo);
//         String names []=new String[fb.contAmigos(Perfil.correo)];
//           
        amiguito.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_requestMouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased

        
        ModificarPerfil mp = new ModificarPerfil();
        
        mp.setVisible(true);
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseReleased

    private void verPerfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPerfilMouseReleased

  String am =(String) listAmigos.getSelectedValue();
  String ma =(String) listAmigos.getSelectedValue();
  
  perfilAmigo.cc=am;
  perfilAmigo pa = new perfilAmigo(am);
        
        pa.setVisible(true);
        dispose();
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_verPerfilMouseReleased

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }
    
    public void setImage(String c){
        Facebook fb = new Facebook();
        try{
            RandomAccessFile raff= new RandomAccessFile(fb.path()+c+"\\"+"fotop.fbn","rw");
            
            String path=raff.readUTF();
            System.out.println(path);
            CuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); // NOI18N
      
        }catch(Exception ex){
            
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotFoto;
    private javax.swing.JButton ClickPost;
    private javax.swing.JLabel CuadroFoto;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Solicitudes;
    private javax.swing.JTextPane infoPerfil;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listAmigos;
    private javax.swing.JEditorPane post;
    private java.awt.TextArea poster;
    private javax.swing.JButton request;
    private javax.swing.JButton verPerfil;
    // End of variables declaration//GEN-END:variables


}
