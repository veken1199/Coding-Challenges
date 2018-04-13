
public class CountAndSay {
	
	 public String countAndSay(int n) {
		 // defining the first 3 base cases
		 if(n == 1 | n == 0){
			 return "1";
		 }
		 
		 if (n == 2){
			 return "11";
		 }
		 
		 //defining var that will hold the seq
		 char[] previous_sequence = this.countAndSay(n-1).toCharArray();
		 
		 int start_pointer = 0;
		 int end_pointer = 0;
		 
		 String sequence_output = "";
		 
		 for (; end_pointer < previous_sequence.length; ){
			int character_counter = 0;
			
			while (end_pointer != previous_sequence.length && previous_sequence[start_pointer] == previous_sequence[end_pointer]) {
				character_counter++;
				end_pointer++;
			}
			
			sequence_output = sequence_output + character_counter + previous_sequence[start_pointer];
			start_pointer = end_pointer;
		 }
		 return sequence_output;
	    }
}
