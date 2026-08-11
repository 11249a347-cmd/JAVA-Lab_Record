import java.util.Arrays;

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
