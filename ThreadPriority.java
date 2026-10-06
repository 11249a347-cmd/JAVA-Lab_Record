Aim:
To write a Java program that demonstrates how to assign and execute threads with different priorities using setPriority().

Algorithm:
1. Start the program.
2. Create three thread classes (A, B, and C) by extending the Thread class.
3. Instantiate all three threads in the main method.
4. Assign priorities to the threads: Thread C to maximum (10), Thread B to normal + 1 (6), and Thread A to minimum (1).
5. Start all three threads concurrently using the start() method.
6. Stop the program.
  
Source code:
import java.io.*;
class A extends Thread {
public void run() {
System.out.println("Thread A started");
for (int i=1;i<=4;i++)
{
System.out.println("from thread A i=" +i);
}
System.out.println("exit from A");
}
}

class B extends Thread { 
public void run() {
System.out.println("Thread B started");
for (int j=1;j<=4;j++)
{
System.out.println("from thread B j=" +j);
}
System.out.println("exit from B");
}
}

class C extends Thread {
public void run() {
System.out.println("Thread C started");
for (int k=1;k<=4;k++)
{
System.out.println("from thread C k=" +k);
}
System.out.println("exit from C");
}
}

class ThreadPriority {
public static void main(String[] args) {
A threadA = new A();
B threadB = new B();
C threadC = new C();
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority()+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
threadA.start();
System.out.println("start thread B");
threadB.start();
System.out.println("start thread C");
threadC.start();
System.out.println("end of main thread");
}
}

Output:
start thread A
start thread B
Thread A started
start thread C
from thread A i=1
end of main thread
from thread A i=2
Thread B started
from thread A i=3
from thread A i=4
exit from A
Thread C started
from thread B j=1
from thread B j=2
from thread C k=1
from thread C k=2
from thread C k=3
from thread C k=4
exit from C
from thread B j=3
from thread B j=4
exit from B

Result:
The program successfully demonstrated thread scheduling based on priorities in Java. By using setPriority(), the JVM was given hints to allocate execution time preferentially to higher-priority threads (C and B) over the lower-priority thread (A).
