/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Dimension;
import java.util.Calendar;
import javax.swing.DefaultListModel;
/*
 * HomeFeed.java
 *
 * Created on 11-22-2011, 06:27:30 PM
 */
/**
 *
 * @author Gary
 */
public class HomeFeed extends javax.swing.JFrame {

    /** Creates new form HomeFeed */
    public HomeFeed() {
        
        initComponents();
    }
    
    
    
    @Override
    public void setSize(int i, int i1) {

        super.setSize(500,500);
    

    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogOut2 = new javax.swing.JButton();
        PROFILE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        poster = new java.awt.TextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        post = new javax.swing.JEditorPane();
        Solicitudes = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ClickPost = new javax.swing.JButton();
        request = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(690, 574));
        setResizable(false);
        getContentPane().setLayout(null);

        LogOut2.setText("LogOut");
        LogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LogOut2MouseReleased(evt);
            }
        });
        getContentPane().add(LogOut2);
        LogOut2.setBounds(570, 20, 70, 40);

        PROFILE.setText("Perfil");
        PROFILE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PROFILEMouseReleased(evt);
            }
        });
        PROFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROFILEActionPerformed(evt);
            }
        });
        getContentPane().add(PROFILE);
        PROFILE.setBounds(490, 20, 67, 40);

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36));
        jLabel2.setForeground(new java.awt.Color(51, 255, 153));
        jLabel2.setText("FACEBINS 3.0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 229, 47);

        poster.setBackground(new java.awt.Color(153, 153, 153));
        poster.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        poster.setEditable(false);
        poster.setFont(new java.awt.Font("Dialog", 1, 12));
        poster.setForeground(new java.awt.Color(0, 255, 153));
        getContentPane().add(poster);
        poster.setBounds(30, 200, 410, 330);

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
        jScrollPane4.setBounds(40, 80, 410, 70);

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
        Solicitudes.setBounds(460, 210, 140, 20);

        jButton3.setText("Modificar Perfil");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 320, 150, 30);

        ClickPost.setText("Post");
        ClickPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ClickPostMouseReleased(evt);
            }
        });
        getContentPane().add(ClickPost);
        ClickPost.setBounds(370, 160, 70, 23);

        request.setText("Solicitudes");
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                requestMouseReleased(evt);
            }
        });
        getContentPane().add(request);
        request.setBounds(460, 270, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PROFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROFILEActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_PROFILEActionPerformed

    private void PROFILEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMouseReleased

        Perfil profile = new Perfil();
        profile.setVisible(true);   
        profile.setImage(Perfil.correo);
        this.dispose();        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_PROFILEMouseReleased

    private void LogOut2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut2MouseReleased
      
        login lg = new login ();
        this.dispose();
        lg.setVisible(true); 
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOut2MouseReleased

    private void postKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postKeyTyped
        
        
        
        
        // TODO add your handling code here:
}//GEN-LAST:event_postKeyTyped

    private void SolicitudesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitudesMouseReleased
        
        BuscarAmigos ba = new BuscarAmigos();
        
        ba.setVisible(true) ;
        
        
        
        
        // TODO add your handling code here:ll
    }//GEN-LAST:event_SolicitudesMouseReleased

    private void SolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitudesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_SolicitudesActionPerformed

    private void requestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseReleased
        
        Facebook fb = new Facebook ();
        login lg = new login();
         String am[]=  fb.soliAmigos(lg.correo);
           
        DefaultListModel model = new DefaultListModel();

        try{
            for(int i=0;i<am.length;i++ ){
                
            model.add(i,am[i]);
            }
      
            
        
        }catch(Exception s ){
            
        }
        
        FriendRequest amiguito = new FriendRequest();
        
        amiguito.setVisible(true);
        dispose();
        
        // TODO add your handling code here:
}//GEN-LAST:event_requestMouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        
        
        ModificarPerfil mp = new ModificarPerfil();
        
        mp.setVisible(true);
        
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_jButton3MouseReleased

    private void ClickPostMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickPostMouseReleased
        
        Facebook fb = new Facebook();
        
        if(post.getText().equals("")){
            return;
        }
        
        Calendar c = Calendar.getInstance();
        
        if(poster.getText().equals("")){
            String   ff =fb.getNombre(Perfil.correo) +"\n"+post.getText()+"\n"+c.getTime()+"\n\n";
        //    fb.addComment(correo, ff);
         //   poster.setText(fb.showComment(correo));
            
        }else{
            
            String pp =poster.getText();
            String   ff =fb.getNombre(Perfil.correo) +"\n"+ post.getText()+"\n"+c.getTime()+"\n\n"+pp;
           // fb.addComment(correo, ff);
           // poster.setText(fb.showComment(correo));
            
            
        }
        
        post.setText("");
}//GEN-LAST:event_ClickPostMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HomeFeed().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClickPost;
    private javax.swing.JButton LogOut2;
    private javax.swing.JButton PROFILE;
    private javax.swing.JButton Solicitudes;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JEditorPane post;
    private java.awt.TextArea poster;
    private javax.swing.JButton request;
    // End of variables declaration//GEN-END:variables
}
