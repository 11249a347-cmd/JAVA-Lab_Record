Aim:
To write a Java program that demonstrates multilevel inheritance by creating a chain of child classes extending from sequential parent classes.
  
Algorithm:
1. Start the program.
2. Define a base class Animal containing a generic method eat().
3. Create a subclass Dog that extends Animal and adds a specific method bark().
4. Create another subclass BabyDog that extends Dog and adds a specific method weep().
5. Instantiate a BabyDog object within the main method.
6. Invoke all three methods (weep(), bark(), and eat()) using the BabyDog instance to show inherited behaviors down the chain.
7. Stop the program.

  
Source code:
class Animal {
void eat()
{
System.out.println("eating...");
}
}
class Dog extends Animal {
void bark() {
System.out.println("barking...");
}
}
class BabyDog extends Dog {
void weep() {
System.out.println("weeping...");
}
}

class MultilevelInheritance{
public static void main(String[] args) {
BabyDog d = new BabyDog();
d.weep();
d.bark();
d.eat();
}
}

Output:
weeping...
barking...
eating...

Result:
The MultilevelInheritance program was successfully executed. It effectively demonstrated multilevel inheritance in Java
