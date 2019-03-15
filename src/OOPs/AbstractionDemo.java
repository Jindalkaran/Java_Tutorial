package OOPs;

public class AbstractionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s=new Square();
		Triangle t=new Triangle();
		Circle c=new Circle();
		s.area(3.0);
		t.area(2.3);
		c.area(3);
		s.name("Square");

}
}
	
	abstract class Shape
	{
		abstract void area(double r);
		void name(String nam)
		{
			System.out.println("Name=-"+nam);
		}
	}


	class Square extends Shape{
		public void area(double r) {
			System.out.println("Square="+(r*r));
			
		}
	}

	class Triangle extends Shape{
		public void area(double r) {
			System.out.println("Triangle="+(0.75*r*r));
		}
	}


	class Circle extends Shape{
		public void area(double r) {
			System.out.println("Circle="+((Math.PI*r*r)));
		}
	}
