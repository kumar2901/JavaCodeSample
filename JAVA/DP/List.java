import java.util.*:

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
	   System.out.println(" ");
	   System.out.println("\t\t\t\t INSERT MENU\n\n\n\n");
	   System.out.println("\t\t1-> To insert at beginning\n");
	   System.out.println("\t\t2-> To insert at end\n");
	   System.out.println("\t\t3->To insert at any position\n");
	   System.out.println("\t\t4->back to main menu")
	   int ch;
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
	          System.exit(0);
			 break;
	   default:
	       System.out.println("wrong choice!!!");
		   
      			  
	   }
	    for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   System.out.println(" ");
	}
   public void begin(Node start)
   {
      Node temp=new Node();
	  Scanner ss=new Scanner(System.in);
	  System.out.println(" Enter data:");
	  temp.data=ss.nextInt();
	  
	  if(start==null)
	  {
	    sart=temp;
		temp.next=null;
	  }
	  else
	  {
	    temp.next=start.next;
		start=temp;
	  }
	  
   }
   
   public void end(Node start)
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
   public void position(Node node)
   {
       Node temp,ptr;
	   Scanner ss=new Scanner(System.in);
	   temp=new Node();
	   System.out,println("Enetr position:");
	   int pos=ss.nextInt();
	   System.out.println("Enter data:");
	   temp.data=ss.nextInt();
	   if(pos==1)
	   {
	      begin(start);
	   }
	   else
	   {
	      ptr=start.next; 
		  int i=1;
	      while(i<pos)
		  {
		     ptr=ptr.next;
			 i++;
		  }
		  temp.next=ptr.next;
		  ptr.next=temp;
	   }
   }
   


}
class Create
{
      public Node createList()
	{
	   byte ch=1;
	   Node temp,start;
	   Scanner ss=new Scanner(System.in);
	   temp=new Node();
	   
	   System.out.println("Enter data: ");
	   temp.data=ss.nextInt();
	   start=temp;
	   do{
	   System.out.println("Do you want to create more nodes [1/0]")
	   ch=ss.nextInt();
	   temp.next=new Node();
	   temp=temp.next;
	   System.out.println("Enter data:");
	   temp.data=ss.nextInt();
	   }while(ch!=0)
	   temp.next=null;
	   return start;
	}
	
}

public class List
{
   public static void main(String args[])
   {
        Scanner ss=new Scanner(System.in);
        Create cc=new Create();
		Node start=cc.create();
		 for(int i=0;i<72;i++)
	   {
	      System.out.print("*");
	   }
	   System.out.println(" ");
	   System.out.println("\t\t\t\t MENU\n\n\n\n");
	   System.out.println("\t\t1-> To INSERT\n");
	   System.out.println("\t\t2-> To DELETE\n");
	   System.out.println("\t\t3->To DISPLAY\n");
	   System.out.println("\t\t4->Exit\n");
	   //System.out.println("\t\t4->back to main menu")
	   int ch;
	   switch(ch)
	   {
	    case 1: 
               new Insert(start);
               break;
      /* case 2:
              new Delete(start);
              break;
       case 3:
	          
              Display(start);
              break;*/
	   case 4:
	           System.exit(0);
			   break;
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