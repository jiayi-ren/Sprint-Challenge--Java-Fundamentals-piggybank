package piggybank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        List<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(m -> System.out.println(m));
        System.out.println();

        double bank = 0;
        for (int i = 0; i < piggyBank.size(); i++ ) {
            bank += piggyBank.get(i).getTotal();
        }
        NumberFormat formatter = new DecimalFormat("$#0.00");
        System.out.println("The piggy bank holds "+ formatter.format(bank));
    }
}