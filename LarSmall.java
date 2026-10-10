Aim:
To find and display the largest element, smallest element, and partial sum of a predefined integer array in Java
  
Algorithm:
1. Start the program.
2. Initialize an integer array a[] with 10 hardcoded values.
3. Initialize tracking variables: Set sum = 0, and set both min and max to the first element of the array (a[0]).
4. Iterate through the array using a for loop starting from index 1 to a.length - 1:
	• If the current element a[i] is greater than max, update max = a[i].
	• If the current element a[i] is smaller than min, update min = a[i].
	• Add the current element to sum. (Note: This excludes the first element a[0] from the final sum due to the initialization logic).
5. Print the final values of sum, max, and min.
6. Stop the program.
  
Source code:
public class LarSmall
{
public static void main(String[] args)
{
int a[] = new int[] {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};
int sum=0;
int min = a[0];
int max = a[0];
for (int i =1; i < a.length; i++)
{
if (a[i] > max)
{
max = a[i];
}
if (a[i] < min)
{
min = a[i];
}
sum = sum + a[i];
}

System.out.print("The sum is : " + sum);
System.out.println("Largest Number in a given array is: " + max);
System.out.println("Smallest Number in a given array is: " + min);
}
}

Output:
The sum is : 334
Largest Number in a given array is: 90
Smallest Number in a given array is: 9

Result:
This program successfully demonstrates linear array traversal to determine the boundary limits (maximum and minimum values) of a dataset within a single pass.
