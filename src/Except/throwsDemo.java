package Except;

public class throwsDemo {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		Calculator1 c=new Calculator1();
		c.result();

	}

}
class Calculator1
{
	int x=25;
	int y=0;
	public void result()throws ArithmeticException
	{
		int z;
		z=x/y;
		System.out.println("VALUE Z ="+x);
	}
}