//ladder climbing
import java.io.BufferedReader;

import java.io.InputStreamReader;

class TestClass
{
   public static final long  MOD=10000007;
   public static void main(String args[] )throws Exception
   {
       try{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	//System.out.println("number of test cases and total number of ladder:");
            String str=br.readLine();
            String s[]=str.split(" ");
		int t=Integer.parseInt(s[0]);
		long n=Long.parseLong(s[1]);
		while(t-->0)
		{
                      String str1=br.readLine();
                        String s1[]=str1.split(" ");
			//System.out.println("value of cur and k:");
		        long cur=Long.parseLong(s1[0]);
			long k=Long.parseLong(s1[1]);
			long count=0;
			
			if(cur<k)
			{
				//System.out.println("case1:"+cur+"\t"+k);
				if(cur%2==0)
					count=(count+1)%MOD;
			     if(cur%5==0)
					count=(count+1)%MOD;
			    long sum=0;
				for(long i=1;i<(n/2+1);i++)
				{
					for(long j=1;j<(n/5+1);j++)
					{
						 sum+=((2*i) +(5*j));
						if(sum==cur)
						{
							count=(count+2)%MOD;
						}
					}
					sum=0;
				}
	             					
			}
			 if(cur>=k)
			{
				//count=0;
				//System.out.println("case2:"+cur+"\t"+k);
				if(cur%2==0)
				count=(count+1)%MOD;
			     if(cur%5==0)
					count=(count+1)%MOD;
				if(cur%k==0)
					count=(count+1)%MOD;
				long sum=0;
				long sum1=0;
				long sum2=0;
				long sum3=0;
				for(long i=1;i<=(n/2);i++)
				{
					for(long j=1;j<=(n/5);j++)
					{
						for(long l=1;l<=(n/k);l++)
						{
						    sum+=( (2*i) +(5*j)+(k*l) );
							sum1+=((2*i)+(5*j));
							sum2+=((2*i)+(k*l));
							sum3+=((5*j)+(k*l));
							//System.out.println(sum+"\t"+sum1+"\t"+sum2+"\t"+sum3);
					    	if((sum==cur))
						     {
					    		count=(count+3)%MOD;
					 	     }
							 if(sum1==cur)
							 {
								 if((i==1)&&(j==1))
								 count=(count+2)%MOD;
							     else
									 count=(count+3)%MOD;
							 }
							 if(sum2==cur)
							 {
								 if((i==1)&&(l==1))
								   count=(count+2)%MOD;
							     else
									 count=(count+3)%MOD;
							 }
							 if(sum3==cur)
							 {
								 if((j==1)&&(l==1))
								 count=(count+2)%MOD;
							     else
									 count=(count+3)%MOD;
							 }
						}
					}
					sum=0;
					sum1=0;
					sum2=0;
					sum3=0;
				}
				
			}
			
			System.out.println(count);
		}
     }catch(Exception ee)
    {return;}
   }
}