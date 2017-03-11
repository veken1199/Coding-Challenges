
public class Solution {
	public static boolean isPrime(int number){
		boolean isprime = true;
		int i = 1;
		while(isprime & i++<10){
			
			isprime = ((number %i == 0 & number != i))? false : true;
		}
		return isprime;
	}
	
	public static void main(String[] args){
		System.out.println(isPrime(6));
	}
}
