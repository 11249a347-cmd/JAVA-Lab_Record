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