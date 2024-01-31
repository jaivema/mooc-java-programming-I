
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if ((this.squares > compared.squares) ){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int ownPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        
        if (ownPrice > comparedPrice){
            return ownPrice-comparedPrice;        
        }
        if (ownPrice < comparedPrice){
            return comparedPrice - ownPrice;
        }
        return 0;
    }
    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        
        if (ownPrice > comparedPrice){
            return true;        
        }
        if (ownPrice < comparedPrice){
            return false;
        }
        return false;
    }
}
