package OOPs;

class student1
{
	public int rollno;
	public String sname;
	public student1(int rollno,String sname)
	{
		this.rollno=rollno;//this points to current object that is the instance variables of this object are initialized
		this.sname=sname;
	}
	public void show()
	{
		System.out.println("NAME : "+sname);
		System.out.println("ROLLNO : "+rollno);
	}
}

class Marks extends student1
{
	public String sub1,sub2,sub3;
	public Marks(int rollno,String sname,String sub1,String sub2,String sub3)
	{
		super(rollno,sname);//calling super class constructor
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public int score(int p,int q,int r)
	{
		int scor=p+q+r;
		return scor;
	}
	public void display()
	{
		System.out.println(sub1+" "+sub2+" "+sub3);
	}
}

class Result extends Marks implements CaseStudy1Sports
{
	public Result(int rollno,String sname,String sub1,String sub2,String sub3)
	{
		super(rollno,sname,sub1,sub2,sub3);//immediate super class will be called
		
	}
	public int credit(int c)
	{
		return c;
	}
}


public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res=new Result(123,"Karan","MAths","English","FLAT");
		res.show();
		res.display();
		int score=res.score(99, 100, 98);
		System.out.println("CREDIT : "+(res.credit(25)+score));

	}

}
