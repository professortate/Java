class Animal {
    String animalName = "Dog";

    void displayAnimalName() {
        System.out.println("The name of animal is " + animalName);
    }
}

class Dog extends Animal {
    String dogName = "Johnny";

    void displayDogName() {
        System.out.println("The name of dog is " + dogName);
    }
}

class Babydog extends Dog {  
    String babydogName = "Jimmy";

    void displayBabydogName() {
        System.out.println("The name of baby dog is " + babydogName);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Babydog babydog = new Babydog();

        animal.displayAnimalName();
        dog.displayAnimalName(); // Inherited from Animal
        dog.displayDogName();
        babydog.displayAnimalName(); // Inherited from Dog and Animal
        babydog.displayDogName(); // Inherited from Dog
        babydog.displayBabydogName();
    }
}
