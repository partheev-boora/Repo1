package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Collectionclass {
	public static void main(String ar[]) {
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("b");
		list2.add("c");
		list2.add("c");
		list2.add("c");
		System.out.println(list2);
		Set set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(3);
		System.out.println(set);
		Map<String, Integer> hm=new HashMap<String,Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("e", 200);
		//hm.put(null, null)
		hm.get("a");
		System.out.println(hm);
	}
}
