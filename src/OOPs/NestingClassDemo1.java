package OOPs;

public class NestingClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perceli p=new Perceli();
		Perceli.Contents co=p.new Contents();
		double many=co.weight(22);
		System.out.println("OKKKKK:"+many);
		
		
		
		class Destination
		{
			public void desti(String label)
			{
				System.out.println(label);
			}
		}
		Destination d=new Destination();
		d.desti("kaku");
		
	}

}


class Perceli
{
	class Contents
	{
		public double weight(double w)
		{
			System.out.println("WEIGHT : "+w);
			return w;
		}
	}

	
	
}


