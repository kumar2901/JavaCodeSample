
import java.util.*;
import java.text.*;

public class MySolution {
    public static Double round(double val)
        {
          DecimalFormat ff=new DecimalFormat("#.##");
            return Double.parseDouble(ff.format(val));
         }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        double stma[]=new double[n-300+1];
        double ltma[]=new double[n-300+1];
        
        for(int p_i=0; p_i < n; p_i++)
        {
            p[p_i] = in.nextInt();
        }
        for(int i=0;i<=n-300;i++)
            {
            double avg=0;
            for(int j=0;j<60;j++)
                {
                avg+=p[i+299-j];
            }
            stma[i]=avg/60;
            avg=0;
            for(int j=0;j<300;j++)
                {
                avg+=p[i+299-j];
            }
            ltma[i]=avg/300;
        }
       for(int i=1;i<=n-300;i++)
            {
                if(stma[i-1] > ltma[i-1] && stma[i]<=ltma[i])
                    {
                    System.out.println((i+300)+" "+round(stma[i])+" "+round(ltma[i]));
                }
                if(stma[i-1]<ltma[i-1] && stma[i]>=ltma[i])
                  System.out.println((i+300)+" "+round(stma[i])+" "+round(ltma[i]));
              if(stma[i-1]==ltma[i-1] && stma[i]!=ltma[i])
                  System.out.println((300+i)+" "+round(stma[i])+" "+round(ltma[i]));
            }
        
        in.close();
    }
}
