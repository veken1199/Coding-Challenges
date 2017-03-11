// Reverse digits of an integer.
//
// Example1: x = 123, return 321
// Example2: x = -123, return -321
//
// click to show spoilers.

//this solution beats 99.97% of the submissions 212,000 submission



public class Solution {
	public static long reversed(long rev, int x){
		if (x==0){
			return rev;
		}

		else{
			return reversed((rev*10 + x%10), x/10);
		}
	}
	
	
	public static int reverse(int x) {
		long rev = reversed(0,x);
		if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
			return 0;
		}
		else {
			return (int)rev;
		}
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(15342369));
	}

}
