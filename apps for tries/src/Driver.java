import java.util.Random;
import java.util.Stack;

import Sort.Sort;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import Search.Search;

public class Driver {
	
	//method to add the numbers of an array
	public static int[] add(int[] numbers, int target){
		int[] sum;
		Stack<Integer> indices = new Stack<Integer>();
		
		Map<Integer,Integer> table = new Hashtable<Integer,Integer>();
		
		
		for(int i = 0; i<numbers.length;i++){
			try {
			int alocated = -1;
			alocated = table.put(numbers[i], numbers[i]);
			
				if(alocated != -1 && alocated*2 == target){
					for(int j = 0; j < numbers.length; j++){
						if(numbers[j]==alocated && i!=j){
							indices.push(j);
							indices.push(i);
						}
					}
				}
			}
			catch(Exception e){
				e.toString();
			}
		}
		
		for(int i = 0; i < numbers.length; i++){
			if((table.get(target-numbers[i])!=null && numbers[i] + numbers[i] !=target) ){
				indices.push(i);
			}
		}
		
		sum = new int[indices.size()];
		for(int i = indices.size()-1;i>=0 ;i--){
			sum[i] = indices.pop();
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,4,3,0};
		Sort sort = new Sort();
		
		int[] results = add(nums,0);
		for(int i = 0; i< results.length;i++){
			System.out.print(results[i]);
		}
		nums = sort.bubbleSort(nums);
		
		
		//System.out.print(s);
		
		
	}

}
