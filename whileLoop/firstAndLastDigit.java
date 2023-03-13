package whileLoop;

import java.util.Scanner;

public class firstAndLastDigit {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,sum,a,b;
        System.out.println("Enter the digit");
        n=sc.nextInt();
        sum=0;
        b= n % 10;
      a = n;

        while (a>= 10) {
           a /= 10;
          

        }
          System.out.println(a+""+b);

    }           
}


