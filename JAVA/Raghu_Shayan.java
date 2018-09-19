import
java.io.InputStresmReader;
java.io.BufferedReader;

class Game
{
	   
	   public  int left(int i)
	   {
		   return (2*i+1);
	   }
	   public  int right(int i)
	   {
		   return 2*i+2;
	   }
	   public void max_heapify(String s[],int i,int size)
	   {
		   int l=left(i);
		   int r=right(i);
		   int largest=-1;
		   int root=Integer.parseInt(s[i]);
		   int leftele=Integer.parseInt(s[l]);
		   //int rightele=Integer.parseInt(s[r]);
		   if((l<size)&&(leftele>root))
		   {
			   largest=l;
		   }
		   else
		   {
			   largest=i;
		   }
		   if((r<size)&&(Integer.parseInt(s[r])>Integer.parseInt(s[largest])))
		   {
			   largest=r;
		   }
		   if(largest!=i)
		   {
			   String temp=s[i];
			   s[i]=s[largest];
			   s[largest]=temp;
			   max_heapify(s,largest,size);
		   }
	   }
	   public  void build_Heap(String s[],int size)
	   {
		   for(int i=size/2-1;i>=0;i--)
		   {
			   max_heapify(s,i,size);
		   }
	   }
	   
	    public static void Heap_sort(String s[])
		{
			int size=s.length();
			build_Heap(s,size);
			for(int i=size-1;i>0;i--)
			{
				String temp=s[0];
				s[0]=s[i];
				s[i]=temp;
				size--;
				max_heapify(s,0,size);
			}
		}
		public static void main(String args[])
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number of test cases:");
			int test=Integer.parseInt(br.readLine());
			while(test-->0)
			{
				System.out.println("Enter maximum limit and maximum number of items:");
				String str1=br.readLine();
				String s1[]=str1.split(" ");
				System.out.,println("Enter dishes that will be given to raghu:");
				String str2=br.readLine();
				String s2[]=str2.split(" ");
				System.out.,println("Enter dishes that will be given to raghu:");
				String str3=br.readLine();
				String s3[]=str3.split(" ");
	            Heap_sort(s2);
                Heap_sort(s3);
                for(int i=0;i<s1.length();i++)
                {
					
				}					
                 
			}
		}
}