package interfacedemo;

public class Main {
    public static void main(String[] args) {
//
//        CreditCardAccount obj = new CreditCardAccount();
//        // polymorphims
//        Acount obj2 = new CreditCardAccount();
//        Acount obj3 = new SavingAccount();
      //  Acount obj4 = new VisaAccount();

//         upcasting or downcasting
    // ===================================================
        BankingService bankingService = new BankingService();
        bankingService.addMoney(900);
        System.out.println("Balance is : "+bankingService.showBalance()+"$");
        bankingService.addCreditCarMoney(100);
        System.out.println("Credit Car Balance : "+bankingService.showBalanceCredit()+"$");
    // ===================================================
        System.out.println("----------------------------------------------");

        BankingServiceII creditAccount = new BankingServiceII(new CreditCardAccount());
        creditAccount.deposit(10000);
        System.out.println("Credit Balance : " + creditAccount.showBalance() + "$");

        BankingServiceII savingAccount = new BankingServiceII(new SavingAccount());
        savingAccount.deposit(500);
        System.out.println("Saving Balance : " + savingAccount.showBalance() + "$");
    }
}
