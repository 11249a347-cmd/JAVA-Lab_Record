Aim:
To determine whether a user-specified calendar year is a Leap Year or not using nested conditional logic in Java
  
Algorithm:
1. Start the program.
2. Read an integer input year from the user and initialize a boolean variable flag to false.
3. Evaluate the leap year conditions sequentially:
	• If year is divisible by 400 (year % 400 == 0), set flag = true.
	• Else if year is divisible by 100 (year % 100 == 0), set flag = false.
	• Else if year is divisible by 4 (year % 4 == 0), set flag = true.
	• Otherwise, set flag = false.
4. Check the value of flag:
	• If true, print "Year [year] is a Leap Year".
	• If false, print "Year [year] is NOT a Leap Year".
5. Stop the program.
  
Source code:
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter any year: ");
int year = s.nextInt();
boolean flag = false;
if(year%400==0)
{
flag = true;
}
else if (year%100==0)
{
flag = false;
}
else if (year%4 ==0)
{
flag = true;
}
else
{
flag = false;
}
if (flag)
{
System.out.println("Year " + year+ " is a Leap Year");
}
else
{
System.out.println("Year "+year+" is NOT a Leap Year");
}}}

Output:
Enter any year: 
2000
Year 2000 is a Leap Year

Enter any year: 
2024
Year 2024 is a Leap Year

Result:
This program successfully implements standard Gregorian calendar rules by handling edge cases for century years to accurately filter and identify leap years.
