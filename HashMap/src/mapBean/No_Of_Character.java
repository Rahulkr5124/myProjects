package mapBean;

import java.util.HashMap;
import java.util.Map;

public class No_Of_Character {

	public static void main(String[] args) {
		String s="sillyspiders";
		char[] ch=s.toCharArray();
		int i;
		Map<Character,Integer> map=new HashMap<>();
		i=0;
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
			if(entry.getValue()>=2)
					{
				System.out.println(entry.getKey()+" "+entry.getValue());					}
			//System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
