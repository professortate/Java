class Animal{

    void eat(){
        System.out.println("This animal eats.");
    }

    void sleep(){
        System.out.println("This animal sleep");
    }

}

class Mammel extends Animal {

    void giveBirth(){
        System.out.println("This animal give birth.");
    }
}

class Dog extends Mammel {
    void sound(){
        System.out.println("This animal barks");
    }
}

public class animals {
    public static void main (String args[]){
        Dog dog = new Dog();
        
        dog.eat();
        dog.sleep();

        dog.giveBirth();

        dog.sound();

    }



}