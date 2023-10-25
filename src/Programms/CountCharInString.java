package Programms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class CountCharInString {
	 public static void main(String[] args) {
		
		 String str="prashant";
		 Map<Character, Integer> map=new LinkedHashMap<>();
			
			for(char ch:str.toCharArray())
			{
				map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);

			}
			for(Entry<Character, Integer> entry:map.entrySet())
			{
				System.out.println( entry.getKey()+" "+entry.getValue());
			}
	}

}
