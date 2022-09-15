package hashmap1;
import java.util.*;

public class haspmap2 {

	public static void main(String[] args) {
		{
			HashMap m = new HashMap();
			m.put("madhu",5);
			m.put("arun", 4);
			m.put("bhuvana", 3);
			System.out.println(m);
			Set s=m.keySet();
			System.out.println(s);
			Collection c = m.values();
			System.out.println(c);
			Set s1 = m.entrySet();
			System.out.println()
			
		}

	}

}
