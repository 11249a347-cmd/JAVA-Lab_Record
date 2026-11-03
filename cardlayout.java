Aim:
To write and execute a Java applet program that demonstrates the use of a CardLayout manager with interactive buttons.

Algorithm:
1. Start the program execution.
2. Import the required AWT, Applet, and Event handling packages.
3. Declare a class cardlayout that extends Applet and implements ActionListener.
4. Create instances of Panel, CardLayout, and three Button objects (b1, b2, b3).
5. Initialize the applet using the init() method.
6. Set the layout of the created panel to CardLayout.
7. Instantiate the three buttons with specific text labels.
8. Register each button with the action listener (this) to capture click events.
9. Add the buttons to the panel, mapping each to a unique card name string.
10. Add the panel directly to the main applet window container.
11. Listen for a click event on any button.
12. Trigger actionPerformed when a button is clicked, invoking buttonCardLayout.next() to flip to the next card/button.
13. Stop when the applet window is closed.

Source code:
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class cardlayout extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

Result:
Thus, the program was successfully executed to demonstrate how CardLayout manages multiple components as a deck of cards, allowing users to cycle through them one at a time via button clicks.
