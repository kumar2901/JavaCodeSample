//tower of honoi
import java.util.Scanner;

class tower
{
	int n;
	tower()
	{
		n=0;
	}
	void honoi(int num,String start,String temp,String dest)
	{
		if(num==1)
		{
			System.out.println(start+"-->"+dest);
			return ;
		}
		else
		{
		  honoi(num-1,start,dest,temp);//start to temp
		  System.out.println(start+"-->"+dest);
		  honoi(num-1,temp,start,dest);//tem -to-dest
	    }
	}
	
	
	public static void main(String ags[])
	{
		Scanner ss=new Scanner(System.in);
		tower tt=new tower();
		System.out.println("Enter number of disks:");
		tt.n=ss.nextInt();
		System.out.println("Here is movement of disks are: ");
		tt.honoi(tt.n,"A","B","C");
		
	}
}