package piggybank;

public class Quarter extends Money {
    
    public Quarter() {
        faceValue = 0.25;
    }

    public Quarter(long number) {
        faceValue = 0.25;
        numberOfCoins = number;
    }

    @Override
    public String toString() {
        if(numberOfCoins <= 1){
            return numberOfCoins + " Quarter";
        }else {
            return numberOfCoins + " Quarters";
        }
    }
}