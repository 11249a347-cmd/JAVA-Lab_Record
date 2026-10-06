Aim:
To write the uppercase English alphabets (A to Z) into a text file named 'sample2.txt' using the FileWriter class

Algorithm:
1. Start the program.
2. Open sample2.txt using the FileWriter class.
3. Loop through ASCII values from 65 ('A') to 90 ('Z').
4. Write each character into the file.
5. Close the file writer and handle any errors.
6. Stop the program.

Source code:
import java.io.*;
class Filewriter {
public static void main(String[] args) {
try {
FileWriter fw = new FileWriter("sample2.txt");
for (char i = 65; i<=90; i++)
    {
	fw.write(i);
}

fw.close();
}
catch(Exception e)
{
System.out.println("Exception:" +e);
}
}
}

Output:
ABCDEFGHIJKLMNOPQRSTUVWXYZ (in sample2.txt file)

Result:
Thus the program of writing a textfile using FileWriter was executed successfully
