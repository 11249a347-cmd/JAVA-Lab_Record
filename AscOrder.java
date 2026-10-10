Aim:
To sort a user-defined array of integers in ascending order using the Bubble/Selection sorting technique in Java.
  
Algorithm:
1. Start the program.
2. Read the size of the array n from the user and initialize an array a[] of size n.
3. Read n elements into the array using a for loop.
4. Sort the array using nested loops (i from 0 to n-1 and j from i+1 to n-1):
	• Compare element a[i] with subsequent element a[j].
	• If a[i] > a[j], swap their positions using a temporary variable temp.
5. Print the elements of the sorted array separated by commas, ensuring the last element does not have a trailing comma.
6. Stop the program
  
Source code:
import java.util.Scanner;
public class AscOrder{
public static void main(String[] args) {
int n, temp;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array: ");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter all the elements: ");
for (int i = 0; i<n; i++) {
a[i] = s.nextInt();
}
for (int i=0;i<n;i++){
for (int j=i+1;j<n;j++){
if (a[i]>a[j]) {
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.print("Ascending Order: ");
for (int i=0; i<n-1; i++) {
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
Output:
Enter no. of elements you want in array: 5
Enter all the elements: 
25
12
89
7
43
Ascending Order: 7,12,25,43,89

Result:
This program successfully demonstrates in-place element sorting by systematically comparing adjacent value sets and ordering them linearly from lowest to highest
