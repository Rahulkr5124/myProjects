package mapBean;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		Map<Character,Integer> map=new TreeMap<>();
		String s="sillyspiders";
		char[] ch=s.toCharArray();
		int i=0;
		int size=ch.length;
		while(i!=size)
		{
			if(map.containsKey(ch[i])==false)
			{
				map.put(ch[i], 1);
			}
			else
			{
				int oldVal=map.get(ch[i]);
				int newVal=oldVal+1;
				map.put(ch[i], newVal);
			}
			i++;
		}
		for(Map.Entry<Character, Integer> data:map.entrySet())
		{	
			if(data.getValue()==1)
		
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}

		}
		System.out.println("-------------------------------");
		for(Map.Entry<Character, Integer> data:map.entrySet())
		{	
			System.out.println(data.getKey()+" "+data.getValue());
		}

		}
}
