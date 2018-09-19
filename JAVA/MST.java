 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MST
{
   int V;
   public  int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
    public void  printMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }

    public void primMST(int graph[][])
    {
        
        int parent[] = new int[V];
        int key[] = new int [V];
        Boolean mstSet[] = new Boolean[V];
		
        for (int i = 0; i < V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
        // Always include first 1st vertex in MST.
        key[0] = 0; 
        parent[0] = -1;
 
        // The MST will have V vertices
        for (int count = 0; count < V-1; count++)
        {
            int u = minKey(key, mstSet);
 
            // Add the picked vertex to the MST Set
            mstSet[u] = true;
            for (int v = 0; v < V; v++)
                if (graph[u][v]!=0 && mstSet[v] == false && graph[u][v] <  key[v])
                {
                    parent[v]  = u;
                    key[v] = graph[u][v];
                }
        }
 
        // print the constructed MST
        printMST(parent, V, graph);
    }
     public static void main(String[] args)
	 {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int g[][]=new int[n][n];
        int g1[][]=new int[n][n];
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++)
		{
            int u = in.nextInt();
            int v = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            // Write Your Code Here
            g[u-1][v-1]=a;
            g[v-1][u-1]=a;
            g1[u-1][v-1]=b;
            g1[v-1][u-1]=b;
        }
		MST mst=new MST();
		mst.V=n;
		mst.printMST(parent,mst.V,g);
    
 
       
    }
}
