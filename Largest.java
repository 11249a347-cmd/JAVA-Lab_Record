Aim:
To find and print the largest of three integers entered by the user using relational and logical operators in Java.

Algorithm:
1. Start the program.
2. Read three integer inputs (x, y, and z) from the user.
3. Compare the values using conditional statements:
	• If x > y and x > z, print "First number is largest".
	• Else if y > x and y > z, print "Second number is largest".
	• Else if z > x and z > y, print "Third number is largest".
	• Otherwise, print "The numbers are not distinct".
4. Stop the program
  
Source code:
import java.util.Scanner;
public class Largest{
public static void main(String[]args) {
int x, y, z;
System.out.println("Enter the integers");
Scanner s = new Scanner(System.in);
x = s.nextInt();
y = s.nextInt();
z = s.nextInt();
if(x>y && x>z)
System.out.println("First number is largest");
else if(y>x && y>z)
System.out.println("Second number is largest");
else if (z>x && z>y)
System.out.println("Third number is largest");
else
System.out.println("The numbers are not distinct");
}
}

Output:
Enter the integers
15
42
23
Second number is largest

Result:
This program successfully identifies the maximum value among three integers by utilizing nested conditional statements and logical && (AND) operations to ensure a distinct winner.
