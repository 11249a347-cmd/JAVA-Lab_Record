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


