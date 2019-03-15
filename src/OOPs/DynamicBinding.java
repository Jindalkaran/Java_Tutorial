package OOPs;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape1 sp1;//object of abstract class cannot be created
		Shape1 sp2;
		
		Square1 sq1=new Square1();
		Circle1 cr1=new Circle1();
		
		/*dynamic binding --->sp1 sp2 are shape type so points to draw in shape1 initially
		 * but at runtime it points to the function which is object initialized to shape variable
		 */
		sp1=sq1;
		sp2=cr1;
		sp1=sp2;
		sp1.area(5.0);
		sp1.area(4);
	}

}



abstract class Shape1
{
	abstract void area(double r);
}


class Square1 extends Shape1{
	public void area(double r) {
		System.out.println("Square="+(r*r));
		
	}
}

class Triangle1 extends Shape1{
	public void area(double r) {
		System.out.println("Triangle="+(0.75*r*r));
	}
}


class Circle1 extends Shape1{
	public void area(double r) {
		System.out.println("Circle="+((Math.PI*r*r)));
	}
}