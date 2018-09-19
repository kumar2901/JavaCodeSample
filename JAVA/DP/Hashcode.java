
import java.io.BufferedReader;
import java.io.InputStreamReader;


class HashTest {
	
	public static boolean isPresent(String str)
	{
		int len=str.length();
		for(int i=0;i<len-1;i++)
			   {
				   for( int j=i+1;j<len;j++)
				   {
					   System.out.println(str.charAt(i)+" "+str.charAt(j));
					   if(str.charAt(i)==str.charAt(j))
					   {
						   return true;
					   }
				   }
			   }		   
	 return false;
	}
    public static void main(String args[] ) throws Exception {
      

       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   int t=Integer.parseInt(br.readLine());
	   while(t-->0)
	   {
		  // System.out.println("enter String: ");
		   String str=br.readLine();
		   int len=str.length();
		   if(len==1)
		   {
			   System.out.println("No");
			  
		   }
		   else
		   {
			  if(isPresent(str))
			  System.out.println("Yes");
			  else
			  System.out.println("No");
			   
		   }
	   }
    }
}
