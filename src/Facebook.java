import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;


public class Facebook {

    /**
* @param args the command line arguments
*/
    
    
// File profile = new File("profile.fbn");
    static File fb= new File("Facebook.java");
     static String post="";
  static long posi=0;
    
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
    public void arrAmigos(String e){
     
        
        try{
            RandomAccessFile rafar= new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            FriendRequest fr = new FriendRequest();
            int cont=fr.array.length;
            int pos=0;
            while(cont>0){
                String nombre=rafar.readUTF();
                Boolean aceptado=rafar.readBoolean();
                Boolean verificar=rafar.readBoolean();
                if(!aceptado&&!verificar){
                    fr.array[pos]=nombre;
                    cont--;
                    pos++;
                }
            }
            
        }catch(Exception ex){
            System.out.println("Error");
        }
    }
   public int contAmigos(String e){
       int cont = 0;
       try{
            RandomAccessFile rafs = new RandomAccessFile(path()+e+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                
                String cef=rafs.readUTF();
                
                 boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
               
               if(amigo==false && decision==false){
                   cont+=1;
                   
               }
                
             
            }
        }catch(Exception q ){
            
            return -1;
        }
        return cont;
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
                    return false;
                }
            }
        }catch(Exception q ){
            
            return true;
        }
        return true;
   }
   
   
   public void contAmigos2(String mimail){
       int cont2=0;
     try{
            RandomAccessFile rafs = new RandomAccessFile(path()+mimail+"\\"+"manageFriends.fbn","rw");
            rafs.seek(0) ;
            while(rafs.getFilePointer()<rafs.length()){
                String cef=rafs.readUTF();
                boolean amigo =   rafs.readBoolean();
               boolean decision = rafs.readBoolean();
                                
                 if(amigo==false && decision==false){
               FriendRequest fbi = new FriendRequest();
                fbi.array[cont2]=cef;
                   
               }
               
            }
        }catch(Exception q ){
            
        }
       
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
    
    public boolean addUser(String n, String p,char g,long d,String c,int t){
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
                        rafp.writeUTF("/silueta.jpg");
                    return true;
                }
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
    
    public boolean modificarPerfil(String e,int t,long f,boolean a){
        try{
            RandomAccessFile rafau= new RandomAccessFile("gerencia.fbn","rw");
            RandomAccessFile rafaud= new RandomAccessFile(path()+e+"\\"+"profile.fbn","rw");
            //modifica tel y nacimento  
            rafaud.readUTF();
            rafaud.readChar();
            //fecha nacimiento
            rafaud.writeLong(f);
            rafaud.writeInt(t);
            rafaud.readLong();
            //modifica si esta o no activa
            while( rafau.getFilePointer() < rafau.length()){
            if(rafau.readUTF().equals(e)){
                rafau.readUTF();
            rafau.writeBoolean(a);
            //rafau.seek(rafau.getFilePointer()-1);
//            if(!rafau.readBoolean()){
//                delete(e);
//     }
            }
            }
            
            
        }catch(Exception q){
        
    }
    return false;
    }
    
    private boolean delete(String e){
        File f = new File(path()+e);
        
        if( !f.exists() ){
            System.out.println("No existe el archivo");
            return false;
        }
        
        if( f.isFile() )
            f.delete();
        if( f.isDirectory()){
            File files[] = f.listFiles();
            for(File fi : files ){
                if( fi.isFile() )
                    fi.delete();
                if( fi.isDirectory() )
                    delete( fi.getAbsolutePath() );
            }
            f.delete();
        }
        
        return true;
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
            rafp.seek(rafp.length());
            rafp.writeUTF(camigo);
            rafp.writeBoolean(false);
            rafp.writeBoolean(false);
            return true;
            }
            
                    }catch(Exception e){
                        return false;
                    }
        return false;
    }
    
    public void addComment(String e,String c) {
        try{
            RandomAccessFile rafc = new RandomAccessFile(path()+e+"\\"+"post.fbn","rw");
            rafc.seek(0);
           String g;
           
           if(rafc.length()==0){
               g="";
           }else{
           
           g=rafc.readUTF();
           }    
           rafc.seek(0);
                rafc.writeUTF(c+g);
            
                
            
           
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
      public String showComment(String e){
          try{
    RandomAccessFile rafc = new RandomAccessFile(path()+e+"\\"+"post.fbn","rw");
    rafc.seek(0);
    if(rafc.length()==0){
        return "";
    }
        
    String com = rafc.readUTF();
    return com;
    
          }catch(Exception s){
              System.out.println("...");
          }
          return "";
      }
//    
//    public String showComment(String e){
//       try{
//            RandomAccessFile rafc = new RandomAccessFile(path()+e+"post.fbn","rw");
//            rafc.seek(posi);
//            
//            post=rafc.readUTF();
//            return post;
//        }catch(Exception ex){
//            System.out.println(ex.getLocalizedMessage());
//        }
//        
//        return post;
//    }
//    
    
    public boolean login(String e,String p){
        try{
            RandomAccessFile rafl = new RandomAccessFile("gerencia.fbn", "rw");
           rafl.seek(0);
            while(rafl.getFilePointer()<rafl.length()){
                String ev=rafl.readUTF();
                String pv=rafl.readUTF();
                rafl.readBoolean();
                
                if(ev.equals(e) && pv.equals(p) )
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
    
    
   
    
//
// // public static void main(String[] args) {
// // TODO code application logic here
//
// addUser();
// }


}