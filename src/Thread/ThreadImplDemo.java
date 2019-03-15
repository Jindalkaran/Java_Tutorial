package Thread;
import java.lang.Thread;//by default autoamtically imported


class FstThread implements Runnable
{
	int j=201;
	public void run()
	{
		try
		{
			for(j=201;j<=400;j++)
			{
				System.out.println("FIRST THREAD :"+j);
				Thread.sleep(200);
				
			}
		}
		catch(InterruptedException ie1)
		{
			ie1.printStackTrace();
		}
	}
}

class ScdThread implements Runnable
{
	int j=401;
	public void run()
	{
		try
		{
			for(j=401;j<=600;j++)
			{
				System.out.println("SECOND THREAD :"+j);
				Thread.sleep(200);
			}
		}
		
		catch(InterruptedException ie1)
		{
			ie1.printStackTrace();
		}
	}
}
public class ThreadImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1=new Thread(new FstThread());
		Thread th2=new Thread(new ScdThread());
		th1.start();
		th2.start();

	}

}
