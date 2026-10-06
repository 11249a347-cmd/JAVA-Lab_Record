Aim:
To write a Java program that demonstrates single inheritance by extending a subclass from a single superclass.

Algorithm:
1. Start the program.
2. Define a base class Animal with a variable name and a method eat().
3. Create a subclass Dog that extends Animal and includes a specific method bark().
4. Instantiate a Dog object in the main method.
5. Assign a value to the inherited name variable using the object.
6. Invoke both the inherited eat() method and the subclass-specific bark() method.
7. Stop the program.

Source code:
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        
        myDog.eat();
        myDog.bark();
    }
}

Output:
Buddy is eating.
Buddy is barking.

Result:
 The Inheritance program was successfully executed. It effectively demonstrated single inheritance in Java   
