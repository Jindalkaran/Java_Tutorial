package Except;

class stock
{
	int qoh=50;
	public void issue(int req)
	{
		try
		{
			if(req>qoh)
			{
				OutOfStockException oe=new OutOfStockException();
				throw oe;
			}
			else
			{
				qoh=qoh-req;
				System.out.println("CurrentStock : "+qoh);
			}
		}
		catch(OutOfStockException oe)
		{
			oe.printStackTrace();
		}
	}
}
public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stock s=new stock();
				s.issue(100);
		
	}

}
