 import java.util.*;
 public class PalindromeList
 {
	 public class ListNode
	 {      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 };
 
	 public boolean isPalindrome(ListNode head)
	 {
		int len=0;ListNode temp=head;
		while(temp.next!=null)
		{
		    temp=temp.next;
		    len++;
		}
		int k=0;temp=head;
		ListNode prev = null; 
		ListNode current = temp; 
		ListNode next; 
		while (k<=len/2 &&  current != null) { 
		    next = current.next; 
		    current.next = prev; 
		    prev = current; 
		    current = next; 
		    k++;
		}  
	     
		ListNode way1=prev; ListNode way2=prev;
		while(way1!= null && way2!=null)
		{
		    if(way1.val!=way2.val)
		        return false;
		    if((way1.next==null) != (way2.next==null))
		        return false;
		    way1=way1.next;way2=way2.next;
		    
		}
		return true;
	    }
} 
 
