package mapBean;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {
	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "PineApple");
		map.put(5, "Guava");
	    EntrySetMap(map);
		
		
	}

	private static void EntrySetMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
