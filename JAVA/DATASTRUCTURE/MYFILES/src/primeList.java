
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.*;


public class primeList {
    public static boolean check(long num)
    {
           if(num%2==0 && num!=2)
               return false;
           for(long i=3;i<=(long)Math.sqrt(num);i+=2)
            {
              if(num%i==0)
                  return false;
        }
        return true;
    }

    public static void main(String[] args)throws Exception
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String s[]=str.split(" ");
        long L=Long.parseLong(s[0]);
        long R=Long.parseLong(s[1]);
        ArrayList<Long> list=new ArrayList<Long>();
        for(long i=L;i<=R;i++)
            {
            if(i>1 && check(i))
                list.add(i); 
        }
        TreeSet<Long> set=new TreeSet<Long>(list); 
        list=new ArrayList<Long>(set);
        int count=0;
        for(int i=0;i<list.size()-1;i++)
            {
            if((long)list.get(i+1)-(long)list.get(i)==2)
            count++;
        }
        System.out.println(count);
    }
}