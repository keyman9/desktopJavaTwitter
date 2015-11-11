package faketwitter;

/**
 *
 * @author spencer
 */

public class Message {
    private String content;
    private String author;
    private String timeStamp;
    private String subscribe;
    
    
    //full constructor (could be useful for File I/O)
    public Message(String in, String creator, String ts, String s){
        content = in;
        author = creator;
        timeStamp = ts;
        subscribe = s;
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
        author = creator.getName();
    }
    public String getAuthor(){
        return author;
    }
    
    
    //Time Stamp methods
    public void setTimeStamp(String ts){
        timeStamp = ts;
    }
    public String getTimeStamp(){
        return timeStamp;
    }
    
    //subscriber methods
    public void setSubscribe(String in){
        subscribe = in;
    }
    public String getSubscribe(){
        return subscribe;
    }
    
}
