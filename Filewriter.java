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