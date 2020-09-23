package mapBean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorMap {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "PineApple");
		map.put(5, "Guava");
		iteratorMap(map);
		

	}

	private static void iteratorMap(Map<Integer, String> map) {
		Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
