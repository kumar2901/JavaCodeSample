import java.util.*;

class maxRectangleArea
{
	public long calculate(int[] A)
	{
		long area=0;
		int i=0;
	   Stack<Integer> s=new Stack<Integer>();
        if(A==null||A.length==0)
         return 0;
        while(i<A.length)
        {
			if(s.empty()||A[s.peek()]<=A[i])
				s.push(i++);
			else
			{
				int top=s.pop();
				area=Math.max(area,A[top]*(s.empty()?i:i-s.peek()-1));
			}
		}
       while(!s.isEmpty())
	   {
		   int top=s.pop();
		   area=Math.max(area,A[top]*(s.empty()?i:i-s.peek()-1));
	   }		   
	   return area;
	}
	
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
	  System.out.println("Enter number of rectangles:");
	  int n=scan.nextInt();
	  int area[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  area[i]=scan.nextInt();
	  }
	  maxRectangleArea mm=new maxRectangleArea();
	  long ans=mm.calculate(area);
	  System.out.println(ans);
   }

}