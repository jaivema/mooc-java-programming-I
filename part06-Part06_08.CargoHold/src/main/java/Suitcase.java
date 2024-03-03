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

public class Suitcase {
    private ArrayList<Item> items = new ArrayList();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){ 
        if (item.getWeight() <= this.maxWeight){
            this.items.add(item);
            maxWeight = (maxWeight - item.getWeight());
        }
    }
    
    public void printItems(){
        for (Item item : this.items){
            System.out.println(item);   
        }
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = new Item("",0);
        
        for (Item item : this.items){
            if (heaviest.getWeight() >  item.getWeight()){
                item = heaviest;
            }else{
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : this.items){
            
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString() {
        int sumKg = 0;
        String numberItems = String.valueOf(items.size());
        
        for (Item item : items){
            sumKg += item.getWeight();
        }
            
        if (items.isEmpty()){
            return "no items ("+ sumKg +" kg)";
            
        }
        if (numberItems.equals("1")){
            return (numberItems +" item ("+ sumKg +" kg)");
            
        }else{
            return (numberItems +" items ("+ sumKg +" kg)");
        }
    }
}
