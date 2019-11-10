import java.util.*;
import java.io.*;


public class Tree1 
{
	
	public static class Node 
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
	
	public static void preOrder(Node root) 
	{
		 // Base Case 
        if (root == null) 
        { 
            return; 
        } 
  
        // Create an empty stack and push root to it 
        Stack<Node> nodeStack = new Stack<Node>(); 
        nodeStack.push(root); 
		
		 while (nodeStack.empty() == false) 
		 { 
             
	            // Pop the top item from stack and print it 
	            Node mynode = nodeStack.peek(); 
	            System.out.print(mynode.data + " "); 
	            nodeStack.pop(); 
	  
	            // Push right and left children of the popped node to stack 
	            if (mynode.right != null) 
	            { 
	                nodeStack.push(mynode.right); 
	            } 
	            if (mynode.left != null) 
	            { 
	                nodeStack.push(mynode.left); 
	            } 
	        } 
    }
	
	public static void postOrder(Node root) 
	{
			
		   Node t = root;
		   
		   //Deque<Node> stack = new ArrayDeque<Node>();
		   Stack<Node> stack = new Stack<Node>();
		   
		   stack.push(root);
		    
		   while(!stack.isEmpty() && root!=null)
		   {
		        root = stack.peek();
		       // System.out.println( root.data);
		        //nodes without children should be printed 
		        if( (root.left==null&&root.right==null) || (t==root.left||t==root.right) )
		        {   //or nodes whose children have already been printed 
		            System.out.print(root.data+" ");
		            
		            stack.pop();
		            t = root;
		            //System.out.println("t : " + t.data);
		        }
		        else
		        {
		            if(root.right!=null) stack.push(root.right);
		            if(root.left!=null) stack.push(root.left);
		        }
		    }
		
	}
	
	public static void inOrder(Node root) 
	{
		
		 Stack<Node> stack = new Stack<Node>();
		 
		 while(!stack.isEmpty() || root!=null)
		 {
			 if(root != null)
			 {
				 stack.push(root);
				 root = root.left;
			 }
			 else
			 {
				 root = stack.pop();
				 System.out.print(root.data+" ");
		         root = root.right;   
			 }
		 }
		 
			
    }
	
	static Node lca(Node n, int v1, int v2) 
	{
	    while (n != null) 
	    {
	        if (n.data > v1 && n.data > v2) 
	        {
	            n = n.left;
	        } 
	        else if (n.data < v1 && n.data < v2) 
	        {
	            n = n.right;
	        }
	        else 
	        {
	            break;
	        } 
	    }
	    
	    return n;
	}

	public static void main(String[] args) 
	{
		Node begin = new Node(7);
		
		insert(begin, 4);
		insert(begin, 9);
		insert(begin, 2);
		insert(begin, 44);
		insert(begin, 3);
		
		inOrder(begin);
		

	}

}
