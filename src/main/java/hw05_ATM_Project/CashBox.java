package hw05_ATM_Project;

import java.util.Map;

public interface CashBox {
    Map<Integer, Integer> getLinkCurrency();
     void getBalance();
     void getErrorMessageDepositNotMultiple();
     void getErrorMessageEnterNotMiltiple();
     void getErrorMessageInsufficientFunds(int check);

}

