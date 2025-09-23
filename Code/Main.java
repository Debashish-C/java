class Main {

    public static void main(String a[]) {

        @SuppressWarnings("unused")
        String Test = new String("Hello World");

        for (int i = 0; i < 3; i++) {
            int j = 0;
            for (; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (; j < 3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            int j = 0;
            for (; j < i; j++) {
                System.out.print(" ");
            }
            for (; j < 3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
