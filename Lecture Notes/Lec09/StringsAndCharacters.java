public class StringsAndCharacters {
    public static void main(String[] args) {
        char c = 'A'; // one single chracter
        String s1 = "ABCD"; // String with many characters
        String s2 = "A"; // String with one chracter
        String s3 = ""; // emtpy String
        // char c2 = '' // ERROR: there is no empy char

        // You don't see the quotes when you print
        System.out.println(c);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // A char is actually a number: see @ https://www.asciitable.com/
        System.out.println('A' + 1); // 66 (int): 'A' = 65 and 65 + 1 = 6
        System.out.println((char)('A' + 1)); // 'B' (char) - type casting
        // You cannot do "character arithmetic" with Strings
        System.out.println("A" + 1); // "A1" (String)

        // Operations with Strings: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // All the operations, unless specified, will not modify the original String.
        char k = s1.charAt(2); // picks the char at index 2 in s1
        System.out.println(k); // 'C' (char)

        int n = s1.length(); // number of characters in a String
        System.out.println(n); // 4 (int)

        String s4 = "Hello Everyone";
        // String.substring(beginIndex, endIndex) picks the string between the two indices. beginIndex is included, but endIntex is excluded.
        System.out.println(s4.substring(3,8)); // "lo Ev" (String)
        System.out.println(s4.substring(8)); // "eryone" (String) // picks from the beinIndex to the end

        System.out.println(s4.toUpperCase()); // "HELLO EVERYONE"
        System.out.println(s4.toLowerCase()); // "hello everyone"
        System.out.println(s4.toUpperCase().substring(1,4)); // "ELL"

        // Compare two strings for equality: String1.equals(String2)
        // You cannot use == between two strings (weird results)
        // We can use == to compare two chars (because they are fundamentally numbers)
        String x = "hey";
        String y = "you";
        String z = "HEY";
        System.out.println(x.equals(y)); // false
        System.out.println(x.toUpperCase().equals(z)); // true
        // System.out.println(x == y); // DON'T DO THIS!!!!!!!
        // System.out.println(x == z); // DON'T DO THIS!!!!!!!

        // Compare two strings alphabetically (alphanumerically): String1.compareTo(String2)
        // If the two strings are equal, we will get 0
        // If the String1 comes before String2, we will get negative values
        // if the String1 comes after String2, we will get positive results
        System.out.println(x.compareTo(y)); // < 0 (int) --> x comes before y
        System.out.println(y.compareTo(z)); // > 0
        System.out.println(x.compareTo(x)); // 0
        System.out.println("apple".compareTo("banana")); // < 0
        System.out.println("apple".compareTo("BANANA")); // > 0 --> upper cases comes before lower cases
        System.out.println("apple".compareTo("Banana")); // > 0 
        System.out.println("apple".compareTo("Apple")); // > 0
        System.out.println("apple".compareTo("apply")); // < 0 --> the last letter e comes before the letter y. 

        // Test mySubstring
        System.out.println("------ Test mySubstring ------");
        System.out.println(mySubstring(s4, 3, 8)); // "lo Ev"
        System.out.println(mySubstring("Examination", 3, 8)); // "minat"
        System.out.println(mySubstring(s4, 3, 8, 2)); // "l v"
        System.out.println(mySubstring(s4, 3, 8, 3)); // "lE"
        
        // Test reverse
        System.out.println("------ Test reverse ------");
        System.out.println(reverse("ABCDE"));
        System.out.println(reverse2("ABCDE"));

        // Test mergeStrings
        System.out.println(mergeStrings("ABCD", "1234")); // "A1B2C3D4"
        System.out.println(mergeStrings("AB", "1234")); // "A1B234"
        System.out.println(mergeStrings("ABCD", "12")); // "A1B2CD"
    }

    public static String mySubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String mySubstring(String s, int start, int end, int step) {
        String result = "";
        for (int i = start; i < end; i += step) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >=0; i--) {
            result += s.charAt(i);
        }
        return result;
    } // Or, we can do a while loop

    // An alternative approach
    public static String reverse2(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }
        return result;
    }

    // Examples:
    // mergeStrings("ABCD", "1234") -> "A1B2C3D4"
    // mergeStrings("AB", "1234") -> "A1B234"
    // mergeStrings("ABCD", "12") -> "A1B2CD"
    public static String mergeStrings(String s1, String s2) {
        String result = "";
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                result += s1.charAt(i);
                result += s2.charAt(i);
            }
        } else if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                result += s1.charAt(i);
                result += s2.charAt(i);
            }
            result += s2.substring(s1.length());
        } else {
            for (int i = 0; i < s2.length(); i++) {
                result += s1.charAt(i);
                result += s2.charAt(i);
            }
            result += s1.substring(s2.length());
        }
        return result;
    }
}
