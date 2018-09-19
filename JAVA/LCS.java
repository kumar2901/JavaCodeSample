import java.util.*;

class Lcs
{
	public static void longest_csequence(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		
		int c[][]=new int[l1+1][l2+1];
		char b[][]=new char[l1+1][l2+1];
		for(int i=0;i<l1;i++)
		{
			c[i][0]=0;
			//b[i][0]='x';
		}
	    for(int j=0;j<l2;j++)
		{
			c[0][j]=0;
			//b[0][j]='x';
		}
		
		for(int i=1;i<=l1;i++)
		{
			char ch1= s1.charAt(i-1);
			for(int j=1;j<=l2;j++)
			{
				char ch2=s2.charAt(j-1);
				if((byte)ch1==(byte)ch2)
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i-1][j-1]='d';
				}
				else
					if(c[i-1][j]>=c[i][j-1])
					{
						c[i][j]=c[i-1][j];
						b[i-1][j-1]='u';
						
					}
				else
				{
					c[i][j]=c[i][j-1];
			 		b[i-1][j-1]='l';
				}
			}
		}
	/*	//for printing b[][]
		for(int p=0;p<=l1;p++)
		{
			for(int q=0;q<=l2;q++)
			{
				System.out.print(b[p][q]+" ");
			}
			System.out.println("  ");
		}
		*/
		print_LCS(b,s1,l1-1,l2-1);
	}
	public static void print_LCS(char b[][],String s1,int i,int j)
	{
		if((i<0)||(j<0))
			return;
		if(b[i][j]=='d')
		{
			
			print_LCS(b,s1,i-1,j-1);
			char ch=s1.charAt(i);
			System.out.print(ch);
		}
		else if(b[i][j]=='u')
	    	{
				//System.out.println("i:"+i+"\tj:"+j);
		       print_LCS(b,s1,i-1,j);
		    }
		else
		{
			System.out.println("i:"+i+"\tj:"+j);
			print_LCS(b,s1,i,j-1);
		}
	}
	
	
	
	
	
	public static void main (String args[])
	{
		Scanner ss =new Scanner(System.in);
		System.out.println("Enter niumber of test cases:");
		int t=ss.nextInt();
		
		while(t-->0)
		{
			System.out.println("\nEnter first string:");
			String s1=ss.next();
			
			System.out.println("\nEnter 2nd string:");
			String s2=ss.next();
            System.out.println("\nLongest common subsequence:");			
			longest_csequence(s1,s2);
		}
	}	
}