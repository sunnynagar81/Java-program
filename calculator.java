import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("For addition  1\n For subtraction  2\n For multiplication  3\n For division  4\n");
        int c;
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                c=a+b;
                System.out.println("The addition is:");
                System.out.println(c);
                break;

            case 2:
                c=a-b;
                System.out.println("The subtraction is:");
                System.out.println(c);
                break;

            case 3:
                c=a*b;
                System.out.println("The multiplication is:");
                System.out.println(c);
                break;

            case 4:
                c=a/b;
                System.out.println("The division is:");
                System.out.println(c);
                break;

            default:
                System.out.println("Enter number is invalid.");


        }



    }
}
