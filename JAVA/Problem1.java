//problem 1 page no.397
import java.util.*;
class Problem1
{
	public static long solution(long n)
	{
		long sum=0;
		if(n==1||n==0)
			return 1;
		else
		{
			sum+=(2*solution(n)*solution(n-1));
			return sum;
		}
	}
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int t=ss.nextInt();
		while(t-->0)
		{
			
			System.out.println("Enter last value:  ");
			long n=ss.nextInt();
			System.out.println("sum="+solution(n));
		}
	}
}