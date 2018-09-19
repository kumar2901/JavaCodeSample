/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 
import java.util.*;
class primeList
{
    public static void decode(String S)
       { 
     String ans="";
     StringBuffer str=new StringBuffer(S);
	// System.out.println("hiii "+S.length());
     //int i=0;
     while(str.length()>1)
        {
			//System.out.println("hiii "+str.length());
        if(str.substring(0,1).equals("1"))
            {
            ans=ans+"A";
            str=str.delete(0,1);
            //i=i+1;
        }
	
       if(str.substring(0,2).equals("00"))
            {
            ans=ans+"B";
            str=str.delete(0,2);
        }
        if(str.substring(0,2).equals("01"))
            {
            ans=ans+"C";
             str=str.delete(0,2);
        }
    }
    if(str.length()==1)
    {
        ans=ans+"A";
    }
    
     System.out.println(ans);   
   
       
    }
		public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		String str=ss.next();
		decode(str);
    }
}