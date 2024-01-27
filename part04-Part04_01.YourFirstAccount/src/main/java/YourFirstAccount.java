
public class YourFirstAccount {
 
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myFirstAccount = new Account("My first account", 100);
        myFirstAccount.deposit(20);
        System.out.println(myFirstAccount.toString());
    }
}
