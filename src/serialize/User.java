/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize;

/**
 *
 * @author moloranemothusimichael
 */
public class User implements java.io.Serializable{
    
    private int Id;
    private String name;
    private String password;
    
    public User(){
        super();
    }
    
    public User(int Id,String name,String password){
        super();
        
        this.Id = Id;
        this.name = name;
        this.password = password;
    }
    
    public int getId(){
        return this.Id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    @Override
    public String toString(){
        return "ID:"+this.Id+", Name:"+this.name+", Password:"+this.password;
    }
    
}
