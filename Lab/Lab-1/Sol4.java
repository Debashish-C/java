import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        n = sc.nextInt();

        int ans = 0;

        while (n > 0) {
            ans = (ans * 10) + (n % 10);
            n /= 10;
        }
        System.out.println("The Reverse oF THe Number is " + ans);
    }
}
