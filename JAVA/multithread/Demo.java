import java.lang.Thread;

class Demo extends Thread
{
      static  Demo dd;
	  public static void main(String args[])
	  {
	      dd=new Demo();
		 System.out.println("is thread alive: "+dd.isAlive());
		 dd.start();
		 System.out.println("is thread alive: "+dd.isAlive());
		 
	  }
	  
	  public void run()
	  {
	      System.out.println("Thread is running ");
		  dd.stop();    
		  System.out.println("Thread is killed ");
		  
		 
	  }
}