import java.util.*;

class Node
{
   int data;
   Node next;
}

class Insert
{
    public Insert(Node start)
	{
	 Scanner ss=new Scanner(System.in);
	 
	   for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   while(true){
	   System.out.println(" ");
	   System.out.println("\t\t\t\t INSERT MENU\n\n\n\n");
	   System.out.println("\t\t1-> To insert at beginning\n");
	   System.out.println("\t\t2-> To insert at end\n");
	   System.out.println("\t\t3->To insert at any position\n");
	   System.out.println("\t\t4->back to main menu");
       System.out.println("Enter your choice:");
	   int ch=ss.nextInt();
	   switch(ch)
	   {
	    case 1: 
               begin(start);
               break;
       case 2:
              end(start);
              break;
       case 3:
	          
              position(start);
              break;
	   case 4:
	          //System.exit(1);
			  return;
			// break;
	   default:
	       System.out.println("wrong choice!!!");
		   
      			  
	   }
	    for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   System.out.println(" ");
	}
	}
   public synchronized void begin(Node start)
   {
      Node temp=new Node();
	  Scanner ss=new Scanner(System.in);
	  System.out.println(" Enter data:");
	  temp.data=ss.nextInt();
	  
	  if(start==null)
	  {
	    start.next=temp;
		temp.next=null;
	  }
	  else
	  {
		  System.out.println(" "+start.data);
	    temp.next=start;
		start=temp;
		  System.out.println(" "+start.data);
	  }
	  
   }
   
   public synchronized void end(Node start)
   {
     Node temp,ptr;
	 Scanner ss=new Scanner(System.in);
	 temp=new Node();
	 System.out.println("Enter data:");
	 temp.data=ss.nextInt();
	 if(start.next==null)
	 {
	   start.next=temp;
	   
	 }
	 else if(start==null)
	 {
	    start=temp;
	 }
	 else
	 {
	    ptr=start;
		while(ptr.next!=null)
		{
		  ptr=ptr.next;
		}
		ptr.next=temp;
	 }
    temp.next=null;
   }
   public synchronized void position(Node start)
   {
       Node temp,ptr;
	   Scanner ss=new Scanner(System.in);
	   temp=new Node();
	   System.out.println("Enetr position:");
	   int pos=ss.nextInt();
	   System.out.println("Enter data:");
	   temp.data=ss.nextInt();
	   if(pos==1)
	   {
	      begin(start);
	   }
	   else
	   {
	      ptr=start;
          Node prev=start;		  
		  int i=1;
	      while(i<pos && ptr.next!=null)
		  {
			  prev=ptr;
		     ptr=ptr.next;
			 
			 i++;
		  }
		  temp.next=ptr;
		  prev.next=temp;
	   }
   }
   


}
class Create
{
      public Node createList()
	{
	   byte ch=1,count=0;
	   Node temp,start;
	   Scanner ss=new Scanner(System.in);
	   temp=new Node();
	   System.out.println("Enter data:");
	   temp.data=ss.nextInt();
	   start=temp;
	   do{ 
	   temp.next=new Node();
	   temp=temp.next;
	   System.out.println("Enter data:");
	   temp.data=ss.nextInt();
	    System.out.println("Do you want to create more nodes [1/0]");
	   ch=ss.nextByte();
	   }while(ch!=0);
	   temp.next=null;
	   return start;
	}
	
}

class Display
{
         public  Display(Node start)
		 {
			 Node ptr;
			 ptr=start;
			  for(int i=0;i<72;i++)
	         {
	           System.out.print("*");
	         } 
	           System.out.println("\n\n ");
			 System.out.println("Linked list elements are:");
			 
			 while(ptr!=null)
			 {
				 System.out.print("  "+ptr.data);
				 ptr=ptr.next;
			 }
			  System.out.println("\n\n");
			  for(int i=0;i<72;i++)
	         {
	        System.out.print("*");
	   } 
	  
		 }		 
}




public class List
{
   public static void main(String args[])
   {
        Scanner ss=new Scanner(System.in);
        Create cc=new Create();
		Node start=cc.createList();
		 for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   while(true){
	   System.out.println(" ");
	   System.out.println("\t\t\t\t MENU\n\n\n\n");
	   System.out.println("\t\t1-> To INSERT\n");
	   System.out.println("\t\t2-> To DELETE\n");
	   System.out.println("\t\t3->To DISPLAY\n");
	   System.out.println("\t\t4->Exit\n");
	   System.out.println("Enter choice!!!");
	   int ch=ss.nextInt();
	   switch(ch)
	   {
	    case 1: 
               new Insert(start);
               break;
      /* case 2:
              new Delete(start);
              break;*/
       case 3:
	          
             new Display(start);
              break;
	   case 4:
	           System.exit(0);
			   break;
	   default:
	       System.out.println("wrong choice!!!");
		   break;
      			  
	   }
	    for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   System.out.println(" ");
	   }
   }
}