package OOPs;


class Employee
{
	public String eid;
	public String ename;
	public String phno;
	public Employee(String eid,String ename,String phno)
	{
		this.eid=eid;
		this.ename=ename;
		this.phno=phno;
	}
	public void Shodata()
	{
		System.out.println(eid+" "+ename+" "+phno);
	}
}
class pay extends Employee
{
	public String pancardno;
	public String Adharno;
	public String month;
	public pay(String eid,String ename,String phno,String pancardno,String Adharno,String month)
	{
		super(eid,ename,phno);
		this.pancardno=pancardno;
		this.Adharno=Adharno;
		this.month=month;
		
	}
	
	public double netpay(double basic,double da,double hra)
	{
		return (basic+da+hra);
	}
	public void details()
	{
		System.out.println(pancardno+" "+Adharno+" "+month);
	}

}


class PaySlip extends pay implements CaseStudy2Tax
{
	public PaySlip(String eid,String ename,String phno,String pancardno,String Adharno,String month)
	{
		super(eid,ename,phno,pancardno,Adharno,month);
	}
	public int ptax(int tx)
	{
		return tx;
	}
}
public class CaseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaySlip ps=new PaySlip("123","Ysaaah","556566","ghdhgdg","8755558588588","March");
		ps.Shodata();
		ps.details();
		double net=ps.netpay(100,399,434);
		System.out.println("AMOUNT :"+(net-ps.ptax(100)));
		

	}

}
