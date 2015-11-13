/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faketwitter;

import java.util.ArrayList;

/**
 *
 * @author spencer
 */
public class User {
    private String name;
    private String password;
    private String profile;
    private ArrayList<String> subscribers;
    private ArrayList<String> blocked;
    private ArrayList<Message> messages;
    
    
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
    
    
    //profile methods
    public String getProfile(){
        return profile;
    }
    
    public void setProfile(String content){
        profile = content;
    }
    
    //subscribers methods
    public Boolean inList(String nameToCheck){
        if(subscribers.contains(nameToCheck)){
            return true;
        }
        else return false;
    }
    
    public void addToList(String newName){
        subscribers.add(newName);
    }
    
    public void remove(String toRemove){
        subscribers.remove(toRemove);
    }
    
    //blocked methods
    
    //messages methods
}
