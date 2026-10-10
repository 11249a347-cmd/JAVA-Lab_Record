Aim:
To check whether a given positive integer is an Armstrong Number or not using Java.

Algorithm

1. Start the program.
2. Read an integer input n from the user and copy it to nu.
3. Loop while nu is not zero:
	• Find the last digit: rem = nu % 10.
	• Add the cube of the digit to num.
	• Remove the last digit: nu = nu / 10.
4. Compare the calculated sum num with the original number n.
5. Print "Armstrong Number" if they are equal; otherwise, print "NOT an Armstrong Number".
6. Stop the program.

Source code:
import java.util.Scanner;
public class Armstrong{
public static void main(String[] args) {
int n,nu, num = 0,rem;
Scanner scan = new Scanner(System.in);
System.out.print("Enter any positive number: ");
n = scan.nextInt();
nu = n;
while(nu!=0)
{
rem = nu%10;
num = num+rem*rem*rem;
nu = nu/10;
}
if (num==n)
{
System.out.print("Armstrong Number");
}
else {
System.out.print("NOT an Armstrong Number");
}
scan.close();
}
}
Result:
Conclusion

This program successfully verifies an Armstrong number by splitting it into individual digits, summing their cubes, and comparing the result to the original input.
