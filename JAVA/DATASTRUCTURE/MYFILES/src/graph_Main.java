import java.util.*;
public class graph_Main
{
	  public static void main(String args[])
	  {
		  Graph g=new Graph();
		  Scanner ss=new Scanner(System.in);
		 System.out.println("Enter number of vertex:");
		 int N=ss.nextInt();
		 for(int i=0;i<N;i++)
		 {
			 System.out.println("Enter label of vertex: ");
			 char ch=ss.next().charAt(0);
			 g.addVertex(ch);
		 }
		 
		   while(true)
		   {
			 System.out.println("Enter edges[-1 -1 to stop]: ");
			int x=ss.nextInt();
			int y=ss.nextInt();
			if(x==-1 &&y==-1)
				break;
			 g.addEdge(x,y);
		   }
    System.out.println("Adjacency matrix:");
          for(int i=0;i<g.vcount;i++)
            {
            for(int j=0;j<g.vcount;j++)
              {
                System.out.print(g.adjMatrix[i][j]+" ");
               }
             System.out.println(" ");
          }
          
		 System.out.println("traverse Edges are using DFS: \n");
		    g.DFS();
		 System.out.println("traverse Edges are using BFS: \n");
		      g.BFS();
		           
	  }

}
