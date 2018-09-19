import java.util.Scanner;

class Heap
{
	Heap()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter size of heap");
		int n=ss.nextInt();
		int A[]=new int[n];
		System.out.println("Enter elements of heap");
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
		heapsort(A,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+"  ");
		}
	}
	
	
    void heapify(int A[],int i,int size)
	{
		int l=2*i+1;
		int r=2*i+2;
		int large=-1;
		if(l<size && A[l]>A[i])
		{
			large=l;
		}
		else
			large=i;
		if(r<size && A[r]>A[large])
		{
			large=r;
		}
		if(large!=i)
		{
			int temp=A[i];
			A[i]=A[large];
			A[large]=temp;
			heapify(A,large,size);
		}
		
	}
	
	void build_heap(int A[],int size)
	{
		for(int i=(size/2);i>=0;i--)
		{
			heapify(A,i,size);
		}
	}
	
	void heapsort(int A[],int size)
	{
		build_heap(A,size);
		for(int i=size-1;i>=0;i--)
		{
			int temp=A[0];
			A[0]=A[i];
			A[i]=temp;
			size=size-1;
			heapify(A,0,size);
		}
	}
	
	public static void main(String args[])
	{
		Heap hh=new Heap();
	}
	
}