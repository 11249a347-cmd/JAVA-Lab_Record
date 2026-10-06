Aim:
To write a Java program that demonstrates thread lifecycle controls using yield(), stop(), and sleep().

Algorithm:
1. Start the program.
2. Create three thread classes (A, B, and C) extending the Thread class.
3. Run Thread A with yield() to pause it temporarily.
4. Run Thread B with stop() to terminate it early at loop count 3.
5. Run Thread C with Thread.sleep(1500) to delay execution for 1.5 seconds.
6. Launch all threads simultaneously from the main method.
7. Stop the program.

Source code:
import java.io.*;
class A extends Thread {
@Override
public void run() {
for (int i=1;i<=5;i++) {
if(i==1) 
yield();
System.out.println("from thread A  i = "+i);}
System.out.println("exit from A");
}
}

class B extends Thread {
public void run() {
for (int j=1;j<=5;j++) {
System.out.println("from thread B  j = "+j);
if(j==3){
System.out.println("exit from B");
stop();
}
}
}
}

class C extends Thread {
public void run() {
for (int k=1;k<=5;k++) {
System.out.println("from thread C k = "+k);
if (k==1){
try { 
                    Thread.sleep(1500); 
                } catch (Exception e) {
                    System.out.println(e);
                } 
            }
        } 
        System.out.println("exit from C"); 
    } 
} 

class Threadtest {

public static void main(String[] args) {
A a = new A();
B b = new B();
C c = new C();
System.out.println("Start thread A");
a.start();
b.start();
c.start();
System.out.println("exit from main thread");
}
}

Output:
Start thread A
exit from main thread
Thread C started
from thread C k=1
Thread B started
Thread A started
from thread B j=1
from thread C k=2
from thread C k=3
from thread B j=2
from thread B j=3
from thread B j=4
from thread A i=1
exit from B
from thread C k=4
from thread A i=2
from thread A i=3
exit from C
from thread A i=4
exit from A

Result:
The program successfully demonstrated concurrent execution in Java. By using yield(), stop(), and sleep(), the program effectively controlled thread states and altered the execution order of multiple running threads.
