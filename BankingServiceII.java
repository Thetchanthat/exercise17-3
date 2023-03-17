package interfacedemo;

public class BankingServiceII {

    Acount acount;
    public BankingServiceII(Acount acount){
        this.acount = acount;
    }
    public double showBalance(){
        return acount.checkBalance();
    }
    public void withdrawMoney(double amount){
        acount.withdraw(amount);
    }

    public void deposit(double amount){
        acount.deposit(amount);
    }
}
