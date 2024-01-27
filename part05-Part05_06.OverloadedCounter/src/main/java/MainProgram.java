
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c1 = new Counter ();
        for (int i=0; i<10; i++){
            c1.increase();
            System.out.print(" "+ c1.value());
        }
        System.out.println(" ");
        for (int i=10; i>0; i--){
            c1.decrease();
            System.out.print(" "+ c1.value());
        }
        System.out.println(" ");
        Counter c2 = new Counter (100);
        for (int i=0; i<10; i++){
            c2.increase(10);
            System.out.print(" "+ c2.value());
        }
        System.out.println(" ");
        for (int i=10; i>0; i--){
            c2.decrease(10);
            System.out.print(" "+ c2.value());
        }
    }
}
