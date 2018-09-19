import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.regex.*;
class X
    {
    int size;
    int m;
    public int getVal()
        {
        return size;
    }
}
class MyComparator implements Comparator<X>
    {
    public int compare(X x1,X x2)
        {
        if(x1.getVal()>x2.getVal())
        return -1;
        else
         return 1;
    }
 }
public class TreeSet1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();  
        TreeSet<X>list=new TreeSet<X>(new MyComparator());
        
        for(int crate_i=0; crate_i < c; crate_i++)
        {
            X x =new X();
            x.m=in.nextInt();
            x.size=in.nextInt();
            list.add(x);
            
        }
        long sum=0;
        for(X x:list)
            {
            if(n<=0)
                break;
                
            if(n<=x.m)
            {
                sum=sum+n*x.size;
            }
            if(n>x.m)
            {
               
            sum=sum+x.m*x.size;
            }
  System.out.println(n+" "+x.m+" "+x.size); 
 n=n-x.m;
        }
        System.out.println(sum);
        // your code goes here
    }
}
