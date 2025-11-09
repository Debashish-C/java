public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 19, 24, 31, 46, 53, 68};
        
        System.out.println("Even numbers in the array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}