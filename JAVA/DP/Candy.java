import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Candy
{
     public static void main(String args[])throws IOException
	 {
		 try
		 {
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("test cases:");
	      int t=Integer.parseInt(br.readLine());
	      while(t-->0)
	       {
	         System.out.println("number of boxes:");
		     int n=Integer.parseInt(br.readLine());
		     int box[]=new int[n];
			 String str=br.readLine();
			 String s[]=str.split(" ");
			 ArrayList ar=new ArrayList();
			 for(int i=0;i<len;i++)
			 {
				 ar.add(new Integer());
			 }
		     while(ar.isEmpty()==false)
			 {
				ar.
			 }
				 
		    
             long sum=0;
			 int len=n;
			 ArrayList ar=new ArrayList();			 
			 int x=box[0]+box[1];
			 ar.add(new Integer(x));
             for(int i=2;i<len;i++)
			 {
				 ar.add(new Integer(box[i]));
            				 
			 }
			 Collection.sort(ar);
			
			
	       }
		 }catch(Exception ee)
		 {
			 return;
		 }
	 }
}