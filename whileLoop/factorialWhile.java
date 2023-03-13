import java.util.Scanner;

public class factorialWhile{
    public static void main(String[]arg) {
        Scanner sc = new Scanner (System.in);
        int i,n,sum;
        i=1;
        sum=1;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
     while(i<=n){
     
     sum=sum*i;
     i=i+1;
     }
     System.out.println("factorial of n value is"+sum);
     
        
    }
}
    
