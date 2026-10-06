Aim:
To write a Java program that demonstrates multiple inheritance by implementing multiple interfaces (Printable and Showable) within a single class.

Algorithm:
1. Start the program.
2. Define two interfaces: Printable with a print() method, and Showable with a show() method.
3. Create a class Interface2 that implements both Printable and Showable.
4. Override and implement both the print() and show() methods inside Interface2.
5. Create an object of Interface2 inside the main method.
6. Invoke both the print() and show() methods using the created object.
7. Stop the program.
  
Source code:
interface Printable{
void print();
}

interface Showable{
void show();
}

class Interface2 implements Printable,Showable{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}

public static void main(String[] args) {
Interface2 obj = new Interface2();
obj.print();
obj.show();
}
}

Output:
Hello
Welcome

Result:
The Interface2 program was successfully executed. It effectively achieved multiple inheritance in Java by implementing multiple interfaces
