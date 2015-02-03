package account;

public class Account {
    int accountNumber;
    double accountBalance;
    
   
    public void main(String[] args) {
        double amount1 = Double.parseDouble(args[0]);
        double amount2 = Double.parseDouble(args[1]);
        double amount3 = Double.parseDouble(args[2]);
        double amount4 = Double.parseDouble(args[3]);
        double amount5 = Double.parseDouble(args[4]);
        
    }
    
    public Account(int n, double balance)    {
        accountNumber = n;
        accountBalance = balance;
    }
    
    int getAccountNumber()  {
        int accountNumber = 0;
        return accountNumber;
    }
    
    double getAccountBalance()  {
        double accountBalance = 0;
        return accountBalance;
    }
    
    void makeDeposit(double amount)  {
        
    }
    
    int makeWithdrawal(double amount)   {
        accountBalance = accountBalance - amount;
        if(accountBalance < 0)  {
            System.out.println("There are insufficient funds to process your transaction - transaction voided");
            return 1;
        }
        else    {
            return 1;
        }
    }
}
