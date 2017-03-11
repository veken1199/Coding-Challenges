
public class Solution {
	public static boolean isPrime(int number){
		boolean isprime = true;
		int i = 1;
		while(isprime & i++<10){
			isprime = ((number %i == 0 & number != i))? false : true;
		}
		return isprime;
	}
	
	public static void pattern(int numRows){
		for(int i = 0; i < numRows; i++){
			
			// represents the semi diagonal number
			int unique = (i+1)*numRows;
			for(int j = 1; j <= numRows; j++){
				
				//case when we are before reaching the index of unique
				if (j<i){
					System.out.print((unique-(i-j)) );
				}
				
				//case when we reach after the unique index
				else if (j!=i ){
					
					System.out.print(((i*2)+j+i));
				}
				
				//case to print the unique number
				else{
					System.out.print(unique);
				}
				System.out.print("|");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		System.out.println(isPrime(4));
		pattern(4);
		
//		sample output
//		
//		false
//		1|2|3|4|
//		8|5|6|7|
//		11|12|9|10|
//		14|15|16|13|
		
		
	}
}
