package Sort;
	
//this class contains different types of sorts
//the sorting will be mainly focused on int type
public class Sort {

	public Sort(){
	
	}
	
	public int[] bubbleSort(int[] arr){
		
		int[] sortedArray = new int[arr.length];
		Boolean swapped = true; //flag to determine if swaphappend
		
		while(swapped){
			
			swapped = false;
			for(int i = 0; i < arr.length-1;i++){
				int j = i+1;
				if(arr[i]>arr[j]){
					swap(arr,i,j);
					swapped = true;
				}
			}
		}
		
		return arr;
	}
	
	public void swap(int[] arr, int first, int second){
		
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	
	}
	
}
