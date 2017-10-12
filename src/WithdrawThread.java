// Declaing the Class withdraw which implements runnable interface
public class WithdrawThread implements Runnable 
 {
	// Declaring the account object
     private Account account;
     // Declaring the variable of type double
     private double amount;
     // Declaing the constructor for withdrawThread class
     public WithdrawThread(Account account, double amount) 
       {
         this.account = account;
         this.amount = amount;
       }
     // Run method of class withdrawThread
     public void run() 
       {
    	 //make a withdraw 
    	 account.withdraw(amount);
       }
 }//End of  WithdrawThread class