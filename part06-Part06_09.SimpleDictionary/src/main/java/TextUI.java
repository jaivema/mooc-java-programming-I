/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
import java.util.Scanner;


public class TextUI {
    private Scanner input;
    private SimpleDictionary dictionary;

    public TextUI(Scanner input, SimpleDictionary dictionary) {
        this.input = input;
        this.dictionary = dictionary;
    }
    
    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String word = input.nextLine();
            
            if (word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else{
                if (word.equals("add")){
                    add();
                }else{
                    if (word.equals("search")){
                    System.out.println(search());   
                    }else{
                        System.out.println("Unknown command");
                    }
                }
            }
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = input.nextLine();

        System.out.println("Translation: ");
        String translation = input.nextLine();

        dictionary.add(word, translation);
    }
    
    public String search(){
        System.out.println("To be translated: ");
        String search = input.nextLine();
        
        System.out.println("Translation: ");
        String value = dictionary.translate(search);
        
        if (value == null){
            return "Word "+ search +" was not found";
        }
        return value;
    }
}
