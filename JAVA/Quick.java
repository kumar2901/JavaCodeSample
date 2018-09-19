import java.util.Scanner;
class Quick
{
   void Quick_sort(int A[],int p,int r)
   {
      if(p<r)
	  {
		int q=partition(A,p,r);
			Quick_sort(A,p,q-1);
			Quick_sort(A,q+1,r);
	  }
   }
   
   int partition(int A[],int p,int r)
   {
      int i=p-1;//index of sorted list
	  int x=A[r];//pivot element
	  for(int j=p;j<r;j++)
	  {
			if(A[j]>x)
			{
				i++;
				int temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
	   }	
		int temp=A[i+1];	
		A[i+1]=A[r];
		A[r]=temp;
		return (i+1);
   }
    public static void main(String args[])
	{
	    Scanner ss=new Scanner(System.in);
		Quick qq=new  Quick();
		System.out.println("Enter size of array: ");
		int n=ss.nextInt();
		int A[]=new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
		  	A[i]=ss.nextInt();
		}
		System.out.println("elements before  sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+"  ");
		}
		System.out.println("\n elements after  sorting:");
	     qq.Quick_sort(A,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+"  ");
		}
	}
}