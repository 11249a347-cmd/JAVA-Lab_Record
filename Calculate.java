Aim:
To implement a multi-file Java package program by creating a custom Shape package across individual shape files and importing them into a single Calculate driver class.

Algorithm:
1. Start the program.
2. Create individual package files (Square.java, Circle.java, Triangle.java) inside a folder named Shape.
3. Declare package Shape; at the top of each individual shape file with public constructors and methods.
4. Compile the individual package files to generate their respective .class files inside the package directory.
5. Create the main application file (Calculate.java) outside the package folder.
6. Import all files from the package using import Shape.*;.
7. Read user inputs for each shape, instantiate their objects, and call their area and perimeter methods.
8. Stop the program.
  
Source Code:
import Shape.*;
import java.util.*;

class Calculate
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);


System.out.println("Enter the side of the Square: ");
int s = sc.nextInt();
Square sq = new Square(s);
System.out.println("Perimeter of Square is "+sq.perimeter());
System.out.println("Area of Sqaure is "+sq.area());


System.out.println("Enter the radius of the circle: ");
int r = sc.nextInt();
Circle ci = new Circle(s);
System.out.println("Perimeter of Circle is: "+ci.perimeter());
System.out.println("Area of Circle is: "+ci.area());


System.out.println("Enter the Side1 of the Triangle: ");
int s1 = sc.nextInt();
System.out.println("Enter the Side2 of the Triangle: ");
int s2= sc.nextInt();
System.out.println("Enter the Side3 of the Triangle: ");
int s3 = sc.nextInt();
Triangle t = new Triangle(s1, s2, s3);
System.out.println("Perimeter of Triangle is: "+t.perimeter());
System.out.println("Area of Triangle is: "+t.area());
}

}

Output:
Enter the side of the Square:
4
Perimeter of Square is 16
Area of Sqaure is 16
Enter the radius of the circle:
5
Perimeter of Circle is: 25.12
Area of Circle is: 50.24
Enter the Side1 of the Triangle:
3
Enter the Side2 of the Triangle:
4
Enter the Side3 of the Triangle:
5
Perimeter of Triangle is: 12
Area of Triangle is: 2.449489742783178

Result:
he Calculate program was successfully executed. By importing the Shape package, the program correctly handled user inputs to calculate and display the areas and perimeters of the square, circle, and triangle through separate package classes.
