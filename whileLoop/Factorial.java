package whileLoop;
import java.util.Scanner;

public class Factorial {
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int n,sum,a;
            System.out.println("Enter the digit");
            n=sc.nextInt();
            a=1;
            while (a>0 && a<=n){
                if(a<n){
                    System.out.println(a);
                }a++;
            }                    
                
    
        }           
    
    }
    
    
    
    
