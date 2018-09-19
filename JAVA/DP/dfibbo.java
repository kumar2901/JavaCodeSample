import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class dFibbonacci
{
    BigInteger t0,t1;
   public BigInteger  fibbo(int n,BigInteger f[] )
       {
       if(n==0)
           return t0;
      
       if(n==1)
           return t1;
       f[0]=t0;
       f[1]=t1;
       for(int i=2;i<=n;i++)
	   {
		   //System.out.println("hello");
           f[i]=(f[i-1].pow(2)).add(f[i-2]);
	   }
       return f[n];
   }
    public static void main(String[] args) 
    {
        dFibbonacci sol=new dFibbonacci();
       Scanner ss=new Scanner(System.in);
        String str=ss.next()+ss.nextLine();
		 String s[]=str.split(" ");
        
         sol.t0=new BigInteger(s[0]);
         sol.t1=new BigInteger(s[1]);
		 int n=Integer.parseInt(s[2]);
         BigInteger[] f=new BigInteger[n+1];	
        System.out.println(sol.fibbo(n-1,f));
               ss.close();
    }
}