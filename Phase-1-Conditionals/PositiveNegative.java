import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int x= sc.nextInt();
        if(x > 0)
        {
            System.out.println("Number is positive");
        }
        else if (x< 0){
            System.out.println("Number is neagative");
        }
        else{
            System.out.println("Number is 0");
        }

    }
}

