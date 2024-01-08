import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        
        while(true){
            System.out.print("Title: ");
            String title = input.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(input.nextLine());
            
            books.add(new Book (title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String value = input.nextLine();
        
        if (value.equals("everything")){
            for(Book infoBook : books){
                System.out.println(infoBook.toString());
            }
        }else if(value.equals("name")){
            for(Book infoBook : books){
                System.out.println(infoBook.getTitle());
            }
        }else if(value.equals("pages")){
            for(Book infoBook : books){
                System.out.println(infoBook.getPages());
            }
        }else if(value.equals("year")){
            for(Book infoBook : books){
                System.out.println(infoBook.getYear());
            }
        }
        input.close();
    }
}
