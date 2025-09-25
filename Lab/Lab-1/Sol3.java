import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter Three Number:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("The greater number is " + a);
            } else {
                System.out.println("The greater number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The greater number is " + b);
            } else {
                System.out.println("The greater number is " + c);
            }
        }

    }
}
