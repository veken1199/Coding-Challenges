import java.util.Stack;

public class Solution {
	
	 public static int strongPasswordChecker(String s) {
		 
		 int numChanges = 0;
		 int charsToBeAdded = 0;
		 boolean hasLowerCase = false;
		 boolean hasUpperCase = false;
		 boolean hasDigit     = false;
		 
		 int assumedDigit = 0;
		 int assumedLower = 0;
		 int assumedUpper = 0;
		 
		 
		 
		 Stack<Character> stack = new Stack<Character>();
		 Stack<Character> possible_changes = new Stack<Character>();
		//check if atleast 6 characters and max 20 characters
		if(s.length() < 6){
			 numChanges = numChanges + 6 - s.length();
			 
			 if(numChanges>=3){
				 possible_changes.push('a');
				 possible_changes.push('a');
				 possible_changes.push('a');
			 }
			 
			 if(numChanges==2){
				 possible_changes.push('a');
				 possible_changes.push('a');
			 }
			 
			 if(numChanges==1){
				 possible_changes.push('a');
				
			 }
			
		}
				 
		if(s.length() > 20){
			 numChanges = numChanges + s.length() - 20;
		}
		
		//Check if it contains one lower one upper and digit
		for (int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				hasLowerCase = true;
			}
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				hasUpperCase = true;
				
			}
			
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				hasDigit = true;
			}
		
			if(!stack.isEmpty() && stack.peek().equals(s.charAt(i))){
				stack.push(s.charAt(i));
			}
			
			if(!stack.isEmpty() && !stack.peek().equals(s.charAt(i))){
				//check if we have +3 repeated character in the stack
				if(stack.size() >=3){
					int  x = stack.size() / 3;
					
					numChanges = numChanges +  stack.size() / 3  ;
					
					
					 for(int k = 1; k < x; k++){
						 possible_changes.push('a');
					 }
					 
				}
				stack.clear();
			}
			
			if (i == s.length()-1 && ! stack.isEmpty()){
				if(stack.size() >=3){
					int  x = stack.size() / 3;
					
					numChanges = numChanges +  stack.size() / 3  ;
					
					
					 for(int k = 1; k < x; k++){
						 possible_changes.push('a');
					 }
					
				}
				stack.clear();
			}
			
			if(stack.isEmpty()){
				stack.push(s.charAt(i));
			}
		}
		
		
		if(!hasDigit){
			if(!possible_changes.isEmpty()){
				possible_changes.pop();
			}
			else{
				numChanges = numChanges + 1;
			}
		}
		
		if(!hasUpperCase){
			if(!possible_changes.isEmpty()){
				possible_changes.pop();
			}
			else{
				numChanges = numChanges + 1;
			}
		}
		
		if(!hasLowerCase){
			if(!possible_changes.isEmpty()){
				possible_changes.pop();
			}
			else{
				numChanges = numChanges + 1;
			}
		}
		
		return numChanges;
	 }
	 
	 public static void main(String[] args){
		 System.out.print(strongPasswordChecker("aaa1111"));
	 }
}
