package Search;

public class Search {
	public Search(){
		
	}
	
	//public method to do binary search
	public int binarySearch(int[] arr, int target, int start, int end){
		//the arr is sorted before hand
		//the chose the middle element and round down
		int middle = (int)(end+start)/2;
		
		if(arr[middle] != target ){
			if(start == end && arr[middle]!=target ){
				return -1;
			}
			if(target < arr[middle]){
				return binarySearch(arr,target,start,middle);
			}
			if(target > arr[middle]){
				return binarySearch(arr,target,middle+1,end);
			}
			else return -1;
		}
		else return middle;
	}
}
