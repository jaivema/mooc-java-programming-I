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

public class Room {
    private ArrayList<Person> list = new ArrayList();

    public Room() {
    }
    public void add(Person person){
        list.add(person);
    }
    
    public boolean isEmpty(){
        if (list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return list;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        Person shortest = new Person("",999);
        for(Person person : list){
            if (person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        Person leaveRoom = new Person("",999);
        for(Person person : list){
            if (person.getHeight() < leaveRoom.getHeight()){
                leaveRoom = person;
            }
        }
        list.remove(leaveRoom);
        return leaveRoom;
    }
}
