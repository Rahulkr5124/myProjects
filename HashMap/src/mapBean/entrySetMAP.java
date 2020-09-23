package mapBean;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class entrySetMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "PineApple");
		map.put(5, "Guava");
	    EntrySetMap(map);
		
	}

	private static void EntrySetMap(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
