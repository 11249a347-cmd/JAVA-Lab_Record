Aim:
To write and execute a Java program that reads characters from an existing text file (sample2.txt) and displays them on the console

Algorithm:
1. Start the program.
2. Open the file sample2.txt using the FileReader class within a try block to handle potential errors.
3. Read the first character from the file using the read() method.
4. Check if the character value is not equal to -1 (which signals the End-of-File).
5. Print the character to the console if it is valid.
6. Repeat steps 3 to 5 until the end of the file is reached.
7. Close the file reader stream.
8. Catch and display any exceptions (like file not found) if they occur.
9. Stop the program.

Source Code:
import java.io.*;
class Filereader {
public static void main (String[] args) {
try {
FileReader fr = new FileReader("sample2.txt");
int i;
while ((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch (Exception e)
{
System.out.println("Exception: "+e);
}
}
}

Output:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
Result:
Thus the program of reading a text file using FileReader was executed successfully.
