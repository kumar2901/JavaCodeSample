import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass1
{ 
	public static void main(String  args[])
	{
	   try
	   {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter number of test cases: ");		  
		  int t=Integer.parseInt(br.readLine());
		  while(t-->0)
		  {
			  //System.out.println("Enter number  of cars:");
			  int N=Integer.parseInt(br.readLine());
			  //System.out.println("Enter maximum speed of  each car:");
			  String str=br.readLine();
			  String s[]=str.split(" ");
			 int i=0;
			 int count=1;
			 int x=Integer.parseInt(s[0]);
			 if(N==1)
			 {
				 System.out.println(count);
			 }
			 else{
			for(i=0;i<N-1;i++)
			{
				int y=Integer.parseInt(s[i+1]);
				if(x>y)
				{
					count++;
					x=y;
				}
			}
			
			System.out.println(count);
			 }
		  }
	   }catch(Exception ee)
	   {
		   //System.out.println("Exception ");
		   //ee.printStackTrace();
	     return;
	   }
	   
	}
}