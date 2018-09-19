import java.util.*;

class X 
{
  int size;
  int n;
public int getVal()
{
 return size;
}
}
class MyComparator implements Comparator<X>
{
   public int compare(X x1,X x2)
{
   if(x1.getVal()>x2.getVal())
    return -1;
    else
   return 1;
}
}
public class Demo1
{
     public static void main(String args[])
	 {
	    
	 TreeSet<X>list=new TreeSet<X>(new MyComparator());
        for(int i=0;i<10;i++)
        {
           X x=new X();
           x.size=10+i;
           x.n=10-i;
           list.add(x);
        }  
	 for(X x:list)
         System.out.println(x.size+" "+x.n);		
	 }
}