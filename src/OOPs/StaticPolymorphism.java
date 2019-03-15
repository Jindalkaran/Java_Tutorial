package OOPs;

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=new calculator();
		System.out.println("Result="+c.add(10,5));

	}

	
}




class calculator{
	public int add(int x,int y)
	{
		System.out.println("int int");
		return (x+y);
	}
	public double add(int x,float y)
	{
		System.out.println("int float");
		return (x+y);
	}
	public double add(double x,double y)
	{
		System.out.println("double double");
		return (x+y);
	}
}
