
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass 
{
   public static String d_string(String str,String sub)
   {
	   int len=str.length();
	   if(len<=2)
		   return str;  
	   else if((len==3)&&(!str.equals(sub)))
		   return str;
	   else
	   {
		   str=str.replace(sub,"");
		  return d_string(str,sub);
	   }
	   
	   
   }   
    public static void main(String args[] ) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        while(t-->0)
		{
		  String str=br.readLine();
		  int len=str.length();
	      String res=d_string(str,"abc");	   
			System.out.println(res);
		}
    }
}
