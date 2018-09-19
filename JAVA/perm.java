import java.util.Scanner;
import java.lang.Thread;
class perm
{
	perm(String str)
	{
		int len=str.length();
		boolean flag[]=new boolean[len];
		StringBuffer out =new StringBuffer();
		char in[]=str.toCharArray();
		doperm(in,out,flag,len,0);
	}
	void doperm(char in[],StringBuffer out,boolean flag[],int len,int level)
	{
		if(level == len)
		{
			System.out.println(out);
			return;
		}
		for(int i=0;i<len;i++)
		{  
			try
			{
				
			    if(flag[i])
				  continue;
			   out.append(in[i]);
			   flag[i]=true;
			   Thread.sleep(100);
			   doperm(in,out,flag,len,level+1);
			   flag[i]=false;
			   out.setLength(out.length()-1);
			}catch(InterruptedException ee)
			{}
		}
	}
	static int  fact(int l)
	{
		if(l==0||l==1)
			return 1;
		else
		{
			return(l*fact(l-1));
		}
	}
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter  String :");
		String str=ss.nextLine();
		System.out.println("Possible combinations are: "+fact(str.length()));
        perm pp=new perm(str);		
	}
}