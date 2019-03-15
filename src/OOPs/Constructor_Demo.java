package OOPs;

public class Constructor_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t=new test("karan",2.3);
		t.value=5;
	}

}

class test
{
	int value=4;
	test()
	{
		System.out.println("THSI");
	}
	test(String name,double mark)
	{
		System.out.println(name+" "+mark);
	}
}
