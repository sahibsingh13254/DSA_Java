package Basic_java_code;

public class Factorial {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}