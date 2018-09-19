import java.util.*;
import java.util.Scanner;

public class AnagramSolver {
    
    static Dictionary dictionary;
    String temp=" ";
    
    public AnagramSolver(Dictionary d)
    {
        this.dictionary=d;
        
    }
    
    public static   String solve(String s)
    {
        double before = System.currentTimeMillis();
        dictionary.contains(s);
        double after = System.currentTimeMillis();
        if(dictionary.contains(s))
        return s;
        else
        return null;
    }
    
    public static void main (String args[]) throws Exception
    {
        
            Scanner ss=new Scanner(System.in);       
            BinaryDictionary b=new BinaryDictionary(args[1]); // Click here Binary Dictionary code
            AnagramSolver as=new AnagramSolver(b);
			System.out.println("Enter String: ");
			String str =ss.next();
        permute(str);
    }
    
    
    
    public static   void permute( String input)
    {
        System.out.println("Original/Input word is  :" +input);
        int inputLength = input.length();
        boolean[ ] used = new boolean[ inputLength ];
        StringBuffer outputString = new StringBuffer();
        char[ ] in = input.toCharArray( );
        doPermute ( in, outputString, used, inputLength, 0 );
    }
    
    public static    void doPermute ( char[ ] in, StringBuffer outputString,
    boolean[ ] used, int inputLength, int level)
    {
        if( level == inputLength) {
            String temp=solve(outputString.toString());
            if(temp!=null)
            {
                System.out.println("");
                System.out.println("congratulations!!!!    " +temp.toUpperCase()+"  is the word in the                                                                  dictionary");
                
                System.exit(0);
            }
            return;
        }
        
        for( int i = 0; i < inputLength; ++i )
        {
            
            if( used[i] ) continue;
            
            outputString.append( in[i] );
            used[i] = true;
            doPermute( in,   outputString, used, inputLength, level + 1 );
            used[i] = false;
            outputString.setLength(   outputString.length() - 1 );
        }
    }
}