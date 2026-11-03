
Aim

To demonstrate the use of fundamental Graphics class methods in a Java Applet to draw geometric shapes, including lines, outlined rectangles, filled rectangles, and rounded rectangles.
Algorithm:
1. Start the applet program.
2. Import the required abstract window toolkit (java.awt) and applet lifecycle (java.applet) packages.
3. Override the paint(Graphics g) method to gain access to the applet window's drawing context.
4. Draw a diagonal line from coordinate (10, 10) to (50, 50).
5. Render an unfilled, wireframe rectangle at (10, 60) with a width of 40 and height of 30.
6. Paint a solid, color-filled rectangle at (60, 10) with a width of 30 and height of 80.
7. Draw an unfilled rectangle with rounded corners at (10, 100) using corner arc diameters of 10.
8. Paint a solid, color-filled rounded rectangle inside the previous one at (20, 110) with corner arc diameters of 5.
9. Draw a long diagonal line from top-left (100, 10) to bottom-right (230, 140).
10. Draw a crossing diagonal line from bottom-left (100, 140) to top-right (230, 10) to complete an "X" shape.
11. Stop (End of execution).
Source code:
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code="dinerect.class" width="300" height="200"> </applet>
*/

public class dinerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 10, 50, 50);

    g.drawRect(10, 60, 40, 30);
    g.fillRect(60, 10, 30, 80);

    g.drawRoundRect(10, 100, 80, 50, 10, 10);
    g.fillRoundRect(20, 110, 60, 30, 5, 5);

    g.drawLine(100, 10, 230, 140);
    g.drawLine(100, 140, 230, 10);
}


}
Result:
Thus, the program was successfully executed to demonstrate how various 2D vector shapes like lines, rectangles, and rounded rectangles can be dynamically drawn and filled on an applet canvas using the standard Graphics class APIs.
