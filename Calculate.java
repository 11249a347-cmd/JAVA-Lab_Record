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