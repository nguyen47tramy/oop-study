package ws02;
public class BankAccount {
       
    private int accountNumber;
    private String accountHolder;
    private int identificationNumber;
    private int phoneNumber;
    private double balance;
    
    public BankAccount( int accountNumber, String accountHolder, 
                        int identificationNumber, int phoneNumber, 
                        double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.identificationNumber = identificationNumber;
        this.phoneNumber = phoneNumber;
        this.balance = 50 + balance;
    }
    
    public void withdraw(double withdrawAmount){
        if (balance - withdrawAmount <= 50) {
            System.out.println("You can not withdraw "
                    + "for your balance will be under 50!");
        }
        else
            System.out.println("Your balance is: " + (balance - withdrawAmount));
    }
    
    public void printInfo(){
        System.out.print("Account Holder: " + accountHolder + 
                        "\nAccount Number: " + accountNumber +
                        "\nBalance: " + balance);
    }
}
