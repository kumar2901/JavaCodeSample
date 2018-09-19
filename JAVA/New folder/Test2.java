
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass2 
{   
    public static void main(String args[] ) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String in=br.readLine();
		String ele[]=in.split(" ");
		int count=0;
		if(n<3)
		{
			System.out.println(count);
		}
		else 
		{ for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int a=Integer.parseInt(ele[i]);
					int b=Integer.parseInt(ele[j]);
					int c=Integer.parseInt(ele[k]);
					if((a<b)&&(b>c))
					{
                       count++;						
					}
					if((a>b)&&(b<c))
					{
                       count++;						
					}
					
				}
			}
		}
		
		System.out.println(count);
		}
	}
}
