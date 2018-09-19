import java.util.Scanner;
//pattern matching using KMP algorithm
class patternMatching
{
	public static int KMP(String str,String p)
	{
		int l1=str.length();
		int l2=p.length();
		int i=0,j=0;
	    int F[]=prefix_table(p,l2);
		while(i<l1)
		{
	      if(str.charAt(i)==p.charAt(j))
		  {
			  if(j==l2-1)
				  return (i-j);
			  else
			  {
				  i++;
				  j++;
				  
			  }
		  }
          else if(j>0)
		  {
			 j=F[j-1];
		  }
          else
             i++;			  
		}
		return -1;
	}
	
	
	public static  int[] prefix_table(String p,int len)
	{
		int f[]=new int[len];
		int i=1,j=0;
		f[0]=0;
		while(i<len)
		{
			if(p.charAt(i)==p.charAt(j))
			{
				f[i]=j+1;
				i++;
				j++;
			}
			else if(j>0)
				j=f[j-1];
			else
			{
				f[i]=0;
				i++;
			}
		}
		return f;
	}
	
	
	
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int t=ss.nextInt();
		while(t-->0)
		{
			System.out.println("Enter String:");
			String str=ss.next();//main string
			System.out.println("Enter pattern to be serached:");
			String p=ss.next();//window string
			if(KMP(str,p)>=0)
			{
				System.out.println("String matched.");
			}
			else
			{
				System.out.println("String  doesn't matched.");
			}
		}
	}	
}