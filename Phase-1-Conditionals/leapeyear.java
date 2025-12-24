import java.util.Scanner;

public class leapeyear {
    public static void main(String[] args){
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%400==0 || (x%4==0 && x%100 !=0))
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
