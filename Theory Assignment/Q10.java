class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    void compare(Product p) {
        System.out.println("General product comparison.");
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(String name, int warranty) {
        super(name);
        this.warranty = warranty;
    }

    @Override
    void compare(Product p) {
        if (p instanceof Electronics) {
            Electronics e = (Electronics) p;
            System.out.println(name + " vs " + e.name);
            System.out.println(warranty == e.warranty
                ? "Same warranty period."
                : "Different warranty periods.");
        }
    }
}

class Grocery extends Product {
    double weight;

    Grocery(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    void compare(Product p) {
        if (p instanceof Grocery) {
            Grocery g = (Grocery) p;
            System.out.println(name + " vs " + g.name);
            System.out.println(weight == g.weight
                ? "Same weight."
                : "Different weights.");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Product e1 = new Electronics("Laptop", 2);
        Product e2 = new Electronics("Tablet", 1);
        e1.compare(e2);

        Product g1 = new Grocery("Rice", 5.0);
        Product g2 = new Grocery("Wheat", 5.0);
        g1.compare(g2);
    }
}
