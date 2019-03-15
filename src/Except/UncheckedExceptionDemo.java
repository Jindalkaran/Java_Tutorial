package Except;

class Calculator
{
	int x=25;
	int y=0;
	public void result()
	{
		int z=0;
		try
		{
		z=x/y;
		System.out.println("VALUE Z ="+z);
		}
		catch(ArithmeticException e)//the exception object is stored in e
		{
			e.printStackTrace();
			System.out.println("AISAE DIVIDE NAHI HOGA");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally i am back!!");
		}
		System.out.println("VAlue Z :"+z);
	}
	public void show_x()
	{
		System.out.println("VAlue X :"+x);
	}
}
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.result();
		c.show_x();
	}

}
