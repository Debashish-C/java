class LimitedObject {
    static int count = 0;
    static final int LIMIT = 3;

    LimitedObject() {
        if (count < LIMIT) {
            count++;
            System.out.println("Object created. Count: " + count);
        } else {
            System.out.println("Object limit reached! Cannot create more.");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        new LimitedObject();
        new LimitedObject();
        new LimitedObject();
        new LimitedObject(); // This one won’t be created
    }
}
