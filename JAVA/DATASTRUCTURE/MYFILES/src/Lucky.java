import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lucky {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long mod=1000000009;
        String number = in.next();
        // your code goes here
        long count=0;
        for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<=n;j++)
                {
                   long temp=Long.parseLong(number.substring(i,j));
                   System.out.println(temp);
                   if(temp%8==0 && temp!=0)
                       count=(count+1)%mod;
            }
        }
        System.out.println(count%mod);
        
        
    }
}
