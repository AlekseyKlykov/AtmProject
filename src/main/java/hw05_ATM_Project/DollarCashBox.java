package hw05_ATM_Project;

import java.util.LinkedHashMap;
import java.util.Map;

public class DollarCashBox implements CashBox{

    public Map<Integer, Integer> Banknotes = new LinkedHashMap<>(); // для сохранения порядка при вставке
    public DollarCashBox(){
        Banknotes.put(100,0);
        Banknotes.put(50,0);
        Banknotes.put(20,0);
        Banknotes.put(10,0);
        Banknotes.put(5,0);
        Banknotes.put(1,0);









    }

    @Override
    public Map<Integer, Integer> getLinkCurrency() {
        return Banknotes;
    }

    @Override
    public void getErrorMessageDepositNotMultiple() {

        System.out.println("You must deposit a multiple of 1 usd.");
    }

    @Override
    public void getErrorMessageEnterNotMiltiple() {
        System.out.println("You must enter a multiple of 10 usd.");
    }

    @Override
    public void getErrorMessageInsufficientFunds(int check) {
        System.out.println("Insufficient funds to withdraw banknotes. " + check + " usd couldn't withdraw from account" );
    }

    @Override
    public boolean isMultiplicity(int money) {
        return money%1 != 0;
    }

    @Override
    public void getBalance(){
        System.out.println(Banknotes.toString()
                + "\n Total amount: "
                + Banknotes.keySet().stream().mapToInt(key ->
                Banknotes.get(key) * key).sum() + " usd");

    }

}
