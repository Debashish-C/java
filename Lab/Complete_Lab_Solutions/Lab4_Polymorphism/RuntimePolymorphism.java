class AnimalRP {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class DogRP extends AnimalRP {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class CatRP extends AnimalRP {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class CowRP extends AnimalRP {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        AnimalRP myAnimal;
        
        myAnimal = new DogRP();
        myAnimal.makeSound(); // Dog's method
        
        myAnimal = new CatRP();
        myAnimal.makeSound(); // Cat's method
        
        myAnimal = new CowRP();
        myAnimal.makeSound(); // Cow's method
    }
}