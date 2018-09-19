
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
	public static long cal(int n,int r)
	{
		
		if(r>n/2)
		r=n-r;
		
		long ans=1;
		for(int i=1;i<=r;i++)
		{
			ans*=(n-r+i);
			ans/=i;
		}
		return ans;
	}
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
       String s[]=str.split(" ");
       int n=Integer.parseInt(s[0]);
       int k=Integer.parseInt(s[1]);
       int x=Integer.parseInt(s[2]);
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int count=0;
	   String string=br.readLine();
	   String s1[]=string.split(" ");
	   
       for(int i=0;i<n;i++)
       {
       	int temp=Integer.parseInt(s1[i]);
		
       	if(temp<min)
       	{
       		min=temp;
       	}
       if(temp>max && (temp-min)<=x)
       	{
       		max=temp;
 
       	}
        if((temp<=max)&&(temp>=min))      
        count++;
       	
       }
	 
       long ans=cal(count,k);
       System.out.println(ans);
       
       

    }
}
