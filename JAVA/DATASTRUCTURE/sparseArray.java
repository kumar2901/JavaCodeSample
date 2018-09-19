import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sparseArray
 {
  
    public static void main(String[] args) 
	{
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   int count[]=new int[n];
	   ArrayList<String> arr=new ArrayList<String>();
	   for(int i=0;i<n;i++)
	   {
		   String str=scan.next()+scan.nextLine();
		   
		   if(arr.contains(str))
		   {
			   int j=arr.indexOf(str);
			   count[j]=count[j]+1;
			   
		   }
		   else
		   {
			   arr.add(str);
		   }
	   }
	   int q=scan.nextInt();
	   for(int i=0;i<q;i++)
	   {
		   String string=scan.next();
		   int index=arr.indexOf(string);
		   if(index!=-1)
		   System.out.println(count[index]+1);
	       else
		   {
			   int temp=0;
			   System.out.println(temp);
		   }
	   }
	   
	   
	}
 }