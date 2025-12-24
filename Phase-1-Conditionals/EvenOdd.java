import java.awt.*;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if( x % 2 ==0){
            System.out.println("The Number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }

}
