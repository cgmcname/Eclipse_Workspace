import java.util.*;
import java.io.*;





public class Btreework 
{
	
	static class Node 
	{
	    Node left;
	    Node right;
	    int data;
	    
	    Node(int data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
	
	public static Node insert(Node root, int data) 
	{
        if(root == null) 
        {
            return new Node(data);
        } 
        else 
        {
            Node cur;
            if(data <= root.data) 
            {
                cur = insert(root.left, data);
                root.left = cur;
            } 
            else 
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

	public static int height(Node root) 
	{
		Stack<Node> stack = new Stack<Node>();
		
		stack.push(root);
		
		  int left = 0;
		  int right = 0;
		  
		  while (stack.empty() == false) 
		    { 
		        // Pop the top item from stack and print it 
		        Node node = stack.peek();
		        //System.out.print(node.data + " ");  
		        stack.pop(); 
		  
		        // Push right and left children of the popped node to stack 
		        if (node.right != null) 
		        { 
	                stack.push(node.right);
	                right++;
	            } 
	            if (node.left != null) 
	            { 
	                stack.push(node.left); 
	                left++;
	            } 
	            
	            left = Math.max(left, right);
	             
	            right = Math.max(left, right);
		    } 
		
		
		
		  return Math.max(left, right);
    }
	
	public static void levelOrder(Node root) 
	{
		 	Queue<Node> queue=new LinkedList<>();
		    queue.add(root);

		    while(!queue.isEmpty()) 
		    {
		        Node tempNode=queue.poll();
		        System.out.print(tempNode.data+" ");
		        if(tempNode.left!=null)
		            queue.add(tempNode.left);
		        if(tempNode.right!=null)
		            queue.add(tempNode.right);
		    }
    }
	
	static void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.data + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    }

	public static void main(String[] args) 
	{
		
		
		
		Node root = new Node(3);
		root = insert(root, 5);
		root = insert(root, 2);
		root = insert(root, 1);
		root = insert(root, 4);
		root = insert(root, 6);
		root = insert(root, 7);
		/*root = insert(root, 9);
		root = insert(root, 8);
		root = insert(root, 11);
		root = insert(root, 13);
		root = insert(root, 12);
		root = insert(root, 10);
		root = insert(root, 15);
		root = insert(root, 14);*/
		
		
		//printPreorder(root);
		
		levelOrder(root);
	}

}
