package whileLoop;

import java.util.Scanner;

public class SumofOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,sum,a,i;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        sum= 0;
        i=1;
        while(i<=n){
            
sum +=i;
                i+=2;
                

            }System.out.println(sum);


        }
    }

