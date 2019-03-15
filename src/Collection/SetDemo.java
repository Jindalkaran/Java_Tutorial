package Collection;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet hs=new TreeSet();
		hs.add("RAJA");
		hs.add("JITEN");
		hs.add("THOR");
		hs.add("SMITH");
		hs.add("THOR");
		hs.add("SMITH");
			Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
