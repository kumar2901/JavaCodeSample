import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class altString {
    public static StringBuffer check(String str)
     {
		 StringBuffer sb=new StringBuffer(str);
        for(int i=1;i<sb.length();i++)
        {
          if(sb.charAt(i)==sb.charAt(i-1))
           {
             sb=sb.deleteCharAt(i-1);
			 i--;
           }
        }
        return sb;
     }

    public static void main(String[] args) 
    {
      Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        for(int i=0;i<n;i++)
         {
           String str=ss.next();
            int len=str.length();
			//System.out.println(len);
            StringBuffer sub=check(str);
            int ans=len-sub.length();
            System.out.println(ans);
         }
    }
}