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
import java.util.Random;


public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    public JokeManager() {
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        String retroPositive;
        
        if (jokes.isEmpty()) {
            retroPositive = "Jokes are in short supply.";
        }else{
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            retroPositive = this.jokes.get(index);
        }
        return retroPositive;
    }
    
    public void printJokes(){
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
