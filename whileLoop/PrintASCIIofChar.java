package whileLoop;

public class PrintASCIIofChar {
    public static void main(String[] args) {
        int i;
        i=65;
        while (i<=90){
System.out.println("The ASCII value of "+ (char) i +" is "+ i);
i++;
        }
        int j;
        j=97;
        while (j<122) {
            System.out.println("The ASCII value of " + (char) j+ " is " + j);
            j++;
        }
        
    }
}