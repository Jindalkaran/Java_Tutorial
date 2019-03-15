package Collection;

import java.util.*;

class Product {
	
	String pname;
	double price;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}


public class UserDefinedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pd1=new Product();
		Product pd2=new Product();
		pd1.setPname("TV");
		pd1.setPrice(2500.00);
		pd2.setPname("OVEN");
		pd2.setPrice(5.0);
		
		//This array list will support only product type of value
		ArrayList<Product> arr=new ArrayList<Product>();
		arr.add(pd1);
		arr.add(pd2);
		
		Iterator<Product> itr=arr.iterator();
		while(itr.hasNext())
		{
			Product pdt=(Product)itr.next();
			System.out.println(pdt.getPname()+"--->"+pdt.getPrice());
		}
 	}

}
