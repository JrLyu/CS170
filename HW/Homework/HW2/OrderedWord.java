public class OrderedWord {
    public static void main(String[] args) {
        System.out.println(isOrdered("effort")); // true
        System.out.println(isOrdered("Aaaabbbyy")); // true
        System.out.println(isOrdered("Hello")); // false
    }

    // This method takes a string s as input
    // It returns true if s is character's are sorted natually in English alphabetical order
    // It returns false if it is not sorted alphabetically. 
    public static Boolean isOrdered(String s) {
        int result = 0;
        s = s.toLowerCase(); // turn s into lower case for comparison
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                continue; // do nothing if it is alphabetically ordered, and compare the next compare
            } else {
                result = 1; // change the result to 1 if it is not alphabetically ordered
                break; // break from the loop
            }
        }
        if (result == 0) { // result = 0 if it is ordered; = 1 if it is not. 
            return true;
        } else {
            return false;
        }
    }

}
