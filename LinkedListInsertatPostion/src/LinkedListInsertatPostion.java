import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class LinkedListInsertatPostion {
	
	static class SinglyLinkedListNode 
	{
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList 
    {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() 
        {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) 
        {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
	
	  static void printLinkedList(SinglyLinkedListNode head) 
	    {
	            while (head != null)
	            {
	            System.out.println(head.data); 
	            head = head.next; 
	            }
	    } 
	  
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) 
	{
		  
		  SinglyLinkedListNode current = new SinglyLinkedListNode(data);
		  
		 
		  
		  current.next = llist;
		  
		  llist = current;
		  
		  
	            
		  	return llist;
	 }
	
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) 
	{
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
			
		if (head != null && position == 0)
		{
			//System.out.println("What up");
			node.next = head;
			head = node;
			return head;
		}
		
		SinglyLinkedListNode current = head;
		SinglyLinkedListNode prev = null;
		
		 int i = 0;

	        while (i < position) {
	            prev = current;
	            current = current.next;

	            if (current == null) {
	                break;
	            }

	            i++;
	        }

	        node.next = current;
	        prev.next = node;
	        
	        return head;
		
	}
	
	 static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) 
	 {
		 	
		 	SinglyLinkedListNode current = head;
			SinglyLinkedListNode prev = null;
			//SinglyLinkedListNode temp = null;
			
			
			if (head != null && position == 0)
			{
				//System.out.println("What up");
				head = current.next;
				
				return head;
			}
			
			 	int i = 0;

		        while (i < position) {
		            prev = current;
		            current = current.next;

		            if (current == null) {
		                break;
		            }

		            i++;
		        }

		        current = current.next;
		        prev.next = current;
		        
		        return head;
	 }
	 
	 static void reversePrint(SinglyLinkedListNode head) 
	 {
		
		 
		SinglyLinkedListNode current = head;
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode temp = null;
		
		while(current != null)
		{
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		head = prev;
		
		printLinkedList(head);
	 }
	 
	 
	 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	 {
		 	
		 	
	        ArrayList<Integer> listOne = new ArrayList<Integer>();
	         
	        ArrayList<Integer> listTwo = new ArrayList<Integer>();
	         
	        while(head1 != null)
		 	{
		 		listOne.add(head1.data);
		 		head1 = head1.next;
		 		
		 	}
		 	
		 	while(head2 != null)
		 	{
		 		listTwo.add(head2.data);
		 		head2 = head2.next;
		 		
		 	}
		 	
		 

		 	  	boolean isEqual = listOne.equals(listTwo);      //false
		        //System.out.println(isEqual);
		        
		        return isEqual;
	 }
	 
	 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	 {
		 int count = 0;	
		 SinglyLinkedListNode temp = head1;
		 SinglyLinkedListNode temp2 = head2;
		 
		 
		 ArrayList<Integer> listOne = new ArrayList<Integer>();
		 
		 while(head1 != null)
		 {
			 listOne.add(head1.data);
			 head1 = head1.next;
		 }
		 
		 while(head2 != null)
		 {
			 listOne.add(head2.data);
			 head2 = head2.next;
		 }
		 
		 //System.out.println(listOne);
		 
		 Collections.sort(listOne);
		 
		// System.out.println(listOne);
		 
		 head1 = temp;
		
		 
		 head2 = temp2;
		// printLinkedList(head2);
		 
		 while(head1 != null)
		 {
			 //System.out.println(head1.data);
			 head1.data = listOne.get(count++);
			 head1 = head1.next;
		 }
		 
		 while(head2 != null)
		 {
			 head2.data = listOne.get(count++);
			 head2 = head2.next;
		 }
		 
		 head2 = temp2;
		 	
		
		 
		 head1 = temp;
		 
		 while(head1.next != null)
		 {
			 
			 head1 = head1.next;
		 }
		 
		 head1.next = head2;
		 
		 head1 = temp;
		 
		 return head1;

	 }
	 
	 static int getNode(SinglyLinkedListNode head, int positionFromTail) 
	 {
		 	SinglyLinkedListNode current = head;
			SinglyLinkedListNode prev = null;
			SinglyLinkedListNode temp = null;
			
			int count = 0;
			
			while(current != null)
			{
				temp = current.next;
				current.next = prev;
				prev = current;
				current = temp;
			}
			
			head = prev;
			
			//printLinkedList(head);
			
			while (count < positionFromTail)
			{
				if(head.next != null)
				{
					head = head.next;
				}
				count++;
			}
			
			return head.data;
			
			

	    }
	 
	  static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) 
	    {
		  
		  	SinglyLinkedListNode n = head;
		    while(head.next!=null)
		        {
		       
		        if( head.data==head.next.data)
		            head.next=head.next.next;
		        else
		            head=head.next;
		    }
		    return n;
	    }
	  
	    static boolean hasCycle(SinglyLinkedListNode head) 
	    {
	    	   if (head == null){
	    	        return false;
	    	    }

	    	   SinglyLinkedListNode slow = head;
	    	   SinglyLinkedListNode fast = head;

	    	    while (fast != null && fast.next != null){
	    	        slow = slow.next;
	    	        fast = fast.next.next;

	    	        if (slow == fast){
	    	            return true;
	    	        }
	    	    }

	    	    return false;

	    }
	    
	    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	    {
	    	SinglyLinkedListNode currentA = head1;
	    	SinglyLinkedListNode currentB = head2;

	        //Do till the two nodes are the same
	        while(currentA != currentB){
	            //If you reached the end of one list start at the beginning of the other one
	            //currentA
	            if(currentA.next == null){
	                currentA = head2;
	            }else{
	                currentA = currentA.next;
	            }
	            //currentB
	            if(currentB.next == null){
	                currentB = head1;
	            }else{
	                currentB = currentB.next;
	            }
	        }
	        return currentB.data;

	    }

	public static void main(String[] args) 
	{
		int showInt;
		
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertNode(3);
		llist.insertNode(2);
		
		llist.insertNode(2);
		llist.insertNode(3);
		llist.insertNode(2);
		llist.insertNode(2);
		llist.insertNode(3);
		//llist.insertNode(3);
		
		
		
		
		SinglyLinkedList llistB = new SinglyLinkedList();
		llistB.insertNode(42);
		llistB.insertNode(1999);
		
		llistB.insertNode(212);
		llistB.insertNode(3888888);
		
		//SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, 38);
		
		//llist.head = llist_head;
		
		//SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, 38, 0);
		
		
		/*SinglyLinkedListNode llist_head = deleteNode(llist.head, 2);
		
		
		llist.head = llist_head;
		
		printLinkedList(llist.head);*/
		
		//reversePrint();
		
		//SinglyLinkedListNode llist_head = mergeLists(llist.head, llistB.head);
		
		//printLinkedList(llist_head);

		//showInt = getNode(llist_head, 6);
		//System.out.println(showInt );
		
 
		
		SinglyLinkedListNode llist_head = removeDuplicates(llist.head);
		
		llist.head = llist_head;
		
		printLinkedList(llist.head);
	}

}
