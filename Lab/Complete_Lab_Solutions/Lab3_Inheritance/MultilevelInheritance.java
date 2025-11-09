class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human is speaking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();   // From Animal
        human.walk();  // From Mammal
        human.speak(); // From Human
    }
}