import java.util.Scanner;

public class factorialBYwhile {
    public static void main(String[] args) {
        int i,n,sum=1;
        Scanner sc = new Scanner(System.in);
        i = 1;
        System.out.println("enter the num");
        n= sc.nextInt();
        while (i<=n) 
        {
            sum=sum*i;
            i++;
            System.out.println("sum is   "+sum);
        }
    }
}