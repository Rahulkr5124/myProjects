package mapBean;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		String s="sillySpiders";
		char ch[]=s.toCharArray();
		int size=ch.length;
		int i=0;
		System.out.println("hello java");
		
		while(i!=size)
		{
			if(map.containsKey(ch[i])==false)
			{
				map.put(ch[i], 1);
			}
		else
			{
				int oldval=map.get(ch[i]);
				int newval=oldval+1;
				map.put(ch[i], newval);			}
		}
			
	System.out.println("-----------");		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
		
	}


