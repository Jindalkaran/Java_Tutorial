package OOPs;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseStatic.show_X();
		System.out.println(UseStatic.x);
	}
}
	
	class UseStatic
	{
		public static int x=25;
		
		public static void show_X()
		{
			System.out.println("The value x : "+x);
			
		}
		
	}

