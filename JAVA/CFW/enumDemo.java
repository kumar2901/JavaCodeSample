import java.util.*;

class enumDemo
{
   public static void main(String args[])
   {
      Vector vv=new Vector();
	  vv.add("java");
	  vv.add("c");
	  vv.add("c++");
	  vv.add("dbms");
	  ArrayList aa=new ArrayList();
	  aa.add("bkjbbgd");
	  aa.add("sjkbgvfb");
	  aa.add("hjogf");
	  aa.add("hjogf");
	  vv.addAll(aa);
	  System.out.println("\n\nusing Enumeration:");
	  Enumeration ee=vv.elements();
	  while(ee.hasMoreElements())
	  {
	    String ss=(String)ee.nextElement();
		System.out.print(ss+" ");
	  }
	  System.out.println("\n\n\n using iterator:");
	  Iterator ii=vv.iterator();
	  while(ii.hasNext())
	  {
		  String ss=(String)ii.next();
		  System.out.print(ss+" ");
	  }
	  System.out.println("\n\n\n using ListIterator in forward direction :");
	  ListIterator ll=vv.listIterator();
	  while(ll.hasNext())
	  {
		  String ss=(String)ll.next();
		  System.out.print(ss+" ");
	  }
	  System.out.println("\n\n\n using ListIterator backward direction:");
	  while(ll.hasPrevious())
	  {
	    String ss=(String)ll.previous();
		  System.out.print(ss+" ");
		  
	  }
   }
}