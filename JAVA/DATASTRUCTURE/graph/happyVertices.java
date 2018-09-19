import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class DFS
{
	Stack<Integer> stack;
	public DFS()
	{
		stack=new Stack<Integer>();
	}
	public int dfs_cal(int adj[][],int source)
	{
		int n=adj[source].length-1;
		int visited[]=new int[n];
		int element,i;
		element=source;
		i=source;
		int c=1,c1=0,c2=0;
		while(!stack.isEmpty())
		{
			element=stack.peek();
			i=element;
			c1=1;
			c2=1;
			while(i<=n)
			{
				if(adj[element][i]==1 && visited[i]==1)
				{
					stack.push(i);
					visited[i]=1;
					i=0;
					c2++;
				}
				
				i++;
			}
			if(c2>c1)
				{c++;}
			stack.pop();
		}
		return c;
	}
}
class happyVertices
{
     public static void main(String args[])throws IOException
	 {
	 	try{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          //System.out.println("Enter")
		  String str=br.readLine();
		  String s[]=str.split(" ");
          int N=Integer.parseInt(s[0]);
          int M=Integer.parseInt(s[1]);
          int adj[][]=new int[N][N];
          for(int i=0;i<M;i++)
          {
			 String str1=br.readLine();
			  String s1[]=str1.split(" ");
          	 int x=Integer.parseInt(s1[0]);
             int y=Integer.parseInt(s1[1]);
              adj[x-1][y-1]=1;
          }
		 /* for(int i=0;i<N;i++)
		  {
			  for(int j=0;j<N;j++)
				  System.out.print(adj[i][j]+" ");
			  System.out.println(" ");
		  }*/
          DFS dfs=new DFS();
         System.out.println( dfs.dfs_cal(adj,0));
	 }catch(Exception ee)
	 {
		 ee.printStackTrace();
		  //System.out.println( " harjh");
	 	return;
	 }
	 }
}