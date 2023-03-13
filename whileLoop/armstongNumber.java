package whileLoop;

import java.util.Scanner;

public class armstongNumber {
    public static void main(String[] args) {
        int num,originalNum,remainder,result=0,n=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value");
        num=sc.nextInt();
        originalNum=num;
        while (originalNum!=0){
            originalNum/=10;
            ++n;

        }originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum%10;
            result+=Math.pow(remainder,n);
            originalNum /=10;
            
        }
        if(result==num){
            System.out.println(num);
    
        }else {
            System.out.println("not");
        }
    }
}
