import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.Calendar;
import java.util.Date;


public class Facebook {

    /**
* @param args the command line arguments
*/
    
    
// File profile = new File("profile.fbn");
    static File fb= new File("Facebook.java");
     static String post="";
  static long posi;
    
    public boolean seekEmail(String c){
       try{
           //File gerencia= new File();
           RandomAccessFile rafc = new RandomAccessFile("gerencia.fbn","rw");
           
           rafc.seek(0);
           while(rafc.getFilePointer()<rafc.length()){
               String cc=rafc.readUTF();
               rafc.readUTF();
               rafc.readBoolean();
               //rafc.readLong();
               if(cc.equals(c)){
                   System.out.println("huy-seekmail");
                   return false;
               }
           }
           
       }catch(Exception e){
           System.out.println(e);
           return false;
       }
       return true;
    }
    
   private int contAmigos(String e){
       int cont = 0;
       try{
            RandomAccessFile rafs = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                
                String cef=rafs.readUTF();
                
                 boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
               boolean qenvio = rafs.readBoolean();
               if(amigo==false && decision==false && qenvio==false){
                   cont+=1;
                   
               }
                
             
            }
            rafs.close();
      
        }catch(Exception q ){
            
            return -1;
        }
        return cont;
   }
private String soliAmigos(String e){
       try{
            RandomAccessFile rafs = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                
                String cef=rafs.readUTF();
                
                 boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
               boolean qenvio = rafs.readBoolean();
               if(amigo==false && decision==false && qenvio==false){
                  rafs.close();
                   return cef;
                   
               }
                
             
            }
             rafs.close();
      
        }catch(Exception q ){
            
        }
        return "";
   }   
   public String[] listaAmigos(String e){
    
       String amigos[]=new String[this.contAmigos(e)];
            
        for(int x = 0 ; x < amigos.length;x++){
            amigos[x]=this.soliAmigos(e);
        }
       
        return amigos;
}
   public String[] misAmigos(String e){
       String amigos[]= new String[this.contAmigos2(e)];
       for(int x = 0 ; x < amigos.length;x++){
           amigos[x]=this.losAmigos(e);
       }
       return amigos;
   }
   
   public boolean seekFriend(String e,String fe){
        try{
            RandomAccessFile rafs = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                String cef=rafs.readUTF();
                rafs.readBoolean();
                rafs.readBoolean();
                if(cef.equals(fe)){
                        rafs.close();
                    return false;
                }
            }
            rafs.close();
        }catch(Exception q ){
            
            return true;
        }
        return true;
   }
   
   
   private int contAmigos2(String mimail){
       int cont2=0;
     try{
            RandomAccessFile rafs = new RandomAccessFile(path()+mimail+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                String cef=rafs.readUTF();
                boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
                       rafs.readBoolean();         
                 if(amigo==true && decision==true){
                   cont2+=1;
               }
               
                 
            }
           rafs.close();
            return cont2;
        }catch(Exception q ){
            
        }
     return cont2;
       
   } 
