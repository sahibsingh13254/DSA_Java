import java.util.Scanner;

public class DivisibleBy5_3 {
    public static void main(String[] args){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if( x%3==0 && x%5==0){
            System.out.println("divisble by 5 & 3");

        }
        else {
            System.out.println("not divisible");
        }

    }
}
