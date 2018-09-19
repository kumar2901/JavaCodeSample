import java.io.InputStreamReader;
import java.io.BufferedReader;
class Sap1
{
	public static  long result(int n,int r)
	{
		if(r>n/2)
			r=n-r;
		long ans=1;
		for(int i=1;i<=r;i++)
		{
			ans*=n-r+i;
		    ans/=i;
		}	
		return ans;
	}
	public static void main(String args[])throws Exception{
		
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter test cases:");
			int test=Integer.parseInt(br.readLine());
			while(test-->0)
			{
				System.out.println("Enter size:");
				int n=Integer.parseInt(br.readLine());
				//int a[]=new int[n];
				System.out.println("elements:");
				String str=br.readLine();
				String s[]=str.split(" ");
				
				long count=n;
				for(int i=0;i<s.length-1;)
				{
					String st=s[i];
					for(int j=i+1;j<s.length;j++)
					{
						if(s[i].equals(s[j]))
						{
							st+=s[j];
						}
                       	else
                          j=n+3;							
					}
					if(st.length()>=2)
					{
						
					count+=result(st.length(),2);
					}
					i+=st.length();
				}
				System.out.println(count);
				count=0;
			}
			
	}
}