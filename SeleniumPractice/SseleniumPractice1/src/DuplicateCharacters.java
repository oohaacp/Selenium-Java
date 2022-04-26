import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) 
	{
		String str=" It is also necessary to note that Selenium ";
		
		Map<Character, Integer>map=new HashMap<>();
		Set<Character> set = new HashSet<>();
		
		char[] duplicates=str.toCharArray();
		
	for (char c : duplicates) 
	{
		if(map.containsKey(c))
		{
			set.add(c);
			map.put(c, map.get(c)+1);
		}
		
		else
		{
			map.put(c, 1);
		}
		
		
		}
	System.out.println(set);
//System.out.println(map);

		/*
		 * for(Character ch : map.keySet()) { if(map.get(ch) >1) {
		 * System.out.println(ch); } }
		 */
		
		

	}

}
