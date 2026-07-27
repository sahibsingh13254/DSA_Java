package Basic_java_code;

import java.util.Scanner;

public class Pailondrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input  = sc.nextInt();

        if(palindromeCheck(input)){
            System.out.println("Pailondrome");
        }
        else {
            System.out.println("Not pailondrome");
        }
    }
    public static boolean palindromeCheck(int input){

        int reverse = 0;
        int original = input;

        while (input > 0 ){
            int last_digit = input % 10;
            reverse = reverse * 10 + last_digit;
            input = input / 10;

        }
        return reverse == original;
    }
}
