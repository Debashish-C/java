class BookTS {
    String title;
    String author;
    double price;
    
    public BookTS(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
    }
}

public class ToStringOverride {
    public static void main(String[] args) {
        BookTS book = new BookTS("Java Programming", "John Doe", 45.99);
        System.out.println(book); // Automatically calls toString()
        System.out.println(book.toString()); // Explicit call
    }
}