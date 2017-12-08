import java.util.Stack;


//Input: [1,3,5,4,7]
//Output: 3
//Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
//Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 

//Input: [2,2,2,2,2]
//Output: 1
//Explanation: The longest continuous increasing subsequence is [2], its length is 1. 

public class Solution {

	private Stack<Integer> stack = new Stack<Integer>();
	
	public static int findLengthOfLCIS(int[] nums) {
		
		int prevousNum = -100000;
		int currentNum;
		int counter = 0;
		int maxCounter = 0;
		
		for(int x = 0; x < nums.length; x++){
			if(nums[x] > prevousNum){
				counter ++; 
				prevousNum = nums[x];
				
			}
			
			else if(nums[x]<= prevousNum){
				if(maxCounter<counter){
					maxCounter = counter;
				}
				
				counter = 1;
				prevousNum = nums[x];
			}
			
			if (x == nums.length-1){
				if(maxCounter<counter){
					maxCounter = counter;
				}
			}
		}
		return maxCounter;
    }
	
	public static void main(String[] args) {
		System.out.println(findLengthOfLCIS(new int[]{}));

	}

}
