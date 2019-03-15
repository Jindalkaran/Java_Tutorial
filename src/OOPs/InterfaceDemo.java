package OOPs;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1=new c();
		c1.display(c.a);

	}

}

class c implements InterfaceDemo1
{
	public void display(int get)
	{
		System.out.println(get);
	}
}