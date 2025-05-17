package day19;
//Abstract class

abstract class Animal {
 abstract void makeSound(); // Abstract method (does not have a body)

 // Concrete method
 void sleep() {
     System.out.println("Sleeping...");
 }
}

//Subclass (inherits from Animal)
class Dog extends Animal {
 // Implementation of abstract method
 @Override
 void makeSound() {
     System.out.println("Woof! Woof!");
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     Animal myDog = new Dog();
     myDog.makeSound(); // Calls the implemented method in Dog class
     myDog.sleep(); // Calls the concrete method from Animal class
 }
}
