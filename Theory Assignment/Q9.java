class Book {
    int id;
    String title;
    String author;

    // Overloaded methods
    void addBook(int id) {
        this.id = id;
    }

    void addBook(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void addBook(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + "]";
    }
}

public class Q9 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.addBook(101);
        System.out.println(b1);

        Book b2 = new Book();
        b2.addBook(102, "Java Basics");
        System.out.println(b2);

        Book b3 = new Book();
        b3.addBook(103, "OOP in Java", "Herbert Schildt");
        System.out.println(b3);
    }
}
