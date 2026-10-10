Aim:
To generate and display the Fibonacci series up to n terms using a loop in Java
  
Algorithm:
1. Start the program.
2. Read the number of terms n from the user.
3. Check base cases: If n is 0 or 1, print the respective initial terms.
4. Generate series for \(n \ge 2\):
	• Print the first two terms (0 and 1).
	• Run a loop from 2 to n - 1.
	• Calculate the next term by adding the previous two terms (a + b).
	• Update the previous terms for the next iteration.
5. Stop the program.
  
Source code:
import java.util.Scanner;
public class FibonacciSeries{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of n:");
int n = s.nextInt();
fibonacci(n);
s.close();
}

public static void fibonacci(int n) {
if (n==0) {
System.out.println("0");
}
else if (n==1) {
System.out.println("0 ");
}

else {
System.out.print("0 1 ");
int a = 0;
int b = 1;
for (int i=2; i<n; i++) {
int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}

Output:
Enter the value of n:2
0 1 1
