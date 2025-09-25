public class Sol10 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You have not provided any argument");
        }

        else {
            for (int i = args.length - 1; i >= 0; --i) {
                System.out.println(args[i]);
            }
        }
    }
}
