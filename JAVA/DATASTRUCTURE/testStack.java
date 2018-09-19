import java.util.*;

class Stack
{
	private int capacity;
	private int top=-1;//because no one needs to know about this i,e:abstract from user
	 int stackRep[];//this array will be used to implement array; 
	 public static final int  CAPACITY=10;
	 
	 
	 public Stack()
	 {
		 this(CAPACITY);//default capacity of stack is 10
		 
	 }
    public Stack(int capacity)
	{
		this.capacity=capacity;
		stackRep=new int[capacity];
	}
     public int size()
	 {
		 return(top+1);
		 
	 }
    public boolean isEmpty()
	{
		if(top<0)
		{
			return true;
		}
		else
			return false;
	}
    public boolean isFull()
	{
		if(size()==capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
   public int top()
   {
	   return stackRep[top];
   }
   
   public void push(int data)throws Exception
   {
	   if(isFull())
		   throw  new Exception("stack is full");
	   stackRep[++top]=data;
   }
   public int pop()throws Exception
   {
	   if(isEmpty())
		   throw  new Exception("stack is full");
	   int data=stackRep[top];
	   stackRep[top--]=Integer.MIN_VALUE;
	   return data;
   }
   public String toString()
   {
	   String s;
	   s="[";
	   if(size()>0)
	   {
		   s+=stackRep[0];
	   }
	   if(size()>1)
	   {
		   for(int i=1;i<size();i++)
		   {
			   s+=","+stackRep[i];
		   }
	   }
	   return s+"]";
   }
	
}
public class testStack
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
        Stack stack=new Stack();
       while(true){
	   System.out.println(" ");
	   System.out.println("\t\t\t\t MENU\n\n\n\n");
	   System.out.println("\t\t1-> To PUSH\n");
	   System.out.println("\t\t2-> To POP\n");
	   System.out.println("\t\t3->To DISPLAY\n");
	   System.out.println("\t\t4->Exit\n");
	   System.out.println("Enter choice!!!");
	   int ch=ss.nextInt();
	   switch(ch)
	   {
	    case 1:
               try{		
               System.out.println("Enter data to be inserted!!!");
			   int data=ss.nextInt();
			   stack.push(data);
			   }catch(Exception ee)
			   {
				   System.out.println(ee);
			   }
               break;
        case 2:
		       try{
              int ele=stack.pop();
			  System.out.println("popped element is: "+ele);
			   }catch(Exception ee1)
			   {
				   System.out.println(ee1);
			   }
			  break;
        case 3:
	          
             System.out.println(stack.toString());
              break;
	    case 4:
	           System.exit(0);
			   break;
	    default:
	       System.out.println("wrong choice!!!");
		   break;
      			  
	   }
	    for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	      System.out.println(" ");
	   }		
	}
}