package Thread;

class FirstThread extends Thread
{
	int i=1;
	
	public void run()
	{
		try
		{
		for (i=1;i<100;i++)
		{
			System.out.println("THE FIRST THREAD: "+i);
			Thread.sleep(150);
		}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class SecondThread extends Thread
{
	int i=101;
	public void run()
	{
		try
		{
		for(i=101;i<=250;i++)
		{
			System.out.println("THE SECOND THREAD: "+i);
			Thread.sleep(100);
		}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread f=new FirstThread();//creating a thread--->ready stage
		SecondThread s=new SecondThread();
		f.start();
		s.start();
		

	}

}
