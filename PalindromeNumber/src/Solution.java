
public class Solution {

	public static boolean isPalindrome(int x) {
		if(x%10 == 0 && x!=0 || (x < 0 )) return false;
		return reverseHalf(0,x);
		
    }
	
	public static boolean reverseHalf(int reversed,int x){
		if(reversed<x){
			return reverseHalf(x%10 + reversed*10,x/10);
		}
		return(reversed == x || reversed/10 == x);
	}
	
	public static boolean isPalindrome2(int x) {
	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome2(0163610));
	}

}
