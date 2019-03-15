package Thread;

class Account
{
	double balance=15000.00;
	public synchronized void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("The Current Balance is After Deposit : "+this.balance);
	}
	public synchronized void withdraw(double amount)
	{
		this.balance=this.balance-amount;
		System.out.println("The Current Balance is After Withdrawl : "+this.balance);
	}
}

class DepositThread extends Thread
{
	Account acc;
	public DepositThread(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.deposit(25000.00);
		
	}
}

class WithdrawlThread extends Thread
{
	Account acc;
	public WithdrawlThread(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.withdraw(5000.00);
		
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac=new Account();
		DepositThread dt=new DepositThread(ac);
		WithdrawlThread wd=new WithdrawlThread(ac);
		
		dt.start();
		
		wd.start();
		
		
		
	}

}
