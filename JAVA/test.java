import java.util.*;
class Match
{
	public  static int KMP(String s, String p)
	{
	int	l1=s.length();
	int l2=p.length();
		int i=0,j=0;
		int F[]=prefix_table(s,l1);
		while(i<l1)
		{
			if(s.charAt(i)==p.charAt(j))
			{
				if(j==l2-1)
				{
					return (i-j);
				}
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
			{
				i++;
			}
		}
		return -1;
	}
	
	public static int[] prefix_table(String s,int len)
	{
		int i=1,j=0;
		int F[]=new int[len];
		F[0]=0;
		while(i<len)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				F[i]=j+1;
				i++;
				j++;
			}
			else if(j>0)
			{
				j=F[j-1];
				
			}
			else
			{
				F[i]=0;
				i++;
			}
		}
		return F;
	}
   public static void main(String ags[])
   {
     Scanner ss=new Scanner(System.in);
	 System.out.println("Enter number of test cases:");
	 int t=ss.nextInt();
	 while(t-->0)
	 {
		 System.out.println("Enter main string:");
		 String str=ss.next();
		 System.out.println("Enter window string:");
		  String p=ss.next();
		  if(KMP(str,p)>0)
		  {
			  System.out.println("matched");
		  }
		  else
		  {
			   System.out.println(" not matched");
		  }
	 }
   }
}