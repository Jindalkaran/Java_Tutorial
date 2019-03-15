package Collection;

import java.util.*;
class product1
{
	String type;
	double price;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
public class UserDefinedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product1 p1=new product1();
		product1 p2=new product1();
		product1 p3=new product1();
		product1 p4=new product1();
		p1.setType("TV");
		p1.setPrice(25000.00);
		p2.setType("MOBILE");
		p2.setPrice(3000.00);
		p3.setType("MACHINE");
		p3.setPrice(25727.00);
		p4.setType("LAPTOP");
		p4.setPrice(25626.0);
		
		TreeMap hs=new TreeMap();
		hs.put("SONY",p1);
		hs.put("SAMSUNG",p2);
		hs.put("LG",p3);
		hs.put("HP",p4);
		
		Set se=hs.entrySet();
		Iterator itr=se.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();//type casting
			      product1 pd=(product1)me.getValue();
			      System.out.println(me.getKey()+"===>"+pd.getType()+"===>"+pd.getPrice());
		}
		
		

	}

}
