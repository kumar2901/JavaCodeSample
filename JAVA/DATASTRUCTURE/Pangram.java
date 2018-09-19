import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {
	
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        String string=ss.next()+ss.nextLine();
		string=string.toLowerCase().replace(" ","");
		char arr[]=string.toCharArray();
        int a[]=new int[26];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=(int)arr[i]-97;
			if(a[j]==0)
			{
				a[j]=1;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(a[i]!=0)
			{
				count++;
			}
		}
		if(count==26)
			System.out.println("pangram");
		else
		{
			System.out.println("not pangram");
		}
    }
}