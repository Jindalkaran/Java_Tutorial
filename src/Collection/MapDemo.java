package Collection;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap hs=new TreeMap();
		hs.put("GLAMOUR",new Double(2500.0));
		hs.put("INTRUDER",new Double(23000.0));
		hs.put("PULSAR",new Double(3999.0));
		hs.put("AVENGER",new Double(2500.0));
		hs.put("ENFIELD",new Double(230000));
		
		//we copy the value of map into a set
		Set se=hs.entrySet();
		Iterator itr=se.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();//type casting
			System.out.println(me.getKey()+"--->"+me.getValue());
		}

	}

}
