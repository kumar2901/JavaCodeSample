import java.util.*;
class strStack
{
	private int capacity;
	private int top=-1;//because no one needs to know about this i,e:abstract from user
	 char stackRep[];//this array will be used to implement array; 
	 public static final int  CAPACITY=15;
	 
	 
	 public strStack()
	 {
		 this(CAPACITY);//default capacity of stack is 10
		 
	 }
    public strStack(int capacity)
	{
		this.capacity=capacity;
		stackRep=new char[capacity];
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

   public void push(char data)throws Exception
   {
	   if(isFull())
		   throw  new Exception("stack is full");
	   stackRep[++top]=data;
   }
   public char pop()throws Exception
   {
	   if(isEmpty())
		   throw  new Exception("stack is full");
	   char data=stackRep[top];
	   stackRep[top--]=' ';
	   return data;
   }
  public char peek()
  {
	  return stackRep[top];
  }
	
}

class balPar
{
	public boolean check(strStack stack,String s)
	{
		if(s==null||s.length()==0)
		{
			return true;
		}
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='(')||(s.charAt(i)=='[')||(s.charAt(i)=='{'))
			{
				try{
				stack.push(s.charAt(i));
				}catch(Exception ee1){}
			}
    		
			else if((s.charAt(i)==')'&&stack.peek()=='(')||(s.charAt(i)==']'&&stack.peek()=='[')||(s.charAt(i)=='}'&&stack.peek()=='{'))
			{
				try{
				//System.out.println("pop up character:"+stack.pop());
				}catch(Exception ee)
				{
				  	return true;
				}
				
			}				  
		}
		if(stack.size()!=0)
		{
			return false;
		}
		else{
			return true;
		}
		
	}
   public static void main(String args[])
   {
	   Scanner ss=new Scanner(System.in);
           int n=ss.nextInt();
       for(int i=0;i<n;i++)
       {
	      strStack stack=new strStack();
	     // System.out.println("enter string :");
	      String s=ss.next();
	      if(new balPar().check(stack,s))
	      {
		   System.out.println("YES");
	      }
	     else
	      {
		    System.out.println("NO");
	     }
     }
}
}