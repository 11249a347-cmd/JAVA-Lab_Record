Aim:
To demonstrate the implementation of BorderLayout in a Java Applet to arrange user interface components into five distinct regions (North, South, East, West, and Center) with custom margin spacing.

Algorithm:
1. Start the applet program.
2. Import the necessary Java packages for UI components, applet support, and utility structures.
3. Set the background color of the applet window to cyan inside the initialization step.
4. Apply a new BorderLayout manager to the applet window container.
5. Create and position a button at the top region using the BorderLayout.NORTH constraint.
6. Create and position a footer button at the bottom region using the BorderLayout.SOUTH constraint.
7. Create and position a button on the right flank using the BorderLayout.EAST constraint.
8. Create and position a button on the left flank using the BorderLayout.WEST constraint.
9. Instantiate a text box loaded with a default quote and place it in the remaining middle space using BorderLayout.CENTER.
10. Define custom container margins by overriding the getInsets method to return 10 pixels of padding on all sides.
11. Stop (End of execution).

Source code:
import java.awt.*; 
import java.applet.*; 
import java.io.*; 
import java.util.*; 

/* <applet code = "borderlayout" width = 400 height = 200></applet>*/ 

public class borderlayout extends Applet { 
    public void init() { 
        setBackground(Color.cyan); 
        setLayout(new BorderLayout()); 
        add(new Button("This is cross the top"), BorderLayout.NORTH); 
        add(new Button("the footer message might go here"), BorderLayout.SOUTH); 
        add(new Button("RIGHT"), BorderLayout.EAST); 
        add(new Button("LEFT"), BorderLayout.WEST); 
        
        String msg = "the reaonable man adapts \n"; 
        add(new TextArea(msg), BorderLayout.CENTER); 
    } 

    // Corrected method name, return type, and implementation
    public Insets getInsets() { 
        return new Insets(10, 10, 10, 10); 
    } 
}
Result: Thus, the program was successfully executed to demonstrate how BorderLayout arranges components into five distinct regions while using getInsets() to apply clean padding around the container.
