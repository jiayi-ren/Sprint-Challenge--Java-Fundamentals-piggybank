package piggybank;

public class Dollar extends Money {
    
    public Dollar() {
        faceValue = 1;
    }

    public Dollar(long number) {
        faceValue = 1;
        numberOfCoins = number;
    }

    @Override
    public String toString() {
        return "$" + numberOfCoins;
    }
}