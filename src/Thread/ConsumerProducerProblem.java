package Thread;

class Stock
{
	int quantity=25;
	public synchronized void issue(int remove)
	{
		try
		{
			
			if(remove>quantity)
			{
				System.out.println("Before Deposit ;"+this.quantity);
				this.wait();
			}
			this.quantity=this.quantity-remove;
			System.out.println("STOCK After WITHDRAW : "+this.quantity);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public synchronized void deposit(int add)
	{
		this.quantity=this.quantity+add;
		System.out.println("STOCK AFter ADDING :"+this.quantity);
		this.notify();
	}
	
}

class ProducerThread extends Thread
{
	Stock s;
	public ProducerThread(Stock s)
	{	
		this.s=s;
	}
	public void run()
	{
		s.deposit(40);
	}
	
}
class ConsumerThread extends Thread
{
	Stock s;
	public ConsumerThread(Stock s)
	{
		this.s=s;
	}
	public void run()
	{
		s.issue(50);
	}
}



public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s=new Stock();
		ProducerThread pt=new ProducerThread(s);
		ConsumerThread ct=new ConsumerThread(s);
		ct.start();
		pt.start();
		
		

	}

}
