import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


class Football
{
       public static void main(String args[])throws IOException
	   {
		   try
		   {
			  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              //System.out.println("Enter no of test cases: ");
               int t=Integer.parseInt(br.readLine());
				while(t-->0)
				{
					//System.out.println("Enter no pass and initial pass ");
					String str=br.readLine();
					String s[]=str.split(" ");
					int n=Integer.parseInt(s[0]);
					int p0=Integer.parseInt(s[1]);
				    int pass=p0;
				    int back=0;
					while(n>0)
					{
						//System.out.println("Enetr pass:");
						String input=br.readLine();
						String input1[]=input.split(" ");
						int len=input1.length;
						if(len==2)
						{
						   back=pass;
						   pass=Integer.parseInt(input1[1]);
							n--;
						}
						 if(len==1)
						{
							int temp=back;
							back=pass;
							pass=temp;
							n--;
						}
					}
					System.out.println("Player "+pass);
				}
		   }catch(Exception ee)
		   {
			   return;
		   }
	   }
}