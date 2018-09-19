//factorial of number using dynamic programming

import java.util.Scanner;

class Dfactorial
{
	public static int fact(int num)
    {
		int F[]=new int[num+1];
		if(num==0||num==1)
			return 1;
		else if(F[num]!=0)
		{
			return F[num];
			
		}
		else
		return	(F[num]=num*fact(num-1));
	}	
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int t=ss.nextInt();
		while(t-->0)
		{
			System.out.println("Enter any number:");
			int num=ss.nextInt();
			int result=fact(num);
			System.out.println("factorial:"+result);
			
		}
	}
}