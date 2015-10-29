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
public class Message {
    private String content;
    private User author;
    private String timeStamp;
    
    public Message(String in, User creator, String ts){
        content = in;
        author = creator;
        timeStamp = ts;
    }
    
    
    //Content methods
    public void setContent(String in){
        content = in;
    }
    public String getContent(){
        return content;
    }
    
    
    //Author methods
    public void setAuthor(User creator){
        author = creator;
    }
    public User getAuthor(){
        return author;
    }
    
    
    //Time Stamp methods
    public void setTimeStamp(String ts){
        timeStamp = ts;
    }
    public String getTimeStamp(){
        return timeStamp;
    }
}
