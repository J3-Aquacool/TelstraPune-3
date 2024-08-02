import java.io.*;
import java.util.Scanner;
public class sum{

    public static int sum1(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
      public static void main(String[] args){
        int a,b,sum;

        // a =10;
        // b=20;
        // sum= a+b;
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the Second number: ");
        b=sc.nextInt();
        sum=sum1(a,b);
        System.out.println("The sum of two number is "+ sum);

      }


}