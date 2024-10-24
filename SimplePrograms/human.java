/*  18.	Design two interfaces, Walkable and Swimmable, 
and a class Human that implements both interfaces. Illustrate 
how a class can implement multiple interfaces.*/

interface Walkable {
    void walk();
   
}

interface Swimmable {
     void swim();
}

class Human implements Walkable ,Swimmable {

//@Override
public void walk(){
    System.out.println("This guy can walk.");
}
//@Override
public void swim(){
    System.out.println("This guy can swim.");
}

}

public class human {
    public static void main (String args[]){
        Human person = new Human();
        person.walk();
        person.swim();
    }
}