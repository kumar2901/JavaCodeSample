import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
 {

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
		{
            a[a_i] = in.nextInt();
        }
		System.out.println("Right rotation: ");
        for(int a0 = 0; a0 < n; a0++)
		{
            System.out.print(a[(n+a0-k)%n]+" ");
        }
		System.out.println("\nLeft rotation: ");
		for(int a0 = 0; a0 < n; a0++)
		{
			 k=k%5; 
            System.out.print(a[(k+a0)%n]+" ");
        }
    }
}
