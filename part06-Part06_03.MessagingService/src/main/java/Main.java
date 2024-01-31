
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        String sender = "Jaime";
        String content = "Hola soy un mensaje";
        
        Message myMessage = new Message(sender, content);
        MessagingService server = new MessagingService();
        
        server.add(myMessage);
        
        System.out.println(server.getMessages());
    }
}
