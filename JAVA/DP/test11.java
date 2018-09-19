import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class test11{
  
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        ArrayList<Integer> l=new ArrayList<Integer>();
        TreeSet<Integer> list=new TreeSet<Integer>(Collections.reverseOrder());
        int temp=0;
        for(int scores_i=0; scores_i < n; scores_i++){
            {
               temp=in.nextInt();
                if(!l.contains(temp))
                l.add(temp);
            }
        }
        list.addAll(l);
        l.clear();
        int m = in.nextInt();
        //int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            temp = in.nextInt();
            if(!l.contains(temp))
			{
				System.out.println(temp+": added ");
                l.add(temp);
			}
        }
     
        
         for(int i:l)
             {
				 System.out.println("i= "+i);
				 if(i>=list.first())
				 {
					 System.out.print("i is greater element: ");
                   System.out.println("1");
				 }
             else if(i<list.last())
			 {
				 System.out.print("i is smallest element: ");
                 System.out.println(list.size()+1);
			 }
			 else{
                list.add(i);          
                System.out.println(list.headSet(i).size()+1);
			    list.remove(i);
			 }
             }
              
           
        
    }  
}
