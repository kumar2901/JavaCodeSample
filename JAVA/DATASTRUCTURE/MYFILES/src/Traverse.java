import java.util.*;
public  class Traverse
{
    public void preOrder(Node root)
    {
    	if(root!=null)
    	{
    	    System.out.print(" "+root.data);
        	preOrder(root.left);
    	    preOrder(root.right);
    	}
    }
    public void inOrder(Node root)
    {
    	if(root!=null)
    	{
    	  inOrder(root.left);
    	  System.out.print(" "+root.data);
    	  inOrder(root.right);
    	}
    }
    public void postOrder(Node root)
    {
    	if(root!=null)
    	{
    		postOrder(root.left);
    		postOrder(root.right);
    		System.out.print(" "+root.data);
    	}
    }
    public int height(Node root)
    {
    	if(root==null)
    		return 0;
    	int l=height(root.left);
    	int r=height(root.right);
    	return (l>r?l+1:r+1);
    }
}
