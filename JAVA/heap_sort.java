import java.util.Scanner;
import java.util.*;
import java.lang.Thread;

class Heapsort
{
 public int left(int i)
    {
      return (2*i+1);
    }
 public   int right(int i)
    {
      return (2*i+2);
    }
  public  void max_heapify(int A[], int i,int length)
    {
      
    int le=left(i);
    int r=right(i);
    int largest=-1;
      if((le<length) &&(A[le]>A[i])){
       largest=le;}
      else
     {         largest=i;}
     if((r<length) &&(A[r]>A[largest])){
       largest=r;}
       //System.out.println("largest: "+largest);
	  // System.out.println("largest : "+largest+" i: "+i);
	   //System.out.println("left: "+le+"right:"+r);
     if(largest!= i)
     {
		 
      int temp=A[largest];
      A[largest]=A[i];
      A[i]=temp;
	   
	  max_heapify(A,largest,length); 
     }
	
    
    
   }

 public  void build_heap(int A[],int length)
   { 
    
    int size=length;
    for(int i=(size/2)-1;i>=0;i--)
    {
      max_heapify(A,i,size);
    }
   }

  void  heap_sort (int A[])
 {
  int size=A.length;
   build_heap(A,size);
   for(int i=size-1;i>0;i--)
   {
     int temp=A[0];
     A[0]=A[i];
     A[i]=temp;

     size--;
    max_heapify(A,0,size);
   }
 }

  public static void main(String args[])
  {
   Scanner ss=new Scanner(System.in);
   Heapsort hs =new Heapsort();
   System.out.println("Enter size:");
   int n=ss.nextInt();
   int A[]=new int[n];
   System.out.println("Enter elements:");
     for(int i=0;i<n;i++){
        A[i]=ss.nextInt(); }
   System.out.println("sorted  elements:");
    hs.heap_sort(A);
     for(int i=0;i<n;i++){	
	System.out.print(A[i]+"  ");      


       }
  }



}
