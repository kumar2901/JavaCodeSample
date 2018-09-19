import java.io.*;
public class Amazon {
	public static long ways(long n,long r)
	{
		if(n<r)
		{
			return 0;
		}
		
		if(r>n/2)
			r=n-r;
		long ans=1;
		long i;
		for(i=1;i<=r;i++)
		{
			ans*=n-r+i;
			ans/=i;
		}
		return ans;
	}
  public static void main(String args[])throws IOException
  {
	 final long MOD=10000007;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(br.readLine());
	 String food=br.readLine();
	 String sleep=br.readLine();
	 int q=Integer.parseInt(br.readLine());
	 while(q-->0)
	 {
	     String q1=br.readLine();
	     String que[]=q1.split(" ");
	     int L=Integer.parseInt(que[0]);
	     int R=Integer.parseInt(que[1]);
	     long count1=0;
	     long count2=0;
	     long count3=0;
	     
	     for(int i=L;i<R;i++)
	     {
	    	 
	    	 if((food.charAt(i)==food.charAt(i-1))&&(sleep.charAt(i)==sleep.charAt(i-1)))
	    	 {
	    		 count1=(count1+1)%MOD;
	    	 }
	    	 else
	    	 {
	    		 if(food.charAt(i)==food.charAt(i-1))
	    		 {
	    			 count2=(count2+1)%MOD;
	    		 }
	    		 if(sleep.charAt(i)==sleep.charAt(i-1))
	    		 {
	    			 count3=(count3+1)%MOD;
	    		 }
	    		 
	    	 }
	    	 long sum=(ways(count1+1,2)+ways(count2+1,2)+ways(count3+1,2))%MOD;
	    	 System.out.println(sum);
	     }
	 }
  }
}
