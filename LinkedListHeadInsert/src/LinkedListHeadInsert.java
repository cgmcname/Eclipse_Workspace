import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LinkedListHeadInsert 
{

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

	public static void main(String[] args) 
	{
		
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertNode(1);
		llist.insertNode(2);
		
		llist.insertNode(3);
		llist.insertNode(4);
		
		SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, 38);
		
		llist.head = llist_head;
		
		
		printLinkedList(llist.head);

	}

}
