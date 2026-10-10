Aim:
To check whether a given integer is even or odd using a switch statement in Java

Algorithm:
1. Start the program.
2. Read an integer input n from the user.
3. Evaluate the remainder of the number when divided by 2 (n % 2) inside a switch expression.
4. Execute the matching case:
	• Case 0: Print "This number is even" and break.
	• Case 1: Print "This number is odd" and break.
5. Stop the program.

Source code:
import java.util.*;
public class EvenOdd {
public static void main(String[] args) {
int n, i;
Scanner s = new Scanner(System.in);
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println("This number is even");
break;

case 1:
System.out.println("This number is odd");
break;
}
}
}

Output:
14
This number is even

Result:
This program successfully determines the parity of a number by applying modular arithmetic within conditional switch-case logic instead of using traditional if-else blocks.
