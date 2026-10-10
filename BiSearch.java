Aim:
To search for a specific target element in a sorted integer array using the Binary Search algorithm in Java

Algorithm:
1. Start the program.
2. Read the array size n and capture n user-provided elements into array a[] (assumed to be in sorted order).
3. Read the target element x to search for.
4. Initialize pointers: Set first = 0, last = n - 1, and a marker variable flag = 0.
5. Execute the search loop while first <= last:
	• Calculate the middle index: mid = (first + last) / 2.
	• If a[mid] > x, adjust the search boundary to the lower half by setting last = mid - 1.
	• Else if a[mid] < x, adjust the search boundary to the upper half by setting first = mid + 1.
	• Otherwise (a[mid] == x), set flag = 1, print "element found", and break out of the loop.
6. Evaluate results: If the loop finishes and flag == 0, print "element not found".
7. Stop the program
  
Source code:
import java.util.Scanner;
public class BiSearch 
{
public static void main(String[] args) 
{
int i, mid, first, last, x, n, flag=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements: ");
n = sc.nextInt();
int a[] =new int[n];
System.out.println("Enter elements of array: ");
for(i=0;i<n;i++)
a[i] = sc.nextInt();
System.out.println("Enter element to search: ");
x = sc.nextInt();
first = 0;
last = n-1;

while (first<=last)
{
mid=(first+last)/2;
if (a[mid] > x)
last = mid -1;
else
if (a[mid]<x)
first = mid +1;
else
{
flag=1;
System.out.println("element found");
break;
}
}
if (flag==0)
System.out.println("element not found");
}
}

Output:
Enter number of elements: 
5
Enter elements of array: 
10 20 30 40 50
Enter element to search: 
40
element found

Result:
This program successfully demonstrates how the Binary Search technique efficiently locates an element by repeatedly dividing the search interval in half, offering a much faster performance than linear searching for pre-sorted datasets.
