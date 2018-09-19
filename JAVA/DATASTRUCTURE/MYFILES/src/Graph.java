import java.util.*;
import java.util.Stack;
import java.util.Queue;


public class Graph 
{
        public final int  maxV=20;
        int vcount;
        Vertex vList[];
        int adjMatrix[][];
        Stack stack;
        Queue queue;
        public Graph()
        {
        	vList=new Vertex[maxV];
        	vcount=0;
            adjMatrix=new int[maxV][maxV];
            stack=new Stack();
            queue=new LinkedList();
        }
        public void addVertex(char lab)
        {
        	vList[vcount++]=new Vertex(lab);
        	
        }
        public void addEdge(int i,int j)
        {
            adjMatrix[i][j]=1;
            adjMatrix[j][i]=1;
            
        }
        public void display(int v)
        {
        	System.out.print(vList[v].label+" ");
        }
        public int get_adjVertex(int v)
        {
        	for(int j=0;j<vcount;j++)
        		if(adjMatrix[v][j]==1&&vList[j].visited==false)
        			return j;
        	return -1;
        }
        public void DFS()
        {
        	vList[0].visited=true;
        	display(0);
        	stack.push(0);
        	while(!stack.isEmpty())
        	{
        		int t=(int)stack.peek();
        		int v=get_adjVertex(t);
        		//int v2=0;
        		if(v==-1)
                        {
                              stack.pop();
                             

        			
                         }
        		else
        		{
        			vList[v].visited=true;
        			display(v);
                             // System.out.println("pushed element:"+vList[v].label); 
        			stack.push(v);
        		}
        		
        	}
           for(int j=0;j<vcount;j++)
        		{
        			vList[j].visited=false;
         		}
        }
        public void BFS()
        {
             for(int j=0;j<vcount;j++)
        		{
        			vList[j].visited=false;
         		}
        	vList[0].visited=true;
        	display(0);
        	queue.add(0);
                int v;
        	while(!queue.isEmpty())
        	{
        		int t=(int)queue.remove();
        		
        		while(( v=get_adjVertex(t))!=-1)
        		{
        			vList[v].visited=true;
        			display(v);
        			queue.add(v);
                               // v=get_adjVertex(t);
        		}
        	}
        	for(int i=0;i<vcount;i++)
        	{
        		vList[i].visited=false;
        	}
        	
        }
}
