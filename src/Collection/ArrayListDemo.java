package Collection;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arr is a collection stroring multiple objects
		ArrayList arr=new ArrayList();
		arr.add("SUMAN");
		arr.add("RAMAN");
		arr.add("BHASKAR");
		Integer n=new Integer(5);//Wrapper class(stroing primitive type value as object
		Double d=new Double(15.5);
		arr.add(n);
		arr.add(d);
		arr.add("SUMAN");
		//printing entire object
		System.out.println(arr);
		
		
		//access the elements of arr one by one we need list iterator or iterator 
		
		
		Iterator itr=arr.iterator();//Iterator is interface and itr is refernce to arr objectss
		while(itr.hasNext())//only in forward direction
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		//in backward direction
		ListIterator ltr=arr.listIterator();
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

}

