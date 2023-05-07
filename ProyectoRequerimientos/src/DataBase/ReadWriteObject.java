package DataBase;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class ReadWriteObject {
    ObjectOutputStream out;
    ObjectInputStream in;   

    public ReadWriteObject() {}
    
    public void write(File archivo,boolean overwrite,Object object[]) throws IOException {
        out=new ObjectOutputStream(new FileOutputStream(archivo,overwrite));
            for(int i=0;i<object.length;i++) { 
                if(object[i]!=null) {
                    out.writeObject(object[i]);
                }
                else {
                    break;
                }
            }
            out.close();
    }
    
    public Object[] read(File archivo,Object object[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        in=new ObjectInputStream(new FileInputStream(archivo)); 
        try {            
            for(int i=0;;i++) {               
                object[i]=(Object) in.readObject();
            }
        }
        catch(EOFException e) {}
        in.close();
        return object;
    }    




    public void write(File archivo,boolean overwrite,Object object) throws IOException {
            out=new ObjectOutputStream(new FileOutputStream(archivo,overwrite));
            out.writeObject(object);
            out.close();
        } 
    
    public Object read(File archivo,Object object) throws FileNotFoundException, IOException, ClassNotFoundException {
        in=new ObjectInputStream(new FileInputStream(archivo));
        object=(Object) in.readObject();        
        in.close();
        return object;
    }  
}
