/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_application;

/**
 *
 * @author leonardolouie30
 */
public class User {
    
    private String id, firstname, lastname, address,age, username;
    public User(String id, String firstname, String lastname, String address, String age, String username)
    {
        this.id = id;
        this.firstname= firstname;
        this.lastname = lastname;
        this.address= address;
        this.age = age;
        this.username= username;
        
        
    }
    
    
    public String getId()
    {
        
        
        return id;
    }
    
    public String getFirstname()
    {
        
        
        return firstname;
        
    }
    public String getLastname()
     {
                
                
       return lastname;
     }
    
    public String getAddress()
    {
        
        return address;
    }
    
    public String getAge()
    {
        
        return age;
    }
    
    public String getUsername()
    {
        
        
        return username;
    }
    
}
