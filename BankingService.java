package interfacedemo;

public class BankingService {
    SavingAccount savingAccount;
    CreditCardAccount creditCardAccount;
    BankingService(){
        savingAccount     = new SavingAccount();
        creditCardAccount = new CreditCardAccount();
    }
    BankingService (SavingAccount savingAccount, CreditCardAccount creditCardAccount){
        this.savingAccount     = savingAccount;
        this.creditCardAccount = creditCardAccount;
    }
//    CreditCardAccount creditCardAccount;

    double showBalance(){
        return savingAccount.checkBalance();
    }
    double showBalanceCredit(){
        return creditCardAccount.checkBalance();
    }
    double showCrediCarBalance(){
        return  creditCardAccount.checkBalance();
    }
    void addCreditCarMoney(double amount){
        creditCardAccount.deposit(amount);
    }
    void addMoney(double amount){
        savingAccount.deposit(amount);
    }
    void  withdrawMoney(double amount){
        savingAccount.withdraw(amount);
    }

}
