public class Suppress {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String a = new String("Hello World");
        String b = new String("Hello World");
    }
}
