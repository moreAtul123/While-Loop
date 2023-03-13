import java.util.Scanner;

public class evenByWhile {
    public static void main(String[] args) {
        int i, n;
        i = 1;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i<=n) {
            if (i%2==0) {System.out.println(i);
                
            }
            i++;
        }
    }
}
