import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>= 'A' && c<='Z')
        {
            System.out.println("Upper case");
        }
        else if(c>= 'a' && c<='z')
        {
            System.out.println("lower case");
        }
        else if(c>= '0' && c<='9')
        {
            System.out.println("Digit");
        }
        else {
            System.out.println("special digit");
        }

    }

}
