package encapsulation;

class Account{
    final String bank = "INDAIN BANK";
    private String name;
    private double balance;
    private String ifsc;
    private String location;
    private int accountNumber;
    private int pin;

    Account(){
        //default constructor
    }

    Account(String name, double balance, String ifsc, String location, int accountNumber, int pin){
        this.name = name;
        this.balance = balance;
        this.ifsc = ifsc;
        this.location = location;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    String getBank(){
        return bank;
    }

    String getName(){
        return name;
    }

    String getIFSC(){
        return ifsc;
    }

    String getLocation(){
        return location;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    void withDraw(int accountNumber, int pin, double amt){
        if(this.accountNumber==accountNumber && this.pin==pin){
            System.out.println("Login Successful");

            if(balance-amt > 500 && amt>0){
                balance -= amt;
                System.out.println("Amount Debited....");
            }else{
                System.out.println("Insufficient Balance...");
            }
        }else{
            System.out.println("Invalid Credentials");
        }
    }

    void deposit(int accountNumber, int pin, double amt){
        if(this.accountNumber==accountNumber && this.pin==pin){
            System.out.println("Login Successful");

            if(amt>0){
                balance += amt;
                System.out.println("Amount credited successfully");
            }else{
                System.out.println("Enter valid amount");
            }
        }else{
            System.out.println("Invalid Credentials");
        }
    }

    double getBalance(int accountNumber, int pin){
        if(this.accountNumber==accountNumber && this.pin==pin){
            System.out.println("Login successful");
            return balance;
        }else{
            System.out.println("Enter valid credentials");
            return 0;
        }
    }

    void setPin(int accountNumber, int oldPin, int newPin){
        if(this.accountNumber == accountNumber && pin == oldPin){
            pin = newPin;
            System.out.println("Pin updated successfully");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}

public class AccountDriver {
    public static void main(String[] args) {
        Account a1 = new Account("Shubham", 500000, "ind0021", "Noida", 70833086, 0021);

        System.out.println(a1.getBalance(70833086, 0021));
    }
}
