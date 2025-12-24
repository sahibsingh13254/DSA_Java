import java.util.Scanner;

public class TempratureAnalysis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();

        if (a < 10){
            System.out.println("temp is cold");

        }
        else if( a>10 && a< 30)
        {
            System.out.println("warm");

        }
        else {
            System.out.println("Hot");
        }
    }

}
