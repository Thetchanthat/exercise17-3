package interfacedemo;

public class CreditCardAccount implements Acount{
    private double balance;
    private float  interestRates;
    private double limitCredit;
    CreditCardAccount(){
        balance       = 10;
        interestRates = 30;
        limitCredit   = 100;
    }
//    public CreditCardAccount(double amount) {
//
//    }

    @Override
    public void withdraw(double amount) {
        if (amount <= limitCredit){
            // can withdraw
            if (amount <= balance){
                balance -= amount;
            }else {
                System.out.println("Insufficient balance");
            }
        }else {
            System.out.println("Amount exceed the limit !!!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    @Override
    public double calculateInterest() {
        return balance * (interestRates/100);
    }

}
