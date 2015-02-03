/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Cameron
 */
public class AccountTest {

    public void main(String[] args) {
        double amount[];
        amount = new double[args.length];

        for (int i = 0; i < 5; i++)
        {
            Double firstArg;
            if (args.length > 0) {
                try {
                    firstArg = Double.parseDouble(args[0]);
                } catch (NumberFormatException e) {
                    System.err.println("Argument" + args[0] + " must be an integer.");
                    System.exit(1);
                }
                amount[i] = Double.parseDouble(args[i]);
            } 
        }
        //System.out.println(amount[0]);
        //System.out.println(amount[1]);
        //System.out.println(amount[2]);
        //System.out.println(amount[3]);
        //System.out.println(amount[4]);
        
        Account[] account = new Account[5];
        for (int i = 0; i<5; i++)   {
            account[i] = new Account((i+1),amount[i]);
            //System.out.println("Account " + (i+1) + " was added successfully");
        }
        
        account[0].makeDeposit(350.00);
        account[0].makeDeposit(200.00);
        makeTransfer(account[0], account[1], 100.00);
        
        account[1].makeDeposit(200.00);
        account[1].makeDeposit(150.00);
        makeTransfer(account[1], account[2], 200.00);
        
        account[2].makeDeposit(100.00);
        account[2].makeDeposit(150.00);
        makeTransfer(account[2], account[3], 200.00);
        
        account[3].makeDeposit(100.00);
        account[3].makeDeposit(200.00);
        makeTransfer(account[3], account[4], 300.00);
        
        account[4].makeDeposit(100.00);
        account[4].makeDeposit(150.00);
        makeTransfer(account[4], account[0], 200.00);
       
    }
    
    public void makeTransfer(Account fromAccount, Account toAccount, double amount)  {
        if((fromAccount.accountBalance - amount) < 0)  {
            System.out.println("Account " + fromAccount.accountNumber + " does not have enough funds.  Transaction Cancelled!");
        }
        else {
            fromAccount.accountBalance = fromAccount.accountBalance - amount;
            toAccount.accountBalance = toAccount.accountBalance + amount;
            System.out.println("Transfer from Account " + fromAccount.accountNumber + " to " + toAccount.accountNumber + " of $" + amount + " was successful.");
            System.out.println("Account " + fromAccount.accountNumber + " Balance = " + fromAccount.accountBalance);
            System.out.println("Account " + toAccount.accountNumber + " Balance = " + toAccount.accountBalance);
        }
    }
}
