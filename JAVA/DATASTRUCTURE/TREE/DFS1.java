 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;
class Vertex
{
	boolean visited;
	public Vertex()
	{
		visited=false;
	}
}
class Graph
{
	boolean adjMatrix[][];
	Stack stack;
	Vertex vList[];
	int N,M;
	 Graph(int n,int m)
	 {
		 this.N=N;
		 this.M=M;
	 	adjMatrix=new boolean[N][M];
	 	vList=new Vertex[N];
	 	stack=new Stack();
	 }
	 public void addEdges(int x,int y)
	 {
	 	adjMatrix[x][y]=true;
	 }
	 public int get_vertex(int v)
	 {
	 	for(int j=0;j<M;j++)
	 	{
	 		if(adjMatrix[v][j]==true&&vList[j].visited==false)
	  		return j;
	 		
	 		
	 	}
		return -1;
	 }
	public void dfs()
	{
	  vList[0].visited=true;
	  stack.push(0);
	  while(!stack.isEmpty())
	  {
	  	int temp=(int)stack.peek();
	  	int v=get_vertex(temp);
	  	if(v==-1)
	  	{
	  		stack.pop();
	  	}
	  	else
	  	{
	  		vList[v].visited=true;
	  		stack.push(v);
	  	}
	  }
	  for(int j=0;j<N;j++)
	  {
	  	vList[j].visited=false;
	  }
		
	}
}


class TestClass
 {
    public static void main(String args[] ) throws Exception 
	{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
         Graph g=new Graph(N,M);
      
        	for(int j=0;j<M;j++)
        	{
        	int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
               g.addEdges(x,y);
        	}
        

      
    }
}