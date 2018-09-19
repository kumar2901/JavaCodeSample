import java.io.*;

public class ReverseWord
{
	public static String reverseWord(String str)
	{
		if(str.length()==0||str==null)
			return "";
		int curr=0,start=0;
		str=reverse(str);
		StringBuilder sb=new StringBuilder();
		while(curr<str.length())
		{
			if(str.charAt(curr)!=' ')
			{
				curr++;
			}
			else{
			      if(start!=curr)
				  {
					  sb.append(reverse(str.substring(start,curr))+" ");
					  start=curr;
					  
				  }
                 else
				    {
					  curr++;
                      start++;					  
			        }
		}
	}
	if(start!=curr)
	{
		sb.append(reverse(str.substring(start,curr))+" ");
	}
	   return sb.length()!=0?sb.toString().substring(0,sb.length()-1):"";
	}
	public static String reverse(String s)
	{
		if(s==null||s.length()==0)
		{
			return "";
		}
		int length=s.length(),last=length-1;
		char chars[]=s.toCharArray();
		for(int i=0;i<length/2;i++)
		{
			char c=chars[i];
			chars[i]=chars[last-i];
			chars[last-i]=c;
		}
		return new String(chars);
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String str=br.readLine();
			String ans=reverseWord(str);
			System.out.println(ans);
		}
		
	}
}