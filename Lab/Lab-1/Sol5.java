import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        int n;
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Even Numbers are:");
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");

        }
    }
}
