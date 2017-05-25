
public class Solution {


	public static int searchInsert(int[] nums, int target) {
	       	return binarySearch(nums, target, 0, nums.length-1);
	    }
	
	//this method will return the position of the number found in the arr
	// if the num was not found, it will return the position where the num must have been found.
	public static int binarySearch(int[] arr, int target, int start, int end){
		int middle = (start + end) / 2;
		
		if(arr[middle] == target){
			return middle;
		}
		
		if(start >= end){
			int output = (arr[start] > target)? (start) : (start +1);
			return output;
		}
		
		int output = (arr[middle] < target)? binarySearch(arr, target, middle+1, end) : binarySearch(arr, target, start, middle-1);
		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3};
		
		System.out.print(searchInsert(arr, 0));
	}

}
