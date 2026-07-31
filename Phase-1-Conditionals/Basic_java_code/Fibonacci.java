package Basic_java_code;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number you want fibonacci of");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i =0; i< number; i++) {
            System.out.println(fibonacci(i));

        }
    }
    public static int fibonacci(int number){
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) +fibonacci(number - 2);
    }
}
