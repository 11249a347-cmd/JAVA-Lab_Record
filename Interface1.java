Aim:
To write a Java program that demonstrates the concept of interfaces and runtime polymorphism using a drawing application.

Algorithm:
1. Start the program.
2. Define an interface named Drawable with an abstract method draw().
3. Create classes Rectangle and Circle that implement the Drawable interface.
4. Instantiate a Circle object using a Drawable interface reference variable in the main method.
5. Invoke the draw() method to execute the shape-specific drawing logic.
6. Stop the program.

Source code:
interface Drawable{
void draw();
}

class Rectangle implements Drawable {
public void draw()
{
System.out.println("Drawing Rectangle");
}
}

class Circle implements Drawable{
public void draw() {
System.out.println("Drawing Circle");
}
}

public class Interface1{
public static void main(String[] args) {
Drawable d = new Circle();
d.draw();
}
}

Output:
Drawing Circle

Result:
The Interface1 program was successfully executed. It effectively demonstrated the use of Java interfaces.
