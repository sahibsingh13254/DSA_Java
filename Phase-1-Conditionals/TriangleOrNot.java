import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the 1 side");
        int a = sc.nextInt();

        System.out.println("Give the 2 side");
        int b = sc.nextInt();

        System.out.println("Give the 3 side");
        int c = sc.nextInt();

        if ( a+b > c && a+c >b && b+c >a){
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Not a triangle");
        }


    }


}
