/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gary
 */
public class clase {
    public static void main (String arg[]){
          Perfil pf = new Perfil();
        Facebook fb = new Facebook();
    login lg = new login();
        
       String array[]= new String[fb.contAmigos(lg.correo)];
        System.out.println();
    }
}
