import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class SAnagram {
	 public static boolean check(String s1,String s2)
	 {
		 int n1=s1.length();
		 int n2=s2.length();
		 int a[]=new int[26];
		 int b[]=new int[26];
		 for(int i=0;i<n1;i++)
		 {
			 a[(int)s1.charAt(i)-97]++;
		 }
		 for(int i=0;i<n2;i++)
		 {
			 b[(int)s2.charAt(i)-97]++;
		 }
		 for(int i=0;i<26;i++)
		 {
			 if(a[i]!=b[i])
				 return false;
		 }
		 return true;
	 }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ss=new Scanner(System.in);
        int t=ss.nextInt();
        while(t-->0)
        {
          String str=ss.next();
		  int len=str.length();
		  int n= (len*(len+1))/2;
		 String s[]=new String[n];
		 int k=0;
          for(int i=0;i<len;i++)
              {
              for(int j=i+1;j<=len;j++)
                  {
                   s[k++]=str.substring(i,j);
				    
                  }
          }
		  int count=0;
		  for(int i=0;i<n-1;i++)
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  if(check(s[i],s[j]))
				  {
					  count++;
				  }
			  }
		  }
		  System.out.println(count);
        }
    }
}