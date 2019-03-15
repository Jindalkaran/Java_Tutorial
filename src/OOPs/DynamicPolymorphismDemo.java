package OOPs;

public class DynamicPolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Child6 c=new Child6();
			c.show();
			
	}

}



class Parent6
{
	public void show()
	{
		System.out.println("Hello");
	}
}




class Child6 extends Parent6
{
	public void show()
	{
		System.out.println("World");
		super.show();
	}
}