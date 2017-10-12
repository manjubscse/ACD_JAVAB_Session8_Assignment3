//Declaring Main Class Internet Banking System
public class InternateBankingSystem {
// Main Method of clas
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialized the class Account
		Account accountObj; 
		// Assigning the Balance to account
		accountObj = new Account(10000);
		// Calling the deposit thread to deposit amount 1300
		new Thread(new DepositThread(accountObj,1300)).start();
		// Calling the withdraw thread to withdraw amount 1500
		new Thread(new WithdrawThread(accountObj,1500)).start();
		// Calling the deposit thread to deposit amount 1000
		new Thread(new DepositThread(accountObj,1000)).start();
		// Calling the deposit thread to deposit amount 2000
		new Thread(new DepositThread(accountObj,2000)).start();
		// Calling the withdraw thread to withdraw amount 3000
		new Thread(new WithdrawThread(accountObj,3000)).start();
		// Calling the withdraw thread to withdraw amount 950
		new Thread(new WithdrawThread(accountObj,950)).start();
		
	}

}
