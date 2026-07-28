package Basic_java_code;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input  = sc.nextLine();


        System.out.println(stringReverse(input));

    }
    public static String stringReverse(String input){
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left ++; right --;
        }
        return new String(chars);

    }
}
