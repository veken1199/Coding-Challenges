public class Solution {
	
	public static void main(String[] args) {
		
		ListNode L = new ListNode(2);
		ListNode LL = new ListNode(22);
		ListNode S  = new ListNode(3);
		
		L.next = LL;
		LL.next = S;
		
		ListNode sum = addTwoNumbers(L,LL);
		
		
	}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		
		ListNode sum = new ListNode(0);
		ListNode newNode = sum;
		int mod = 0;
		
		while (l1 != null && l2 !=null){
			 
			
			int summation = l1.val + l2.val + mod;
			mod = 0;
			if(summation/10 > 10){
				summation = summation%10;
				mod = 1;
			}
			
			newNode.val = summation;
			newNode = sum.next;
			l1 = l1.next;
			l2 = l2.next;
			
			System.out.print(sum.val);
			}
		
		return sum;
	}

}

class ListNode{
	
	public int val;
	public ListNode next;
	
	public ListNode(int val){
		this.val = val;
		this.next = null;
	}
	
	public void addNext(ListNode next){
		this.next = next;
	}
	
	public void addValue(int val){
		this.val = val;
	}
	
	
}


