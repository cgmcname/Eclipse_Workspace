    import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;



	
	public class DoubleLList {
	
		static class DoublyLinkedListNode 
		{
	        public int data;
	        public DoublyLinkedListNode next;
	        public DoublyLinkedListNode prev;

	        public DoublyLinkedListNode(int nodeData) 
	        {
	            this.data = nodeData;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	    static class DoublyLinkedList 
	    {
	        public DoublyLinkedListNode head;
	        public DoublyLinkedListNode tail;

	        public DoublyLinkedList() 
	        {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) 
	        {
	            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

	            if (this.head == null) 
	            {
	                this.head = node;
	            } 
	            else 
	            {
	                this.tail.next = node;
	                node.prev = this.tail;
	            }

	            this.tail = node;
	        }
	    }

	  /*  public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }*/
	    
	    static void printLinkedList(DoublyLinkedListNode head) 
	    {
	            while (head != null)
	            {
	            System.out.println(head.data); 
	            head = head.next; 
	            }
	    } 

	    // Complete the sortedInsert function below.

	    /*
	     * For your reference:
	     *
	     * DoublyLinkedListNode {
	     *     int data;
	     *     DoublyLinkedListNode next;
	     *     DoublyLinkedListNode prev;
	     * }
	     *
	     */
	    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) 
	    {
	    	DoublyLinkedList recon = new DoublyLinkedList();
	    	
	    	ArrayList<Integer> sort = new ArrayList<Integer>();
	    	
	    	
	    	
	    	sort.add(data);
	    	
	    	
	    	while (head != null)
	    	{
	    		sort.add(head.data);
	    		head = head.next;
	    	}
	    	
	    	Collections.sort(sort);
	    	
	    	for (int i = 0; i < sort.size(); i++)
	    	{
	    		
	    		recon.insertNode(sort.get(i));
	    	}
	    	
	    	head = recon.head;
	    	
	    	return head;

	    }
	    
	    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) 
	    {
	    	
	    	DoublyLinkedList recon = new DoublyLinkedList();
	    	
	    	Stack<Integer> stack = new Stack<Integer>();
	    	
	    	while (head != null)
	    	{
	    		stack.push(head.data);
	    		head = head.next;
	    	}
	    	
	    	while(!stack.empty())
	    	{
	    		recon.insertNode(stack.pop());
	    	}
	    	
	    	head = recon.head;
	    	
	    	return head;
	    	
	    	

	    }

	



	

	public static void main(String[] args) 
	{
		
		DoublyLinkedList original = new DoublyLinkedList();
		
		original.insertNode(1);
		original.insertNode(3);
		original.insertNode(4);
		original.insertNode(10);
		
		DoublyLinkedListNode node = sortedInsert(original.head, 5);
		
		
		
		original.head = node;
		
		node = reverse(original.head);
		
		original.head = node;
		
		
		
		printLinkedList(original.head);

	}

}
