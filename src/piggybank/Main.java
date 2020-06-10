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

        Bank bank = new Bank(0);
        for (int i = 0; i < piggyBank.size(); i++ ) {
            bank.add(piggyBank.get(i).getTotal());
        }
        
        NumberFormat formatter = new DecimalFormat("$#0.00");
        System.out.println("The piggy bank holds "+ formatter.format(bank.getValue()));

        double remove = 1.5;
        System.out.println("Removing "+ formatter.format(remove)+ " from piggy bank");
        if (remove <= bank.getValue()){
            bank.subtract(remove);
            System.out.println("The piggy bank holds "+ formatter.format(bank.getValue()));
        }else {
            System.out.println("The piggy bank doesn't have enough money to remove. Max value to remove: " + formatter.format(bank.getValue()));
        }

        
    }
}