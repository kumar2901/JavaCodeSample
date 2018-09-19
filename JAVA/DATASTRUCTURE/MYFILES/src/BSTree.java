import java.util.Scanner;


public class BSTree {
	public Node create_BST()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter data for root node: ");
		int data=ss.nextInt();
		Node root=new Node(data);
	//	ss.close();
		return root;
	}
	public void insert(Node root,int ndata)
	{
		if(ndata>root.data)
		{
			if(root.right==null)
			{
				root.right=new Node(ndata);
			}
			else
				insert(root.right,ndata);
		}
		if(ndata<root.data)
		{
			if(root.left==null)
			{
				root.left=new Node(ndata);
			}
			else
				insert(root.left,ndata);
		}
	}
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		BSTree bst=new BSTree();
		Node root=bst.create_BST();
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter data:[-1 to stop] ");
			 int ndata=ss.nextInt();
			 if(ndata==-1)
		      break;
			bst.insert(root,ndata);
		}
		Traverse tt= new Traverse();
		tt.inOrder(root);
		ss.close();
	}
	
}

