package hw05_ATM_Project;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CashBox cashBoxR = new RubleCashBox();
        Atm atm = new Atm(cashBoxR);
        atm.acceptBanknotes(45860);
        cashBoxR.getBalance();
        atm.IssuingBanknotes(45000);
        cashBoxR.getBalance();
        atm.IssuingBanknotes(1000);
        cashBoxR.getBalance();
        atm.IssuingBanknotes(100);
        cashBoxR.getBalance();
        atm.IssuingBanknotes(690);
        cashBoxR.getBalance();


    }
}