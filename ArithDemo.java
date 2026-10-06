Aim:
To write a Java program that imports multiple custom arithmetic packages (add, sub, mul, div) to perform and display basic mathematical operations.

Algorithm:
1. Start the program.
2. Import the custom operation packages: add, sub, mul, and div.
3. Instantiate the respective operation classes (Add, Sub, Mul, Div) inside the main method.
4. Invoke the operation methods (addop, subop, mulop, divop) passing the values 20 and 10 as arguments.
5. Stop the program.

Source code:  
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo{
public static void main(String[] args) {
Add ad = new Add();
Sub su = new Sub();
Mul mu = new Mul();
Div di = new Div();

ad.addop(20, 10);
su.subop(20, 10);
mu.mulop(20, 10);
di.divop(20, 10);
}
}

Output:
Add: 30
Sub: 10
Mul: 200
Div: 2

Result:
The ArithDemo program was successfully executed. By importing the custom packages (add, sub, mul, and div), it correctly performed and displayed basic mathematical operations using separate package classes.
