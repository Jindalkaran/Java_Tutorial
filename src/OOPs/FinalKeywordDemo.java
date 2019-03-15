package OOPs;

public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child12 c=new Child12();
		c.display();

	}

}

class Parent12
{
	public final void display()
	{
		System.out.println("INSIDE parent");
	}
}
class Child12 extends Parent12
{
	/*public void display()//this gives error becoz we are overriding
	{
		System.out.println("Inside child");
	}*/
}
