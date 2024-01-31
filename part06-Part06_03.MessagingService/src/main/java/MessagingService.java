/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
import java.util.ArrayList;

public class MessagingService {
    private final ArrayList<Message> messageList = new ArrayList();

    public MessagingService() {
    }
    
    public void add(Message message){
        if (message.getContent().length()<= 280){
            messageList.add(message);   
        }
    }
    
    public ArrayList<Message> getMessages(){
        return messageList;
    }   
}
