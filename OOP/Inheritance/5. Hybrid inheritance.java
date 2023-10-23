// a combination of both class inheritance and interface implementation
// Interface for Swimming ability
interface Swimmer {
    void swim();
}

// Interface for Flying ability
interface Flyer {
    void fly();
}

// Base class for Animals
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Class representing a Bird
class Bird extends Animal implements Flyer {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Class representing a Fish
class Fish extends Animal implements Swimmer {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Class representing a Bat, demonstrating multiple inheritance
class Bat implements Flyer, Swimmer {
    public void fly() {
        System.out.println("Bat is flying");
    }

    public void swim() {
        System.out.println("Bat is swimming");
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

        bat.fly();
        bat.swim();
    }
}
