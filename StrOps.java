Aim:
    To demonstrate the usage of various built-in Java String methods for manipulation, transformation, searching, comparison, splitting, and type conversion.
        
Algorithm:
1. Start the program.
2. Initialize sample string variables (str1, str2, sample, searchStr, a, b, csv, and an integer number).
3. Display basic info using length() and charAt().
4. Transform strings using toUpperCase(), toLowerCase(), trim(), and replace().
5. Extract substrings using the single-parameter and dual-parameter substring() methods.
6. Validate and search content using contains(), startsWith(), endsWith(), indexOf(), and lastIndexOf().
7. Compare strings using equals(), equalsIgnoreCase(), and compareTo().
8. Tokenize and combine strings using split() and String.join().
9. Convert data types by transforming the integer to a string using String.valueOf().
10. Stop the program.import java.util.Arrays;

Source code:
public class StrOps {
    public static void main(String[] args) {
        String str1 = "Hello"; 
        String str2 = "  Java Programming  ";
        
        System.out.println("=== 1. Basic Information ===");
        System.out.println("Length of str1: " + str1.length()); 
        System.out.println("Character at index 1 in str1: " + str1.charAt(1)); 
        
        System.out.println("\n=== 2. Modification & Transformation ===");
        System.out.println("Uppercase: " + str1.toUpperCase()); 
        System.out.println("Lowercase: " + str1.toLowerCase()); 
        System.out.println("Trimmed str2: '" + str2.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + str2.replace("Java", "Python").trim());
        
        System.out.println("\n=== 3. Substrings & Extraction ===");
        String sample = "Unforgettable";
        System.out.println("Substring from index 2: " + sample.substring(2)); 
        System.out.println("Substring (2 to 6): " + sample.substring(2, 6)); 
        
        System.out.println("\n=== 4. Searching & Validation ===");
        String searchStr = "Elephant";
        System.out.println("Contains 'ph': " + searchStr.contains("ph")); 
        System.out.println("Starts with 'El': " + searchStr.startsWith("El")); 
        System.out.println("Ends with 'ant': " + searchStr.endsWith("ant")); 
        System.out.println("Index of 'e': " + searchStr.indexOf('e')); 
        System.out.println("Last index of 'n': " + searchStr.lastIndexOf('n')); 
        
        System.out.println("\n=== 5. Comparison ===");
        String a = "java";
        String b = "Java";
        System.out.println("Equals (case-sensitive): " + a.equals(b)); 
        System.out.println("Equals (case-insensitive): " + a.equalsIgnoreCase(b)); 
        System.out.println("Compare 'a' to 'b': " + a.compareTo(b)); 
        
        System.out.println("\n=== 6. Splitting & Joining ===");
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("Split array: " + Arrays.toString(fruits));
        String joined = String.join(" -> ", fruits);
        System.out.println("Joined string: " + joined);
        
        System.out.println("\n=== 7. Type Conversion ===");
        int number = 456;
        String numStr = String.valueOf(number);
        System.out.println("Converted number to String: " + numStr);
    }
}

Result:
This program successfully demonstrates how to use built-in Java String methods to easily manipulate, search, and transform text data
