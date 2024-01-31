
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean 
        // and return the change
        // if the payment parameter is not large enough, no meal is sold and
        // the method should return the whole payment
        double mealCosts = 2.5;
        double change = 0;
        
        if (payment >= mealCosts){
            change = payment - mealCosts;
            this.money += mealCosts;
            
            this.affordableMeals ++;
        }else{
            change = payment;
        }
        return change;
    }
    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and 
        // return the change
        // if the payment parameter is not large enough, no meal is sold and 
        // the method should return the whole payment
        double mealCosts = 4.3;
        double change = 0;
        
        if (payment >= mealCosts){
            change = payment - mealCosts;
            this.money += mealCosts;
            
            this.heartyMeals ++;
        }else{
            change = payment;
        }
        return change;
    }
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is 
        // decreased by the price, and the method returns true
        // otherwise false is returned
        double mealCosts = 2.5;
        
        if(card.takeMoney(mealCosts)){
            this.affordableMeals ++;
            return true;
        }else{
            return false;
        }        
    }
    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is 
        // decreased by the price, and the method returns true
        // otherwise false is returned
        double mealCosts = 4.3;
        
        if(card.takeMoney(mealCosts)){
            this.heartyMeals ++;
            return true;
        }else{
            return false;
        }
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        
        if (sum > 0){
            card.addMoney(sum);
        this.money += sum;
        }
    }
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
