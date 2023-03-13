package whileLoop;
import java.util.*;
public class printTable {
    public static void main(String[] args) {
        int a , b , c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        a=sc.nextInt();
        b=1;
        while(b<=10){
            c= a * b ;
            System.out.println(a +" * "+ b +" = "+c);
            b++;

        }

    }
}
