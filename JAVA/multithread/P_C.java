import java.lang.Thread;

class resource
{
	int n;
	boolean flag=false;
	synchronized int get()
	{
		if(!flag)
		{
			try{
				wait();
			}catch(InterruptedException ee){}
		}
		System.out.println("Got:"+n);
		flag=false;
		notify();
		return n;
	}
	synchronized void  put(int n)
	{
		if(flag)
		{
			try{
				wait();
			}catch(InterruptedException e1){};
		}
		this.n=n;
		System.out.println("put:"+n);
		flag=true;
		notify();
	}
	
}

class Producer implements Runnable
{
	resource r;
	public Producer(resource r)
	{
		this.r=r;
		new Thread(this,"Producer").start();
	}
	
	public void run()
	{
		//int i=0;
		for(int i=1;i<11;i++)
		{
			try 
			{
			r.put(i);
			Thread.sleep(1000);
			}catch(InterruptedException ee){}
		}
	}
}

class Consumer implements Runnable
{
	resource r;
	public Consumer(resource r)
	{
		this.r=r;
		new Thread(this,"Consumer").start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			r.get();
		}
	}
}
public class P_C
{
	public static  void main(String args[])
	{
		resource r=new resource();
		Producer pp=new Producer(r);
		Consumer cc=new Consumer(r);
		
//		System.out.println("press ctrl+c to end this process!!!");
	}
}