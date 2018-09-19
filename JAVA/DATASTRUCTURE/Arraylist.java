import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  String line = br.readLine();
        int N = Integer.parseInt(br.readLine());
		   
		  String str[N][3]=new String();
	       for(int i=0;i<N;i++)
		   {
			  String string=br.readLine();
			  String s[]=string.split(" ");
			  for(int j=0;j<2;j++)
			  {
				  str[i][j]=s[j];
			  }
			  
		   }
		
         for(int j=0;j<M;j++)
		 {
		    String symbol=br.readLine();
			String sym[]=symbol.split(" ");
           // String s[]=str[j].split("");
             if(sym[0].equals("+"))
             {
				if() 
			 }				 
		 }
		 
    }
}