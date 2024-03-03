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


public class Hold {
    private ArrayList<Suitcase> holdPlace = new ArrayList();
    private int holdWeight;

    public Hold(int holdWeight) {
        this.holdWeight = holdWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (holdWeight >= suitcase.totalWeight()){
            this.holdPlace.add(suitcase);
            
            holdWeight = (holdWeight - suitcase.totalWeight());
        }
    }
    
    public void printItems(){
        for (Suitcase bags : this.holdPlace){
            bags.printItems();
        }
    }
            
    @Override
    public String toString() {
        String bagsNumber = String.valueOf(holdPlace.size());
        int totalKg = 0;
        
        for (Suitcase bagWeight : this.holdPlace){
            totalKg += bagWeight.totalWeight();
        }
        return bagsNumber +" suitcases ("+ totalKg +"kg)";
    }
    
}
