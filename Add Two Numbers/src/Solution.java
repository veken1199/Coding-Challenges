import java.util.ArrayList;
import java.util.List;



class Node {
	public int x;
	public InnerNode xx;
	
	private class InnerNode { 
		public int innerX;
	}
}

public class Solution {
	
//	You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
	
	public static void main(String[] args) {
		
		Node n = new Node();
		Node.InnerNode xxx = new Node.InnerNode();
		
		
		
		ListNode L = new ListNode(6);
		ListNode LL = new ListNode(5);
		ListNode S  = new ListNode(0);
		ListNode SS = new ListNode(9);
		ListNode SSS = new ListNode(8);
		
		L.next = LL; //18
		S.next = SS; //02
		//SS.next= SSS;
		//sum =  0 7 1
		
		ListNode sum = addTwoNumbers(L,S);
		
		while(sum != null){
 			sum.toString();
			sum = sum.next;
		}
		
		List<Integer> x = new ArrayList<Integer>();
		int[] xx = {1,23,4};
		int d = xx.length;
		for(int c : xx){
			System.out.print(c);
		}
		
	}
	
	public static ListNode add(ListNode l1, ListNode l2, int carry){
		
		if(l1 == null && l2 == null && carry ==0)return null;
		if(l1 == null && l2 == null && carry != 0)return new ListNode(1);
		
		int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
		
		ListNode result_node = new ListNode(sum%10);
		result_node.next = add((l1 == null ? null : l1.next) , (l2 == null ? null : l2.next), sum/10 );
		return result_node;
	}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		
		return add(l1 , l2 , 0);
	}
	
}

class ListNode{
	
	public int val;
	public ListNode next;
	
	public ListNode(int val){
		this.val = val;
		this.next = null;
	}
	
	public ListNode(){
		this.val = 0;
		this.next= null;
	}
	
	public void addNext(ListNode next){
		this.next = next;
	}
	
	public void addValue(int val){
		this.val = val;
	}
	
	public String toString(){
		System.out.println(this.val + " ");
		return null;
	}
	
	
}



