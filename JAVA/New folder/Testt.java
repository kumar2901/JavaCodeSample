
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt( br.readLine());

        for (int p = 0; p <t ; p++) {
          String str=br.readLine();
          String s[]=str.split(" ");
          TreeSet<Long> list=new TreeSet<Long>();
          Long n=Long.parseLong(s[0]);
          long l=Long.parseLong(s[1]);
          long r=Long.parseLong(s[2]);
         
          
            int count=0;
           list.add((long)2);
           for(long i=3;i<=n;i+=2)
           {
           	 boolean isPrime=true;
           	 for(long j=3;j<=Math.sqrt(i);j+=2)
           	{
           		if(i%j==0)
           		{
           		isPrime=false;
           		break;
           		}
           	}
           	if(isPrime)
           	{
           		list.add(i);
           		//isPrime=true;
           	}
           }
           l=(long)((l%2==0)?l+1:l);
           for(long j=l;j<=r;j+=2)
           {
           	boolean flag=false;
           	for(long k:list)
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
           int count1=(int)(count+(r-l)/2+1);
           System.out.println(count1);
        }
        

        
    }
}
