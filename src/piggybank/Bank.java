package piggybank;

public class Bank {
    private double value;

    public Bank(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void add(double value) {
        this.value += value;
    }

    public void subtract(double value) {
        this.value -= value;
    }
}