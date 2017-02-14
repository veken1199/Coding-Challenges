
import java.util.*;


public class Solution {
	
//	Given a string, find the length of the longest substring without repeating characters.
//
//	Examples:
//
//	Given "abcabcbb", the answer is "abc", which the length is 3.
//
//	Given "bbbbb", the answer is "b", with the length of 1.
//
//	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//

	
	//the first idea was to use hashtable, however, hashtables are of dynamic size and this was 
	//a drawback in the performance. we basically are using simple int[] of the all char data type size
	//the int contains the index of each character in the string. two int pointers are used to traverse
	//the array
	
    
 	public static int lengthOfLongestSubstring(String s) {
        
 		int[] temp = new int[255];
        int max = 0 ;
        Arrays.fill(temp,new Integer(-2));
        
        for (int i = 0, j = 0; i < s.length(); ++i ){

     	   if(temp[(int)s.charAt(i)] >= j-1){
     		   j =s.indexOf(s.charAt(i), j)+1;
     	   }
     	   
     	temp[(int)s.charAt(i)] = i;
     	max = Math.max(i-j+1, max);
     	}
        return max;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = lengthOfLongestSubstring("dvddddddwwwwwdwdwdsdywhe");
		System.out.println(d);
	}

}
