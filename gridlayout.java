
Aim:
To demonstrate the implementation of GridLayout in a Java Applet by arranging ten buttons into a structured grid of 5 rows and 2 columns with custom margin padding.

ALgorithm:
1. Start the applet program.
2. Import the necessary Java packages for UI elements (java.awt) and applet containers (java.applet).
3. Apply a new GridLayout(5, 2) to the applet window to set up a matrix of 5 horizontal rows and 2 vertical columns.
4. Instantiate ten individual button components labeled "A" through "J".
5. Add each button component sequentially to the applet container, filling the grid from left-to-right, top-to-bottom.
6. Define container margins by overriding the getInsets method to apply a clean 20-pixel border layout padding on all sides.

Source code:
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gridlayout extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}
}

Result:
Thus, the program was successfully executed to demonstrate how GridLayout neatly organizes ten UI components into a uniform row-and-column matrix while utilizing getInsets() to apply consistent border padding around the grid.
