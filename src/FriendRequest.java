
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FriendRequest.java
 *
 * Created on 11-30-2011, 09:43:46 PM
 */
/**
 *
 * @author Gary
 */
public class FriendRequest extends javax.swing.JFrame {
    
    Perfil pf = new Perfil();
    Facebook fb = new Facebook();
   
    login lg = new login();
   // String array[]= new String[fb.contAmigos(pf.correo)];
     
    
    infoBusqueda fi = new infoBusqueda();
 //   Iterator i = fi.al.iterator();
       
    /** Creates new form FriendRequest */
    public FriendRequest() {
        initComponents();

        //    String aka []={"aka47","aka2"};
  // fb.arrAmigos(Perfil.correo);

  //      System.out.println(array.length);
   
     //   String
                
      String am[]=  fb.listaAmigos(Perfil.correo);
            //Object ia[]=fi.al.toArray();
        DefaultListModel modelo = new DefaultListModel();

        try{
            for(int i=0;i<am.length;i++ ){
                
            modelo.add(i,am[i]);
            }
      
            
        lista.setModel(modelo);      
        }catch(Exception s ){
            
        }
    }
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        rechazar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Solicitudes de Amistad :)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 0, 260, 70);

        rechazar.setText("Rechazar");
        getContentPane().add(rechazar);
        rechazar.setBounds(250, 190, 90, 23);

        aceptar.setText("Aceptar");
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aceptarMouseReleased(evt);
            }
        });
        getContentPane().add(aceptar);
        aceptar.setBounds(250, 110, 90, 23);

        lista.setModel(lista.getModel());
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 100, 150, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseReleased

        
       if(lista.getSelectedIndex()>1){
            JOptionPane.showMessageDialog(this, "Seleccione solo un Correo","ERROR",0);
            return;
       }else{ 
           
         String nom = (String) this.lista.getSelectedValue();
      
         fb.aceptarRequest(Perfil.correo, nom);
        
        DefaultListModel modelo = (DefaultListModel) lista.getModel();
        int index = lista.getSelectedIndex();
        modelo.remove( index );
      
        
       }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                
   
                new FriendRequest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JButton rechazar;
    // End of variables declaration//GEN-END:variables
}
