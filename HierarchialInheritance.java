Aim:
To write a Java program that demonstrates hierarchical inheritance by extending multiple subclasses from a single common superclass.
  
Algorithm:
1. Start the program.
2. Define a base class Animal containing a generic method eat().
3. Create two subclasses, Dog and Cat, that both independently extend Animal.
4. Instantiate both Cat and Dog objects within the main method.
5. Invoke their specific methods (meow() and bark()) along with the inherited eat() method.
6. Stop the program.

Source code:
class Animal {
void eat() {
System.out.println("eating...");
}
}

class Dog extends Animal{
void bark() {
System.out.println("Barking....");
}
}

class Cat extends Animal{
void meow() {
System.out.println("Meowing...");
}
}

class HierarchialInheritance {
public static void main (String[] args) {
Cat c = new Cat();
c.meow();
c.eat();
Dog d = new Dog();
d.bark();
d.eat();
}
}

Output:
Meowing...
eating...
Barking....
eating...

Result:
The HierarchialInheritance program was successfully executed. It effectively demonstrated hierarchical inheritance in Java
