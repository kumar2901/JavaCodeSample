import java.io.*;
import java.util.Queue;
import java.util.*;

class isTree
{
     Queue<Integer>queue;
	 boolean Visited[];
	 int v;
	 isTree(int V)
	 {
		 v=V;
		 queue =new LinkedList<Integer>();
		 Visited=new boolean[v];
	 }
	 
	 public void bfs(int g[][],int src)
	 {
		 int i,element;
		 i=src;
		 element=src;
		 Visited[src]=true;
		 queue.add(src);
		 while(!queue.isEmpty())
		 {
			 element=queue.remove();
			 i=element;
			 System.out.print(element+"\t");
			 while(i<v)
			 {
				 if((g[element][i]==1)&&(!Visited[i]))
				 {
					 queue.add(i);
					 Visited[i]=true;
					 
				 }
				 i++;
			 }
			 //queue.pop();
		 }
	 }
	 public int connected_component(int g[][],int src)
	 {
		 int c=0;
		 for(int i=0;i<v;i++)
		 {
			 if(!Visited[i])
			 {
				 c++;
				 System.out.println("Traverse Graph: ")
				 bfs(g,src);
				 System.out.println("");
			 }
		 }
		 return c;
	 }
	 public static void main(String args[])
	 {
		 Scanner ss=new Scanner(System.in);
		 System.out.println("Enter number of vertices: ");
		 int v=ss.nextInt();
		 int g[][]=new int[v][v];
		 int edge=0;
		 isTree tt=new isTree(v);
		 System.out.println("Enter graph: ");
		 for(int i=0;i<v;i++)
		 {
			 for(int j=0;j<v;j++)
			 {
				 System.out.println("if there is edge between "+(i+1)+"--> "+(j+1)+ " [1/0]:  ");
				 g[i][j]=ss.nextInt();
				 if(g[i][j]!=0)
					 edge++;
			 }
		 }
		 if(edge==v-1 &&tt.connected_component(g,0)==1)
				 System.out.println("\nGraph is tree");
	    else
				 System.out.println("\nGraph is not tree");

		 
	 }
     
	 
}