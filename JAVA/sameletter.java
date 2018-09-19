import java.util.*;

class Letter
{
   public static void main(String args[])
   {
	   Scanner ss=new Scanner(System.in);
	   
	   System.out.println("Enter no. of test cases:");
	   int t= ss.nextInt();
	   while(t-->0)
	   {
		   System.out.println("Enter string:");
		   String str=ss.next();
		   StringBuffer str1 =new StringBuffer (str.toLowerCase());
		   
		   
		     for(int i=0;i<str1.length()-1;i++)
			 {
				 char ch1=str1.charAt(i); 
				 //System.out.println("ch1:"+ch1);
				 for(int j=i+1;j<str1.length();j++)
				 {
					 
					 char ch2=str1.charAt(j);
					 if((byte)ch1==(byte)ch2)
					 {
						 System.out.println("j:"+j+" deleted character: "+ch2);
						 str1.deleteCharAt(j);
						 j--;
						 
					 }
				 }
			 }
		   System.out.println("final string :"+str1);
       }
	   
	}
}