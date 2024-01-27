
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
        if (this.getElements().size()==0){
            return "The collection "+ name +" is empty.";
        }else if (this.getElements().size()==1){
            return "The collection "+ name +" has "+ elements.size() +" element:\n"+ 
                    this.getElements();
            }else{
                return "The collection "+ name +" has "+ elements.size() +" elements:\n"+ 
                        elements;
        }
    }
}
