interface Printable {
    void print();
}

class BookP implements Printable {
    String title;
    
    public BookP(String title) {
        this.title = title;
    }
    
    @Override
    public void print() {
        System.out.println("Printing Book: " + title);
    }
}

class MagazineP implements Printable {
    String name;
    
    public MagazineP(String name) {
        this.name = name;
    }
    
    @Override
    public void print() {
        System.out.println("Printing Magazine: " + name);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable[] printables = {
            new BookP("Java Programming"),
            new MagazineP("Tech Weekly")
        };
        
        for (Printable p : printables) {
            p.print();
        }
    }
}