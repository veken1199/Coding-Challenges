import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that
//they add up to a specific target.
//
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.

//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].


public class Solution {
	
	public static int[]  twoSum(int[] nums, int target) {
        Map<Integer, Integer> mappedNums = new HashMap<Integer, Integer>();
		int[] index = new int[2];
		//populate the hashtable with the nums
		for (int i = 0; i < nums.length; i++ ){
			//we dont need the numbers that are bigger than the target
			mappedNums.put(nums[i],i);
		}
		
		//check the if we can find the complement of the integer such that it is equal to the result
		for(int i = 0; i < nums.length; i++){
			if(mappedNums.containsKey(target - nums[i]) &&  mappedNums.get(target - nums[i]) != i ){
				index[0] = i;
				index[1] = mappedNums.get(target - nums[i]);
                break;
			}
		}
		return index;
	}
	
	
	public static void main(String[] args){
		
		int[] input = {3,2,4};
		int[] res = twoSum(input, 6);
		res = res;
	}

}
