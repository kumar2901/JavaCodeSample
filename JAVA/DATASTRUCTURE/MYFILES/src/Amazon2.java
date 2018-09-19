
import java.util.*;

class Amazon2 {
  public static void main(String args[] ) 
  {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      for (int i = 0; i < n; i++) {
         String str=s.next()+s.nextLine();
         int len=str.length();
         char A[]=str.toCharArray();
         char B[]=new char[len];
         HashSet<String> hs=new HashSet<String>();
         for(int k=0;k<len;k++)
         {
         for(int j=0;j<len;j++)
           {
        	 B[j]=A[(len+j-k)%len];
            }
         String str1=new String(B); 
         hs.add(str1);a
         }
         int size=hs.size();
         System.out.println(size);
      }
     

  }
}
