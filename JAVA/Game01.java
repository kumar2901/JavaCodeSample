import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
			boolean b[]=new boolean[n];
			int a[]=new int[n];
            for(int i=0;i<n;i++)
                {
                a[i]=in.nextInt();
                
           
            }
            
            int count=0;
            String winner="";
			int i=1;
            while(i<n-1 &&i>0)
                {
					int j=i+1;
					while(b[j])
					{
						j++;
					}
					int k=i-1;
					while(b[k])
					{
						k--;
					}
                  if((a[k]==0)&&(a[k]==a[j] && (!b[i])))
                      {  
                      b[i]=true;
					  //sb.deleteCharAt(i); 
                      count++;
                      i--;
					 // System.out.println(sb.charAt(i));
					  if(i==0)
						  i=1;
                  }
				  else
					  i++;
               
                    
                }
          
            if((count%2)!=0)
                winner="Alice";
            else
                winner="Bob";
            System.out.println(winner);
                
        }
    }
}
