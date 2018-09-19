import java.io.*;
import java.util.*;
import java.util.Queue;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {
     public static int minDist(int dist[],boolean sptSet[],int n)
     {
        int min=Integer.MAX_VALUE;
         int pos=-1;
         for(int i=0;i<n;i++)
             {
             if(sptSet[i]==false && dist[i]<=min)
			 {
                 min=dist[i];
                 pos=i;
	         }
         }
         return pos;
     }
    public static void Dijkstra(int g[][],int s,int n)
        {
        boolean sptSet[]=new boolean[n];
        int dist[]=new int[n];
      for(int i=0;i<n;i++)
          {
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
          }
        dist[s]=0;
        for(int c=0;c<n-1;c++)
            {
            int u=minDist(dist,sptSet,n);
			System.out.println("u: "+u);
            sptSet[u]=true;
            for(int v=0;v<n;v++)
                {
                if((!sptSet[v] &&g[u][v]!=0 )&& (dist[u]!=Integer.MAX_VALUE && ((dist[u]+g[u][v])<dist[v])))
                    dist[v]=dist[u]+g[u][v];
            }
        }
		String str="";
        for(int k=0;k<n;k++)
            {
				if(k!=s)
				{
					if(dist[k]!=Integer.MAX_VALUE)
                    str=str+dist[k]+" ";
				   else
				   {
					   int p=-1;
					   str+=p+" ";
				   }
				}
        }
		System.out.println(str.trim());
    }
    public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++)
          {
          String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int g[][]=new int[n][n];
            for(int j=0;j<m;j++)
            {
               s=br.readLine().split(" ");
                int a=Integer.parseInt(s[0]);
                int b=Integer.parseInt(s[1]);
                g[a-1][b-1]=6;
                g[b-1][a-1]=6;

            }
            int src=Integer.parseInt(br.readLine());
			/*for(int i1=0;i1<n;i1++)
			{
				for(int j1=0;j1<n;j1++)
					System.out.print(g[i1][j1]+" ");
				System.out.println();
			}*/
          Dijkstra(g,src-1,n);
         // System.out.println(ans);  
           
        }
    }
}