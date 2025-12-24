import java.util.Scanner;

public class largerNumberBetween2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();

        System.out.println("Enter the number2");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("A is bigger");
        }
        else {
            System.out.println("B is bigger");
        }



    }
}
