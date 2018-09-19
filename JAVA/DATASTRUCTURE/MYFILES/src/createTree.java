import java.util.*;
public class createTree 
{
	public Node create()
	{
		Node root;
		Scanner ss=new Scanner(System.in);
		System.out.println("enter data[-1 in case of no child]: ");
		int data=ss.nextInt();
		if(data==-1)
			return null;
		root=new Node(data);
		System.out.println("Enter  left node of "+data);
		root.left=create();
		System.out.println("Enter right node of "+data);
		root.right=create();
		
		return root;
	}
   public static void main(String args[])
   {
	   Node root=null;
	   createTree ct=new createTree();
	   Traverse tt=new Traverse();
	  
	  while(true)
	  {
		  System.out.println("\t\t\n\nMENU\n\n\n");
		  System.out.println("\t\t1-create binary tree");
		  System.out.println("\t\t2-traverse preorder");
		  System.out.println("\t\t3-traverse inorder");
		  System.out.println("\t\t4-traverse postorder");
		  System.out.println("\t\t5-Height of tree");
		  System.out.println("\t\t6-exit");
		  System.out.println("\n\n\nEnter your choice: ");
		  Scanner ss=new Scanner(System.in);
		  int ch=ss.nextInt();
		  switch(ch)
		  {
		  case 1:
			   root= ct.create();
			  break;
		  case 2:
			  tt.preOrder(root);
			   break;
		  case 3:
			  tt.inOrder(root);
			  break;
		  case 4:
			  tt.postOrder(root);
			  break;
		  case 5:
			  int len=tt.height(root);
			  System.out.println("\n\nheight of tree:"+len);
			  break;
		  case 6:
			  System.out.println("\n\nThank you");
			  System.exit(0);
			  break;
		default:
			System.out.println("\n\nPlease select appropriate option");
			break;
		  }
		  
	  }
   }
}
