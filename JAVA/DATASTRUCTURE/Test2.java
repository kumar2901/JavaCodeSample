import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        String s[]=B.split("010");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println("");
        int ans=(B.length()-s.length-1)/3+1;
        System.out.println(ans);
        
    }
}
