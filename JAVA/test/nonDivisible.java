import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class nonDivisible
{
  public static int min(int a,int b)
  {
    return (a<b?a:b);
  }
  public static int max(int a,int b)
  {
    return (a>b?a:b);
  }
  
     public static void main(String args[])
	 {
	 Scanner ss=new Scanner(System.in);
	 int n=ss.nextInt();
	 int k=ss.nextInt();
	 int a[]=new int[k];
	 for(int i=0;i<n;i++)
	    {
	      long temp=ss.nextLong();
	      int index=(int)(temp%k);
	       a[index]=a[index]+1;
	   
	   
	    }
		int count=0;
		for(int i=0;i<k;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		if(k%2==0)
		{
			a[k/2]=min(a[k/2],1);
			
		}
		for(int i=1;i<=k/2;i++)
			count+=max(a[i],a[k-i]);
		
		count=count+min(a[0],1);
		System.out.println(count);
	 
	 
	 
	 }
}