package mapBean;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CheckUniqueCharacterOrNot {

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
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();// not understand why it is written here
		
	for(Map.Entry<Character, Integer> entry:hmap)
	{
		if(entry.getValue()>1)
		{
			System.out.println("repeated..");
			System.exit(0);
		}
		
	}
	System.out.print("unique charater is present");

	}

}
