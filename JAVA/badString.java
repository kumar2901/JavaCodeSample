import java.util.Scanner;
//string which do not have same cosecutive letters are called as good string
class badString
{
   public static void main(String args[])
   {
	   Scanner ss=new Scanner (System.in);
	   System.out.println("Enter number of test cases:");
	   int t=ss.nextInt();
	   while(t-->0)
	   {
		   System.out.println("Enter String:");
		   String str=ss.next();
		   StringBuffer s1=new StringBuffer(str.toLowerCase());
		   for(int i=0;i<s1.length()-1;i++)
		   {
			   if(s1.charAt(i)==s1.charAt(i+1))
			   {
				   s1.deleteCharAt(i);
				   i--;
				   
			   }
		   }
		   System.out.println("final string:"+s1);
	   }
   }
}