import java.util.Scanner;
import java.util.*;

class Duplicate
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=ss.nextInt();
		int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=ss.nextInt();
		 }
	    Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			set.add(arr[i]);
		}
		Iterator iter=set.iterator();
		System.out.println("After removing duplicate elements: ");
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
	}
}