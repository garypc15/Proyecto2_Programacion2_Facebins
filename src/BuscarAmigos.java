
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BuscarAmigos.java
 *
 * Created on 11-29-2011, 08:55:46 PM
 */
/**
 *
 * @author Gary
 */
public class BuscarAmigos extends javax.swing.JFrame {

    static String mail = "";

    
        Facebook fb = new Facebook ();
        Perfil pf = new Perfil();
        login lg = new login();
        
       //String array[]= new String[fb.contAmigos(pf.correo)];
    
    /** Creates new form BuscarAmigos */
    public BuscarAmigos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bbuscar = new javax.swing.JButton();
        txtmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        bbuscar.setText("Buscar");
        bbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bbuscarMouseReleased(evt);
            }
        });
        getContentPane().add(bbuscar);
        bbuscar.setBounds(135, 150, 90, 23);

        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtmail);
        txtmail.setBounds(100, 110, 180, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 102));
        jLabel2.setText("Busca a tu Amigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 70, 120, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void bbuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarMouseReleased

        Facebook fb = new Facebook ();
        Perfil pf = new Perfil();
        login lg = new login();
        
       
      
        if(!fb.seekFriend(pf.correo,txtmail.getText())){
            JOptionPane.showMessageDialog(this, "Ya agrego a ese alero", "GUARDADO", 1);
            return ;
        }
        
        if(txtmail.getText().equals(pf.correo)){
            JOptionPane.showMessageDialog(this, "No ingrese su propio correo", "ERROR", 1);
            return;
        }
        
        
        if(!fb.seekEmail(this.txtmail.getText())){
            mail = txtmail.getText();
            infoBusqueda fbi = new infoBusqueda();
            
            fbi.setVisible(true);
        }else{
            System.out.println(lg.correo+" "+txtmail.getText());
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bbuscarMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BuscarAmigos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtmail;
    // End of variables declaration//GEN-END:variables
}
