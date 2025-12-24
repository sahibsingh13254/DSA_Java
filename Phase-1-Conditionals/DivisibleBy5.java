import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args)
    {
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ( x%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible");
        }

    }
}
