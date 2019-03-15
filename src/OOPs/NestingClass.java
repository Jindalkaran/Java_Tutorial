package OOPs;

public class NestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nonstatic inner class
		outer o=new outer();
		outer.inner inn=o.new inner();
		inn.add();
		
		//static inner class
		outer1.inner1 in=new outer1.inner1();
		in.add();
	}

}

//nonsttatic inner class
class outer
{
	int out_x=60;
	class inner
	{
		int inn_y=120;
		public void add()
		{
			int c=out_x+inn_y;
			System.out.println("Result : "+c);
		}
	}

}


//static inner class
class outer1
{
	static int out_x=60;//inner class is static can access only static members
	static class inner1
	{
		int inn_y=120;
		public void add()
		{
			int c=out_x+inn_y;
			System.out.println("Result : "+c);
		}
	}

}
