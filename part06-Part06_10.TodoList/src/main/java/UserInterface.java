
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


public class UserInterface {
    private Scanner input;
    private TodoList tasks;

    public UserInterface(TodoList list, Scanner input) {
        this.input = input;
        this.tasks = list;
    }

    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String command = input.nextLine();
            
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                System.out.print("To add: ");
                String addTask = input.nextLine();
                tasks.add(addTask);
            }
            
            if (command.equals("list")){
                tasks.print();
            }
            
            if (command.equals("remove")){
                System.out.print("Which one is removed?: "); 
                int index= input.nextInt();
                tasks.remove(index);
            }
        }
    }
}