import java.io.*;
import java.util.*;

public class Lin1 {
    public static int DFS(int g[][],boolean visited[],int src)
        {
        int count=0;
        Stack<Integer> stack=new Stack<Integer>();
		int n=g[src].length;
        visited[src]=true;
        int element=src;
        int i=src;
        stack.push(src);
		//System.out.print(i+" ");
		int sum=0;
        count++;
        while(!stack.isEmpty())
            {
              element=stack.peek();
            i=element;
            while(i<n)
                {
                if(g[element][i]==1 &&visited[i]==false)
                    {
                    stack.push(i);
                    visited[i]=true;
                    element=i;
                    i=0;
                    count++;
                }
                i++;
            }
			sum=sum+count*(count-1);
            stack.pop();
            }
			//System.out.println();
        return sum;
    }
   public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
        int g[][]=new int[N][N];
		int sum=1;
        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            g[a][b]=1;
            g[b][a]=1;
		}
         boolean visited[]=new boolean[N];
		  long result=0;//for singlton node;
        //int n=0;//number of singleton node
            for(int j=0;j<N;j++)
                {
                if(!visited[j])
                    {
                     int sum=DFS(g,visited,j);
				result=result+sum;
               
                     }
            
       System.out.println(result);
       
     //   System.out.println(combinations);

    }
}

 

