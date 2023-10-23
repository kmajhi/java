// Base class for Animals
// class inheritance and reusing methods from different classes

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Class representing a Bird
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

// Class representing a Fish
class Fish extends Animal {
    void swim() {
        System.out.println("Fish is swimming");
    }
}

// Class representing a Bat, demonstrating hybrid inheritance
class Bat extends Bird {
    void sleep() {
        System.out.println("Bat is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Bat bat = new Bat();

        bird.eat();
        bird.fly();

        fish.eat();
        fish.swim();

        bat.eat();  // Inheriting eat() from Animal
        bat.fly();  // Inheriting fly() from Bird
        bat.sleep();
    }
}
