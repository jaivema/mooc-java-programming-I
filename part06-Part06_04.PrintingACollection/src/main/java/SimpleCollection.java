
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String outPrint = "";
        String outElements = "";
        
        if (elements.isEmpty()){
            outPrint = "The collection "+ name +" is empty.";
            
        }else 
            if (elements.size()==1){
                outPrint = "The collection "+ name +" has "+ elements.size() +" element:\n"; 
                outElements = elements.get(0);
            }else{
                outPrint = "The collection "+ name +" has "+ elements.size() +" elements:\n";
                for (String element : elements) {
                    outElements = outElements + element +"\n";
                }
            }
        return outPrint + outElements;
    }
}
