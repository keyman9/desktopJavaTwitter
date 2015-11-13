/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faketwitter;

/**
 *
 * @author spencer
 */
public class User {
    private String name;
    private String password;
    
    //name methods
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    
    //password methods
    public String getPass(){
        return password;
    }
    
    public void setPass(String pwd){
        password = pwd;
    }
}
