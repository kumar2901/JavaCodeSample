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
	  Enumeration ee=vv.elements();
	  if(ee.hasMoreElements())
	  {
	    String ss=(String)ee.nextElements();
		System.out.print(ss+" ");
	  }
   }
}