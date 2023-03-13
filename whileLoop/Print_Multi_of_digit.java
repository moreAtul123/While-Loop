package whileLoop;
import java.util.Scanner;

public class Print_Multi_of_digit {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,sum,a;
        System.out.println("Enter the digit");
        n=sc.nextInt();
        sum=1;
        while (n>0){
            a=n%10;
            sum=sum*a;
            n=n/10;
        }            System.out.println(sum);

    }           

}


