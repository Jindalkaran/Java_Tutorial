package OOPs;

public class MultilevelInherit_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaryi s=new Salaryi();
		s.show();
		s.display();
		s.totalsal();

	}

}


class employeeee
{
	public int eid=1;
	public String ename="Jindal";
	public void show()
	{
		System.out.println("NAME is : "+ename+" ID : "+eid);
	}
}

class PersonalDetails extends employeeee
{
	String plotno="AD41";
	String streetnm="Park Street";
	String pincode="753633";
	public void display()
	{
		System.out.println(plotno+" "+streetnm+" "+pincode);
	}
	}

class Salaryi extends PersonalDetails
{
	public double basic=500.00;
	public double da=2300.00;
	public double hra=3000;
	
	public void totalsal()
	{
		System.out.println("Total="+(basic+da+hra));
	}
}
