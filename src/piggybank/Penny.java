package piggybank;

public class Penny extends Money {
    
    public Penny() {
        faceValue = 0.01;
    }

    public Penny(long number) {
        faceValue = 0.01;
        numberOfCoins = number;
    }

    @Override
    public String toString() {
        if(numberOfCoins <= 1){
            return numberOfCoins + " Penny";
        }else {
            return numberOfCoins + " Pennies";
        }
    }
}