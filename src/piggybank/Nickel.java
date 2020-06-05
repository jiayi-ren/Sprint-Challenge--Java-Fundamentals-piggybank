package piggybank;

public class Nickel extends Money{
    
    public Nickel() {
        faceValue = 0.05;
    }

    public Nickel(long number) {
        faceValue = 0.05;
        numberOfCoins = number;
    }

    @Override
    public String toString() {
        if(numberOfCoins <= 1){
            return numberOfCoins + " Nickel";
        }else {
            return numberOfCoins + " Nickels";
        }
    }
}