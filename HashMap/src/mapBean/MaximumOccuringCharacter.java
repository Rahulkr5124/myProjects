package mapBean;

import java.util.Map;
import java.util.TreeMap;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		Map<Character,Integer> map=new TreeMap<>();
		String s="sillyspiders";
		char[] ch=s.toCharArray();
		int i=0,max=0;
		char maxchar=' ';
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
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		System.out.println(max);
		System.out.println(maxchar);
		
	}

}
