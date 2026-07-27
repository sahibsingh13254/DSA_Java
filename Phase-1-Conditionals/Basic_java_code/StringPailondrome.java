package Basic_java_code;

import java.util.Scanner;

public class StringPailondrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();

        if (stringPailondrome(input)) {
            System.out.println("Pailondrome");
        } else {
            System.out.println("No");

        }
    }

    public static boolean stringPailondrome(String input)
    {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while(left < right)
        {
            if( input.charAt(left) != input.charAt(right) )
            {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }

}
