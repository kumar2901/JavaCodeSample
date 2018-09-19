import java.lang.Thread;

class Demo3 implements Runnable
{
     public void run()
	 {
		 
			 for(int i=0;i<3;i++)
			 {
				 try
				 {
				   Thread.sleep(1000);
				   System.out.println("Current thread :"+Thread.currentThread());
				 }catch(InterruptedException ee)
				 {
					 
				 }
				 
			 }
		 
	 }
	  public static void main(String args[])
	  {
	     Demo3 dd=new Demo3();
		 Thread th=Thread.currentThread();
		 System.out.println("inside main method: "+th);
		  Demo3 d1=new Demo3();
		  th=new Thread(dd,"First");
		  th.start();
		 /*static
		 {
		   System.out.println("inside static block :",Thread.currentThread());
           		   
		 }*/
		 
	  }
	  
	  
}