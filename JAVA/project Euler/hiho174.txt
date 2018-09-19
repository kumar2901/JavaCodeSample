import java.util.Scanner;
public class hiho174 {
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner( System.in );
    int k, t;
    int n = scan.nextInt();
    scan.nextLine();
    while(n > 0){
        n--;
        k = scan.nextInt() + 4;
        t = k / 4;
        System.out.println(t - 2);
    }
    scan.close();
}
}