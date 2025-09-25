// solution for question no. 2
public class Sol2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please Give Some Inputs");
        }
        int n = Integer.parseInt(args[0]);
        System.out.println("The Multiplication Table for the " + n);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "*" + n + " = " + n * i);
        }
    }
}
