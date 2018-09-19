import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Stack
    {
   private  char stk[];
   private  int top=-1;
    private int  C=15;
      Stack()
          {
          stk=new char[C];
          
         }
     public void push(char ele)throws Exception
         {
         if(top==C-1)
             {
             throw new Exception("stack overflow");
         }
         top++;
         stk[top]=ele;
       }
    public void pop()throws Exception
        {
        if(top==-1)
            throw new Exception("stack underflow");
        stk[top--]=' ';
        
    }
    public char  peek()
        {
        return stk[top];
       }
    public int size()
        {
        return top+1;
    }
    
}
 class Solution {
    public boolean check(Stack stack,String s)
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
				stack.pop();
				}catch(Exception ee)
				{}
				
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


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack stack=new Stack();
			Solution sol=new Solution();
            if(sol.check(stack,s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
