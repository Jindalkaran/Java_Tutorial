package Thread;

class FrstThread extends Thread
{
	int i=100;
	public void run()
	{
		for(i=100;i<=200;i++)
			System.out.println("FIRST    :  "+i);
	}
}

class ScndThread extends Thread
{
	int i=201;
	public void run()
	{
		for(i=201;i<=300;i++)
			System.out.println("SECOND     :  "+i);
	}
}

public class ThreadScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrstThread f=new FrstThread();
		ScndThread s=new ScndThread();
		f.setPriority(5);
		s.setPriority(10);
		f.start();
		s.start();
	}

}
