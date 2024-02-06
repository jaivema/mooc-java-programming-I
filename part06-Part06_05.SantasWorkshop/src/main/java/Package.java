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

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package() {
    }
   
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    public int totalWeight(){
        int sumWheight = 0;
        
        for (Gift gift : gifts){
            sumWheight += gift.getWeight();
        }
        
        return sumWheight;
    }
}
