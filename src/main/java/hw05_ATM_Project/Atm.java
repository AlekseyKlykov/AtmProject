package hw05_ATM_Project;

import java.util.HashMap;
import java.util.Map;

public class Atm {
    private CashBox currency;


    public Atm(CashBox cur){
        currency = cur;

    }
    public void acceptBanknotes(int money){

        System.out.println("An attempt to put: " + money);

        if(currency.isMultiplicity(money) || money < 0)
        {
            currency.getErrorMessageDepositNotMultiple();

        }
        else{
            for (var entry : currency.getLinkCurrency().entrySet())
            {
                if(money == 0)
                    break;
                int acceptedBills = 0;
                acceptedBills = money/entry.getKey();
                if(acceptedBills > 0) {
                entry.setValue(entry.getValue() + acceptedBills);
                money = money - acceptedBills * entry.getKey();
            }
            }

        }

};
    public void IssuingBanknotes(int money) {
        if (money % 10 != 0 || money < 0) {
            currency.getErrorMessageEnterNotMiltiple();
            return;

        }
        if(currency.getLinkCurrency().keySet().stream().mapToInt(key ->
                currency.getLinkCurrency().get(key) * key).sum() < money){

            currency.getErrorMessageInsufficientFunds(money);
        }
        else {
            for (var entry : currency.getLinkCurrency().entrySet()) {
                if (money == 0)
                    break;
                int acceptedBills = 0;
                acceptedBills = money / entry.getKey();
                if (acceptedBills > 0
                        && (entry.getValue()>0)
                ) {
                        int BanknoteCheck = (entry.getValue()-acceptedBills < 0 ? entry.getValue() : acceptedBills);

                        entry.setValue(entry.getValue() - BanknoteCheck);
                        money = money - BanknoteCheck * entry.getKey();

                    }
                }
            }
            if(money>0){
                currency.getErrorMessageInsufficientFunds(money);

            }

        }

    };


