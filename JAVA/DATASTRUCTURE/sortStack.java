import java.util.*;

class sortStack
{
     public static void main(String args[])
	 {
	     Scanner ss=new Scanner(System.in);
		 Stack stack= new Stack();
		  Stack stk=new Stack();
		 System.out.println("Enter no of  elements to be inserted into stack:");
		  int n=ss.nextInt();
		   System.out.println("Enter elements into stack:");
		  for(int i=0;i<n;i++)
		  {  
		    int data=ss.nextInt();
			try{
		    stack.push(data);
			}catch(Exception ee){System.out.println(ee);}
		  }
		  System.out.println("elements are: ");
          System.out.println(stack);		  
		  System.out.println("sorted stack elements are:");
		  while(!stack.isEmpty())
		  {
			  try
			  {
			  int temp=stack.pop();
			  
			  while((!stk.isEmpty())&&(stk.top()>temp))
			  {
				  try
				  {
                  stack.push(stk.pop());	
                  }catch(Exception ee1){}				  
			  }
			  
			  stk.push(temp);
			  }catch(Exception ee2){}
		  }
		  
		 System.out.println(stk);
	 }
}