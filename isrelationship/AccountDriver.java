//single level inheritance
//Inheritance Achieved in only one level is called single level inheritance

package isrelationship;

class Account{
    String name;
    String bank;
    int accountNumber;
    String ifsc;
    String loc;

    Account(){
        //no argument constructor
    }

    Account(String name, String bank, int accountNumber, String ifsc, String loc){
        this.name = name;
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.ifsc  = ifsc;
        this.loc = loc;
    }

    void displayAccount(){
        System.out.println("Name: "+name);
        System.out.println("Bank: "+bank);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("IFSC: "+ifsc);
        System.out.println("Location: "+loc);
    }
}

class SavingsAccount extends Account{
    double balance;
    double fdInterest;
    double withdrawLimit;

    SavingsAccount(){
        //no argument constructor
    }

    SavingsAccount(String name, String bank, int accountNumber, String ifsc, String loc, double balance, double fdInterest, double withdrawLimit){
        super(name, bank, accountNumber, ifsc, loc);
        this.balance = balance;
        this.fdInterest = fdInterest;
        this.withdrawLimit = withdrawLimit;
    }

    void displaySavingsAccount(){
        displayAccount();
        System.out.println("Balance: "+balance);
        System.out.println("FD Interest: "+fdInterest);
        System.out.println("With Draw Limit: "+withdrawLimit);
    }
}

public class AccountDriver {
    public static void main(String[] args) {
        Account account = new Account("SHUBHAM", "Maharashtra Bank", 60652497, "MAHB000045", "Koregaon");
        account.displayAccount();
        System.out.println("===============================================");

        SavingsAccount savingsAccount = new SavingsAccount("SHUBHAM", "Maharashtra Bank", 60652497, "MAHB000045", "Koregaon", 400000, 7, 2000);
        savingsAccount.displayAccount();
        System.out.println("===============================================");

        savingsAccount.displaySavingsAccount();
        System.out.println("===============================================");
    }
}
