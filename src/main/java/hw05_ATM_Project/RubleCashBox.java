package hw05_ATM_Project;

import java.util.LinkedHashMap;
import java.util.Map;

public class RubleCashBox implements CashBox{

    public Map<Integer, Integer> Banknotes = new LinkedHashMap<>(); // для сохранения порядка при вставке
    public RubleCashBox(){
        Banknotes.put(5000,0);
        Banknotes.put(1000,0);
        Banknotes.put(500,0);
        Banknotes.put(200,0);
        Banknotes.put(100,0);
        Banknotes.put(50,0);
        Banknotes.put(10,0);








    }

    @Override
    public Map<Integer, Integer> getLinkCurrency() {
        return Banknotes;
    }

    @Override
    public void getErrorMessageDepositNotMultiple() {

        System.out.println("You must deposit a multiple of 10 rubles.");
    }

    @Override
    public void getErrorMessageEnterNotMiltiple() {
        System.out.println("You must enter a multiple of 10 rubles.");
    }

    @Override
    public void getErrorMessageInsufficientFunds(int check) {
        System.out.println("Insufficient funds to withdraw banknotes. " + check + " Rub couldn't withdraw from account" );
    }

    @Override
    public void getBalance(){
        System.out.println(Banknotes.toString()
                + "\n Total amount: "
                + Banknotes.keySet().stream().mapToInt(key ->
                Banknotes.get(key) * key).sum() + " Rub");

    }
}
