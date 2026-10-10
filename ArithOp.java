Aim:
To implement a menu-driven program in Java that continuously performs basic arithmetic operations (addition, subtraction, multiplication, division, and modulus) on two user-input integers using a switch case until the user exits.

Algorithm:
1. Start the program.
2. Enter an infinite loop (while (true)) to display the menu repeatedly.
3. Read two integers (x and y) from the user.
4. Display a menu containing options for Addition, Subtraction, Multiplication, Division, Modulus, and Exit.
5. Read the user's choice (n).
6. Execute the operation matching the choice using a switch statement:
	• Case 1: Compute and print x + y.
	• Case 2: Compute and print x - y.
	• Case 3: Compute and print x * y.
	• Case 4: Compute and print x / y.
	• Case 5: Compute and print x % y.
	• Case 6: Terminate the program using System.exit(0).
7. Repeat or Stop based on the choice executed.

Source code:
import java.util.Scanner;
public class ArithOp {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
while (true)
{
System.out.println(" ");
System.out.println("Enter the two numbers to perform the operations.");
System.out.println("Enter the first number: ");
int x = s.nextInt();
System.out.println("Enter the second number: ");
int y = s.nextInt();
System.out.println("Choose the operation you perform");
System.out.println("1. ADDITION");
System.out.println("2. SUBTRACTION");
System.out.println("3. MULTIPLICATION");
System.out.println("4. DIVISION");
System.out.println("5. MODULUS");
System.out.println("6. EXIT");
int n = s.nextInt();
switch(n)
{
case 1:
int add;
add = x + y;
System.out.println("Result : "+add);
break;

case 2:
int sub;
sub = x-y;
System.out.println("Result: "+sub);
break;

case 3:
int mul;
mul = x*y;
System.out.println("Result: "+mul);
break;

case 4:
int div;
div = x/y;
System.out.println("Result: "+div);
break;

case 5:
int mod;
mod = x%y;
System.out.println("Result: "+mod);
break;

case 6:
System.exit(0);
}
}
}

}

Output:
Enter the two numbers to perform the operations.
Enter the first number: 
12
Enter the second number: 
5
Choose the operation you perform
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result : 17

Result:
This program successfully demonstrates a menu-driven utility for arithmetic processing by leveraging an interactive console loop and conditional switch-case logic.
