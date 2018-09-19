

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class TestClass {
			
	
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt( br.readLine());
        for (int p = 0; p < t; p++)
        {
        	String str=br.readLine();
        	String[] s=str.split(" ");
        	int n=Integer.parseInt(s[0]);
        	int l=Integer.parseInt(s[1]);
        	int r=Integer.parseInt(s[2]);
			TreeSet<Integer> list=new TreeSet<Integer>();
        	int count=0;
           for(int i=2;i<=n;i++)
           {
           	boolean isPrime=true;
			if(i%2==0&& i>2)
			{
				isPrime=false;
			}
			else{
           	for(int j=3;j<=(int)Math.sqrt(i);j+=2)
           	{
           		if(i%j==0)
           		{
           			isPrime=false;
           			break;
           		}
			}
			}
           	if(isPrime)
           	{
				list.add(i);
           	}
           }
		   for(int j=l;j<=r;j++)
		   {
			   boolean flag=false;
			   for(int k:list)
			   {
				   if(j%k==0)
				   {
					   flag=true;
					   break;
				   }
				   
			   }
			   if(flag)
				   count++;
		   }
		   //count=count+(r-l)/2;
       
     System.out.println(count);
      
    }
}
}