/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
	public static boolean isPalim(String s)
	{
		int l=s.length();
		for(int i=0;i<l/2+1;i++)
		{
			if (s.charAt(i) != s.charAt(l - i - 1)) {
            return false;
			}
        }
         return true;
	}
    public static void main(String args[] ) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
       	  String s1=br.readLine();
       	  String s2=br.readLine();
       	  String str1=s1.concat(s2);
       	  String str2=s2.concat(s1);
       	  if(isPalim(str1)||isPalim(str2))
       	  System.out.println("YES");
       	  else
       	  System.out.println("NO");
       }
    }
}
