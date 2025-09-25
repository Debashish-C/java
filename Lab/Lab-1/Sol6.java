import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[1000];

        System.out.println("Enter The Size of The Array:");
        n = Sc.nextInt();
        for (int i = 0; i < n; ++i) {
            arr[i] = Sc.nextInt();
        }

        System.out.println("The Sorted Array is :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; ++j) {
                if (arr[i] < arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
