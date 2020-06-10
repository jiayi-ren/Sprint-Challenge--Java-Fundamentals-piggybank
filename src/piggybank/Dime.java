package piggybank;

public class Dime extends Money {

    public Dime() {
        faceValue = 0.1;
    }

    public Dime(long number) {
        faceValue = 0.1;
        numberOfCoins = number;
    }

    @Override
    public String toString() {
        if(numberOfCoins <= 1){
            return numberOfCoins + " Dime";
        }else {
            return numberOfCoins + " Dimes";
        }
    }
}