import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char x = sc.next().charAt(0);

        if( x == 'a' || x == 'e' || x== 'i' || x=='o' || x=='u')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Constant");
        }
    }
}
