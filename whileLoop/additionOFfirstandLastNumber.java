package whileLoop;

import java.util.Scanner;

public class additionOFfirstandLastNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,sum,a,b;
        System.out.println("Enter the digit");
        n=sc.nextInt();
        sum=0;
        a= n % 10;
      b = n;

        while (b>= 10) {
           b /= 10;
           int ab=a+b;
            a=ab-b;
            b=ab-a;

        }
          System.out.println(a+""+b);

    }           
}
