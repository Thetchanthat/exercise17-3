package interfacedemo;

public class SavingAccount implements Acount{
    private double balance;
    private float interestRate;

    SavingAccount(){
        balance =0;
        interestRate = 50;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }
//    @Override
//    public void withdrew(double amount) {
//        balance += amount;
//    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public double checkBalance() {
        return balance;
    }
    public double calculateInterest(){
        return (balance * (interestRate/100));
    }
}
