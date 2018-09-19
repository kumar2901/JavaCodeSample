import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	public static long fact(int n,long f[])
	{
		if(n==0||n==1)
			return 1;
		else if(f[n]!=0)
			return f[n];
		else
			return f[n]=n*fact(n-1,f);
	}
  public static void main(String args[] ) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());

      for (int p = 0; p < n; p++) 
      {
         String str=br.readLine().toLowerCase();
         int len=str.length();
         int a[]=new int[26];
         long f[]=new long[len+1];
         for(int i=0;i<len;i++)
         {
         	int j=str.charAt(i)-97;
         	a[j]++;
         }
         long t=fact(len,f);
         long val=1;
         for(int i=0;i<25;i++)
         {
            int l=a[i];
            val*=fact(l,f);
         }
       long ans=t/val;
       System.out.println(ans);
      }
  }
}
