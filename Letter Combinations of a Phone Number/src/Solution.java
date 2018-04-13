import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;


public class Solution {
	
//	Given a digit string, return all possible letter combinations that the number could represent. 
//			A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//			Input:Digit string "23"
//			Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

	
	public static List<String> letterCombinations(String digits) {
		
		List<String> output = new ArrayList<String>();
		
		if (digits.length() == 0){
			return output;
		}
		
		String[] mapped_keys = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
									
		// push the first dialed number combination
		int first_digit_point = ((int)digits.charAt(0) - 48);
		for (int digit_order = 0; digit_order < mapped_keys[first_digit_point].length(); digit_order++){
			output.add(mapped_keys[first_digit_point].charAt(digit_order) + "");
		}
		
		// compute the rest of the combinations 
		for(int digit_pointer = 1; digit_pointer < digits.length(); digit_pointer++){
			int dialed_number = ((int)digits.charAt(digit_pointer) - 48);
			
			List<String> temp = new ArrayList<String>();
			
			for (ListIterator<String> iter = output.listIterator(); iter.hasNext(); ) {
				String ele = iter.next();
				for (int key = 0; key < mapped_keys[dialed_number].length(); key++){
					temp.add(ele+ mapped_keys[dialed_number].charAt(key));	
				}
				iter.remove();
			}
			output = temp;
		}
        return output;    
    }
	
	public static void main(String[] args) {
		//output [add, ade, adf, aed, aee, aef, afd, afe, aff, bdd, bde, bdf, bed, bee, bef, bfd, bfe, bff, cdd, cde, cdf, ced, cee, cef, cfd, cfe, cff]
		
		System.out.println(letterCombinations("233").toString());
	}

}
