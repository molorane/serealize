/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author moloranemothusimichael
 */
public class Serialize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = new User();
        user.setId(2014098616);
        user.setName("Mothusi Molorane");
        user.setPassword("Itumeleng*4");
        
        System.out.println(user);
        
        //Serialization
        try{
            FileOutputStream fileout = new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            
            out.writeObject(out);
            out.close();
            fileout.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        user = null;
        System.out.println("Object erased: "+user);
        
      
        
        //Diserialization
        try{
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream In = new ObjectInputStream(fileIn);
            
            user = (User) In.readObject();
            
            In.close();
            fileIn.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Class not found!");
            c.printStackTrace();
            return;
        }
        
        System.out.println("Object Diserialized: "+user);

    }
    
}
