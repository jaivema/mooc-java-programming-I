
import java.util.ArrayList;

public class Menu {

    private final ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if (!meals.contains(meal)){
            meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(String mealList : meals){
            System.out.println(mealList);
        }
    }
    
    public void clearMenu(){
        meals.clear();
    }
}
