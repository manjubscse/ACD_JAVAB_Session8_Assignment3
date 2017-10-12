//Defining the Class Deposit Thread which implements runnable interface
public class DepositThread implements Runnable 
   {
	  //initializing the Account Class
       private Account account;
       // Declaring the variable of double type 
       private double amount;
       //constructor of Deposit amount 
       public DepositThread(Account account, double amount) 
       {
           this.account = account;
           this.amount = amount;
       }
       //run method of runnable interface.
       public void run()
       {
    	   //make a deposit
    	   account.deposit(amount);
       }
   }//End of DepositeThread Class