import java.util.*;

public class vectorDemo
{
    
	 public static void main(String args[])
	 {
	     Vector v=new Vector();
		 int size=v.size();
		 System.out.println("Size of vector is: "+size);
		 v.add("rajesh");
		 v.add("kumar ");
		 v.add("saw");
		 v.add("10th");
		 v.add("marks ");
		 v.add("matters");
		 v.add(" a");
		 v.add("lot");
		 v.add("so");
		 v.add("you ");
		 v.add("are");
		 v.add("fucked up");
		 size=v.size();
		 System.out.println("Size of vector is: "+size);
		 v.remove(3);
		 v.remove("fucked up");
		 v.remove("are");
		 v.add("must");
		 v.add("try Hard!!!");
		 size=v.size();
		 System.out.println("Size of vector is: "+size);
		 ArrayList aa=new ArrayList();
		 size=aa.size();
		 System.out.println("Size of arrayList is: "+size);
		 aa.add("your");
		 aa.add("dream");
		 aa.add("is");
		 aa.add("to");
		 aa.add("become");
		 aa.add("a");
		 aa.add("Developer");
		 aa.add("so  be developer!!!");
		 aa.add("All the best!!!");
		 size=aa.size();
		 System.out.println("Size of arrayList is: "+size);
		 v.addAll(aa);
		 size=aa.size();
		 System.out.println("Size of vector is: "+size);
		 //for(Object oo:v)
		 System.out.print(v+" ");
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}