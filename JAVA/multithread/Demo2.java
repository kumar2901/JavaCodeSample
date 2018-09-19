import java.lang.Thread;

public class Demo2 extends Thread
{
    public void run()
	{
	System.out.println("Thread is running!!!");
	 try
	  {
	    Thread.sleep(1000);
		
	  }catch(InterruptedException ee)
	  {
	  ee.printStackTrace();
	  }
	 System.out.println("Thread is dead!!!");
	   
	}
	public static void main(String args[])
	{
	   Demo2 d1=new Demo2();
	   Demo2 d2=new Demo2();
	   Demo2 d3=new Demo2();
	   Demo2 d4=new Demo2();
	   d1.start();
	   d2.start();
	   d3.start();
	   d4.start();
	   System.out.println("Thread: "+d1.getId());
	   System.out.println("Thread: "+d2.getId());
	   System.out.println("Thread: "+d3.getId());
	   System.out.println("Thread: "+d4.getId());
	   
	}
}