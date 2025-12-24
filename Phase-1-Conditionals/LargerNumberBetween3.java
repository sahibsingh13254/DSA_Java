import java.util.Scanner;

public class LargerNumberBetween3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();

        System.out.println("Enter the number2");
        int b = sc.nextInt();

        System.out.println("Enter the number2");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is bigger");
        }
        else if (b >a && b > c){
            System.out.println("B is bigger");
        }
        else {
            System.out.println("C is bigger");
        }


    }
}