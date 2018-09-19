import java.util.*;
import java.io.*;
import java.math.BigInteger;
class Substring {
	
	public static boolean isBeauty(String str)
	{
		int len=str.length();
		if(str.charAt(0)=='0')
			return false;
        if(len==1)
            return false;
		int i=1;
		while(i<len-1)
		{
	        curr=Integer.parseInt(str.substring(0,i));
		     if(str.charAt(i+1)=='0')
		      {
		     	curr=10*curr;
			    i++;
		      }
			  if(str.charAt(i+1)==str.charAt(i))
			  {
				  curr=10*curr+str.charAt(i+1);
			  }
			  
		   
		}
    }
	public static void main(String args[] ) throws Exception {
		
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
        	String s=sc.next();
			if(isBeauty(s))
				System.out.println("YES");
			else
				System.out.println("NO");
			}
        
    }    
} 