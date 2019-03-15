package OOPs;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student sd=new student();
		sd.add();

	}

}

class student
{
	public int marks1=100;
	public int marks2=200;
	public int marks3=300;
	public void add()
	{
		int mk;
		mk=marks1+marks2+marks3;
		System.out.println(mk);
	}
}