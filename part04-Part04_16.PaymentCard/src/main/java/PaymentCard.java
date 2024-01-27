/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author jaime
 */
public class PaymentCard {
    private double balance;
 
    public PaymentCard(double openingBalance) {
        // write code here
        this.balance=openingBalance;
    }
    public void addMoney(double amount) {
        // write code here
        if (amount > 0){
            if ((this.balance + amount) <= 150){
                this.balance += amount;
            }else{
                this.balance = 150;
            }
        }
    }
    public void eatAffordably(){
        if ((this.balance - 2.6) >= 0){
            this.balance -= 2.6;
        }
        
    }
    public void eatHeartily() {
        if ((this.balance - 4.6) >= 0){
            this.balance -= 4.6;
        }
    }
    
    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
    
}
