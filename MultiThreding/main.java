/*Develop an abstract class named animal with attributes for name and age.
 Include abstract methods makeSound() and move().Create two classes ,mammal 
 and bird, extending animal. Implement the abstract methods to represent the
sound and movement of each category of animals. Ensure that the bird has an 
additional method fly() to display flying behaviour. */

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    abstract void move();
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Mammal sound: Roar");
    }

    @Override
    void move() {
        System.out.println("Mammal movement: Walk");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird sound: Chirp");
    }

    @Override
    void move() {
        System.out.println("Bird movement: Hop");
    }

    void fly() {
        System.out.println("Bird is flying");
    }
} 

public class main {
    public static void main(String[] args) {
        Mammal mammalObj = new Mammal("Lion", 5);
        Bird birdObj = new Bird("Sparrow", 2);

        System.out.println(mammalObj.name + " (" + mammalObj.age + " years old): ");
        mammalObj.makeSound();
        mammalObj.move();

        System.out.println(birdObj.name + " (" + birdObj.age + " years old): ");
        birdObj.makeSound();
        birdObj.move();
        birdObj.fly();
    }
}
