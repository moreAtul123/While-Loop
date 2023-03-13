package whileLoop;
import java.util.*;
public class printNaturalNumReverse {
    public static void main(String[] args) {
        
    
    int n;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    n=sc.nextInt();
    while(n>0&&n<100){
        System.out.println(n);
        n--;
    }
    } 
}
