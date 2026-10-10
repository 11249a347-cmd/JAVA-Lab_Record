Aim:
To read the names and subject marks of a group of students and display the records of those who scored 60 marks or above in Java.
  
Algorithm:
1. Start the program.
2. Initialize an integer array marks[] of size 6 and a String array name[] of size 30.
3. Loop 6 times (i from 0 to 5) to collect input data:
	• Prompt the user for a student's name and their corresponding subject marks.
	• Store the inputs into name[i] and marks[i] respectively.
4. Iterate through the collected data using another for loop:
	• Check if the current student's mark (marks[i]) is greater than or equal to 60.
	• If true, print the student's name and their marks.
5. Stop the program.
  
Source code:
import java.util.Scanner;
public class MarksAbvSixty{
public static void main(String[] args)
{
int marks[] = new int[6];
int i;
String name[] = new String[30];
Scanner scanner = new Scanner(System.in);
for ( i=0; i<6; i++)
{
System.out.print("Enter name of the Student and Marks of Subject "+ (i+1) + ":");
name[i] = scanner.next();
marks[i] = scanner.nextInt();
}
for (i=0; i<6; i++)
{
if (marks[i] >= 60)
{
System.out.println(name[i] + " " + marks[i]);
}
}
}
}

Output:
Enter name of the Student and Marks of Subject 1:Rahul 75
Enter name of the Student and Marks of Subject 2:Priya 58
Enter name of the Student and Marks of Subject 3:Amit 90
Enter name of the Student and Marks of Subject 4:Sneha 45
Enter name of the Student and Marks of Subject 5:Vikram 62
Enter name of the Student and Marks of Subject 6:Ananya 60
Rahul 75
Amit 90
Vikram 62
Ananya 60

Result:
This program successfully demonstrates parallel array tracking and conditional filtering to filter out and display student records based on a specific performance threshold.
