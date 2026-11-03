
Aim:
To demonstrate the use of Graphics class coordinate-mapping methods like drawOval, fillOval, and fillArc in a Java Applet to render a complete human face sketch.
   
Algorithm:
1. Start the applet program.
2. Import the necessary Java AWT and Applet window packages for structural graphics rendering.
3. Override the paint(Graphics g) method to utilize the window container's drawing context.
4. Draw the main facial outline as a large unfilled vertical oval at position (40, 40).
5. Draw two identical horizontal ovals side-by-side to serve as the wireframe borders for the left and right eyes.
6. Render a small unfilled oval inside the left eye and a solid color-filled oval inside the right eye to represent different iris states.
7. Paint an upward-facing solid arc centered in the middle of the face to construct a geometric nose shape.
8. Paint a downward-facing semi-circular solid arc lower on the face to create a wide smiling mouth shape.
9. Draw two narrow vertical ovals on the extreme left and right boundaries of the face structure to represent ears.
10. Stop (End of execution).

Source code:
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}

Result:
Thus, the program was successfully executed to demonstrate how complex composite drawings, like a human face, can be built programmatically by positioning and layer-stacking basic shapes like ovals and arcs using specific structural coordinates.
