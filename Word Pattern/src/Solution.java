import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static boolean wordPattern(String pattern, String str) {
		Map<Character, String> patt = new HashMap<Character, String>();
		String[] strs = str.split(" ");
		boolean result = true;
		
		if(pattern.length() != strs.length){
			return false;
		}
		
		// insert the strings with there corresponding characters
		for(int i = 0; i < pattern.length(); i++){
			if(patt.containsKey(pattern.charAt(i))){
				//check if the value with key is the same as the string
				if(! patt.get(pattern.charAt(i)).equals(strs[i])){
					return false;
				}
			}
			
			else if(patt.containsValue(strs[i])){
				return false;
			}
			else{
				patt.put(pattern.charAt(i),strs[i]);
			}
		}
		
		return result;
    }
	
	
	public static void main (String[] args){
		System.out.println(wordPattern("aba", "dog dog dog"));
	}
}