private String losAmigos(String e){
       try{
            RandomAccessFile rafs = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                
                String cef=rafs.readUTF();
                
                 boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
               rafs.readBoolean();
               if(amigo==true && decision==true){
                  rafs.close();
      
                   return cef;
                   
               }
                
             
            }
           rafs.close();
             
        }catch(Exception q ){
            
        }
        return "";
   }   
   
   
 
    public  String path(){
        StringTokenizer st= new StringTokenizer(fb.getAbsolutePath(),"\\");
        String path="";
        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            if(!"Facebook.java".equals(temp)){
                path+=temp+"\\";
            }
        }
        return path;
    }
    
    public boolean addUser(String n, String p,char g,long d,String c,int t,String x){
        try{
            RandomAccessFile rafau= new RandomAccessFile("gerencia.fbn","rw");
            File carpeta = new File(c);
           
            if(carpeta.mkdir()){
             
            if(seekEmail(c)){
                RandomAccessFile rafaud= new RandomAccessFile(path()+c+"\\"+"profile.fbn","rw");
                RandomAccessFile rafaf= new RandomAccessFile(path()+c+"\\"+"manageFriends.fbn","rw");
                RandomAccessFile raff = new RandomAccessFile(path()+c+"\\"+"foto.fbn","rw");
                RandomAccessFile rafp = new RandomAccessFile(path()+c+"\\"+"fotop.fbn","rw");
                rafau.seek(rafau.length());
    ///correo, pass,activo gerencia
                rafau.writeUTF(c);
                rafau.writeUTF(p);
                rafau.writeBoolean(true);
         //profile    
                    rafaud.writeUTF(n);
                    rafaud.writeChar(g);
                    rafaud.writeLong(d);
                    rafaud.writeInt(t);
                    Date dc= new Date();
                    rafaud.writeLong(dc.getTime());
                    rafp.writeUTF(x);
                        
               rafaud.close();
                rafaf.close();
                 raff.close();
                  rafp.close();
                    return true;
                }
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
    
    public boolean modificarPerfil(String e,int t,long f){
        try{
            RandomAccessFile rafaud= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
            //modifica tel y nacimento  
            rafaud.readUTF();
            rafaud.readChar();
            //fecha nacimiento
            rafaud.writeLong(f);
            rafaud.writeInt(t);
            rafaud.readLong();
            rafaud.readUTF();
            
           rafaud.close();
            
        }catch(Exception q){
        
    }
    return false;
    }
    
    public boolean desactivarCuenta(String e){
        try
        {
        RandomAccessFile rafau= new RandomAccessFile("gerencia.fbn","rw");
       while(rafau.getFilePointer()<rafau.length()){
        if(rafau.readUTF().equals(e)){
                rafau.readUTF();
                rafau.writeBoolean(false);
              //  this.closec(e);
                borrarDirectorio(e);
                return true;
        }
        rafau.readUTF();
        rafau.readBoolean();
                
       }
            //}
        }catch(Exception s){
           return false;
        }
        return false;
    }

    
     
    public String iPerfil(String e){
        try{
            RandomAccessFile rafaud= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
            
            String name =rafaud.readUTF();
            char s = rafaud.readChar();
           long comp= rafaud.readLong();
             Calendar c=Calendar.getInstance();
        c.setTime(new Date(comp));
            
            // Date d = new Date(rafaud.readLong());
            int te=rafaud.readInt();
            rafaud.readLong();
            
            String info = "Nombre: "+name+"\n\n"
                    +"Sexo: "+s+"\n\n"
                    +"Birthday: "+c.get(Calendar.DATE)+" / "+(c.get(Calendar.MONTH))+" / "+c.get(Calendar.YEAR)+"\n\n"
                    +"Telefono: "+te+"\n\n";
          
           rafaud.close();
            return info;
            
        }catch(Exception a){
            
        }
        
        return "-";
    }
    public String bPerfil(String e){
        try{
             RandomAccessFile rafaud= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
        
                String name =rafaud.readUTF();
                char s = rafaud.readChar();
                rafaud.readLong();
                int te=rafaud.readInt();
                long comp2= rafaud.readLong();
              
                Calendar c=Calendar.getInstance();
                c.setTime(new Date(comp2));
        
                String info="Nombre: "+name+"\n\n"
                    +"Sexo: "+s+"\n\n"
                    +"Fecha de Ingreso a Facebins: "+c.get(Calendar.DATE)+" / "+(c.get(Calendar.MONTH))+" / "+c.get(Calendar.YEAR)+"\n\n";
                
                rafaud.readUTF();
                
              rafaud.close();
//                
                return info;
           
           
        }catch(Exception as){
             
             
        }
        return ":";
    }
    
    public boolean addFriends(String cpropip,String camigo ){
        try{
            
            if(!seekEmail(camigo)){
                RandomAccessFile rafa = new RandomAccessFile(path()+camigo+"\\"+"manageFriends.fbn","rw");
            RandomAccessFile rafp = new RandomAccessFile(path()+cpropip+"\\"+"manageFriends.fbn","rw");
            rafa.seek(rafa.length());
            rafa.writeUTF(cpropip);
            rafa.writeBoolean(false);
            rafa.writeBoolean(false);
            rafa.writeBoolean(false);
            rafp.seek(rafp.length());
            rafp.writeUTF(camigo);
            rafp.writeBoolean(false);
            rafp.writeBoolean(false);
            rafp.writeBoolean(true);
         
            
            rafa.close();
            rafp.close();
            return true;
            }
            
                    }catch(Exception e){
                        return false;
                    }
        return false;
    }
    
 
    
    public boolean addComment(String e,String c){
        try{
            RandomAccessFile rafc = new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
            RandomAccessFile pp   = new RandomAccessFile(path()+e+"\\"+"pp.fbn","rw");
           pp.seek(0);
            rafc.seek(rafc.length());
            //this.iPerfil(e);
         //posi es static
           posi=rafc.getFilePointer();
           pp.writeLong(posi);
            rafc.writeUTF(c);
            
            pp.close();
       rafc.close();
            
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    
      public String showComment(String e){
          try{
   
                RandomAccessFile rafc = new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
               RandomAccessFile pp   = new RandomAccessFile(path()+e+"\\"+"pp.fbn","rw");
           pp.seek(0);
                rafc.seek(pp.readLong());
           String posti = rafc.readUTF();
            
         pp.close();
         rafc.close();
                return posti;
          }catch(Exception q){
              
          }
          
          return "";
      }
       
  
  private void borrarDirectorio (String e){//File directorio){
                File directorio = new File(path()+e);
                //System.out.println(directorio.toString());
                File[] ficheros = directorio.listFiles();
                
                for (int x=0;x<ficheros.length;x++){
                        if (ficheros[x].isDirectory()) {
                                
borrarDirectorio(ficheros[x].toString());
                                //System.out.println(ficheros[x].toString());
                        }
                        ficheros[x].delete();
                } 
                directorio.delete();
        }


  
//  public String getNombre(String e){
//      try
//      {
//          RandomAccessFile ram= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
//          String name = ram.readUTF();
//          
//          ram.close();
//          return name;
//      }
//      catch(Exception q)
//      {
//          
//      }
//      return "";
//  }
  public void aceptarRequest(String e ,String c){
      try{
         RandomAccessFile rafa = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
           RandomAccessFile raf = new RandomAccessFile(path()+c+"\\"+"manageFriends.fbn","rw");
           
           rafa.readUTF();
           rafa.writeBoolean(true);
           rafa.writeBoolean(true);
           rafa.readBoolean();
      
           raf.readUTF();
           raf.writeBoolean(true);
           raf.writeBoolean(true);
           raf.readBoolean();
           
           
        rafa.close();
         raf.close();
           
        //   return true;
      }catch(Exception g){
          
      }
      //return false;
  }
  
  public void rechazarRequest(String e ,String c){
      try{
         RandomAccessFile rafa = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
           RandomAccessFile raf = new RandomAccessFile(path()+c+"\\"+"manageFriends.fbn","rw");
           
           rafa.readUTF();
           rafa.writeBoolean(false);
           rafa.writeBoolean(true);
           rafa.readBoolean();
           
           
           raf.readUTF();
           raf.writeBoolean(false);
           raf.writeBoolean(true);
           raf.readBoolean();
      
        rafa.close();
          raf.close();
           
           //return true;
      }catch(Exception g){
          
      }
      //return false;
  }
  
    
    public boolean login(String e,String p){
        try{
            RandomAccessFile rafl = new RandomAccessFile("gerencia.fbn", "rw");
           rafl.seek(0);
            while(rafl.getFilePointer()<rafl.length()){
                String ev=rafl.readUTF();
                String pv=rafl.readUTF();
               boolean activo = rafl.readBoolean();
                
                if(ev.equals(e) && pv.equals(p) && activo==true )
                {
                    return true;
                }
                
            }
            return false;
        }
        catch(IOException a){
            System.out.println(a.getMessage()+" "+a);
        }
        System.out.println("ouch");
        return false;
    }

    private void closec(String e){
        try{     
                RandomAccessFile pp   = new RandomAccessFile(path()+e+"\\"+"pp.fbn","rw");
                RandomAccessFile rafaud= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
                RandomAccessFile rafaf= new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
                RandomAccessFile raff = new RandomAccessFile(path()+e+"\\"+"foto.fbn","rw");
                RandomAccessFile rafp = new RandomAccessFile(path()+e+"\\"+"fotop.fbn","rw");
                
                pp.close();
                rafaud.close();
                rafaf.close();
                raff.close();
                rafp.close();
                
        }catch(Exception xx){
        
    }
    }


}
    