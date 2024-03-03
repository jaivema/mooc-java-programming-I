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

public class Stack {
    private final ArrayList list = new ArrayList();

    public Stack() {
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public void add(String value){
        list.add(value);
    }
    
    public ArrayList<String> values(){
        
        return list;
    }
    
    public String take(){
        String getLast = (String)list.get(list.size()-1);
        
        list.remove(getLast); 
        
        return getLast;
    }
}
