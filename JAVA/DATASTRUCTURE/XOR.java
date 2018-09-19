import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class XOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int i = 0; i < Q; i++){
            int L = in.nextInt();
            int R = in.nextInt();
            int A[]=new int[R+1];
            A[0]=0;
            int sum=0;
            for(int j=L;j<=R;j++)
                {
                if(j%4==0)
                    {
                     sum=sum^j;
                    }
              if(j%4==1)
                    {
                      sum=sum^1;
                    }
               if(j%4==2)
                    {
                     sum=sum^(j+1);
					}
               if(j%4==3)
                        {
                         sum=sum^0;
                        }
                }
            System.out.println(sum);
        }
    }
}
