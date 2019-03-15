package OOPs;
class TestStatic
{
	static int x=25;
	static int y=0;
	public static void display()
	{
		System.out.println("The value x :"+x);
		System.out.println("The value y:"+y);
	}
	static
	{
		y=x*4;
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic.display();
	}

}
