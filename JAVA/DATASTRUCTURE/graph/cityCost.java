import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cityCost {
   public static int dfs(int adjacency_matrix[][], int source,boolean visited[])
    {
        int number_of_nodes = adjacency_matrix[source].length;
        Stack<Integer> stack=new Stack<Integer>();
      //  int visited[] = new int[number_of_nodes + 1];		
        int element = source;		
        int i = source;
		int count=0;
        if(visited[source]==false)	
		{			
           count=count+1;
			visited[source] = true;	
           stack.push(source);			
		}
        else	 
            return count;
        
        while (!stack.isEmpty())
        {
			
            element = stack.peek();
			//predecessor[count]=element;
            i = element;	
	    while (i < number_of_nodes)
	    {
             
     	        if (adjacency_matrix[element][i] == 1 && visited[i] == false)
	            {
			        
                    stack.push(i);
                    visited[i] = true;
                    element = i;
                    i = 1;
                    count++;
	           
                }
                i++;
	    }
            stack.pop();
	   }
	 return count;
  }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int g[][]=new int[n][n];
            for(int a1 = 0; a1 < m; a1++){
                int u = in.nextInt();
                int v = in.nextInt();
                g[u-1][v-1]=1;
                g[v-1][u-1]=1;

            }
            long cost=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					System.out.print(g[i][j]+" ");
				System.out.println("");
			}
            if(x<=y)
                {
                cost=n*x;
				System.out.println(cost);
            }
            else
             {
			    //int prev=0;
				int count=0;
				boolean visited[]=new boolean[n];
				for(int i=0;i<n;i++)
				{
				count=dfs(g,i,visited);
				System.out.println("count: "+count);
				System.out.println("visited:" );
				for(int j=0;j<n;j++)
				{
					if(visited[j]==true)
						System.out.print("1 ");
					else
                       System.out.print("0 ");
						
				}
				System.out.println();
				if(count==1)
					cost+=x;
				if(count>1)
				cost=cost+(count-1)*y+x;
				}
				System.out.println(cost);
			 }
			 
        }
    }
}
