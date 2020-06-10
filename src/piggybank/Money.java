package piggybank;

abstract class Money {
    protected double faceValue;
    protected long numberOfCoins;

    public Money() {
        numberOfCoins = 1;
    }

    public String getFaceValue() {
        return "Face value is " + faceValue;
    }

    public String getNumberOfCoins() {
        return "Number of coins is " + numberOfCoins;
    }

    public double getTotal() {
        return faceValue * numberOfCoins;
    }

    @Override
    public String toString() {
        return numberOfCoins + " " + faceValue;
    }
}