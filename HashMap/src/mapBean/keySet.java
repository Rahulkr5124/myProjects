package mapBean;

import java.util.HashMap;
import java.util.Map;

public class keySet {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "PineApple");
		map.put(5, "Guava");
		keySet(map);
		

	}

	private static void keySet(Map<Integer, String> map) {
		for(Integer fruit:map.keySet())
		{
			System.out.println(fruit+" "+map.get(fruit));
			//System.out.println(map.get(fruit));
			
		}
		
	}

}
