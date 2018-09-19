import java.lang.Thread;

public class Deadlock
{
  public static void main(String args[])
  {
      String s1="java";
	  String s2="C/C++";
	  Thread t1=new Thread(new Runnable()
	  {
	    public void run()
		{
		   synchronized(s1){
		    System.out.println(" Thread accessing :"+s1);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ee)
			{
			}
		     synchronized(s2)
             {
			   System.out.println("Thread accessing :"+s2);
			   
             }			 
		   }
		}
	  });
	  
	  Thread t2=new Thread(new Runnable()
	  {
	    public void run()
		{
		   synchronized(s2){
		    System.out.println(" Thread accessing :"+s2);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ee)
			{
			}
		     synchronized(s1)
             {
			   System.out.println("Thread accessing :"+s1);
			   
             }			 
		   }
		}
	  });
	  
	  t1.start();
	  t2.start();
  }

}