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
