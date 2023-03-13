public class Recursion {
    public static void main(String[] args) {
        // test powerOfTwo
        System.out.println("------ Test powerOfTwo ------");
        System.out.println(powerOfTwo(0)); // 1
        System.out.println(powerOfTwo(1)); // 2
        System.out.println(powerOfTwo(2)); // 4
        System.out.println(powerOfTwo(4)); // 16
        System.out.println(powerOfTwo(5)); // 32
        System.out.println(powerOfTwo(17)); // 131072

        // test factorial
        System.out.println("------ Test factorial ------");
        System.out.println(factorial(0)); // 1
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(2)); // 2
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(4)); // 24
        System.out.println(factorial(5)); // 120

        //test reverse
        System.out.println("------ Test reverse ------");       
        System.out.println(""); // ""
        System.out.println(reverse("A")); // "A"
        System.out.println(reverse("ABCDE")); // "EDCBA"

        //test isPallindrome
        System.out.println("------ Test isPallindrome ------");
        System.out.println(isPallindrome("")); // true
        System.out.println(isPallindrome("A")); // true
        System.out.println(isPallindrome("AA")); // true
        System.out.println(isPallindrome("AB")); // false
        System.out.println(isPallindrome("AYA")); // true
        System.out.println(isPallindrome("KAYAK")); // true
        System.out.println(isPallindrome("KAYAY")); // false
        System.out.println(isPallindrome("KAYYK")); // false
    }

    // This method will return the value of 2 to the power of n.
    // Assume n is also greater than 0.
    public static int powerOfTwo(int n) {
        if (n == 0) { // define the base case
            return 1;
        }  else { // the recursion part
            return 2 * powerOfTwo(n-1);
        }
    }

    public static int factorial(int n) {
        if (n == 0) { // define the base case
            return 1;
        } else { // the recursion part
            return n * factorial(n - 1);
        }
    }

    // ABCDE -> EDCBA
    public static String reverse(String s) {
        if (s.length() <= 1) { // define the base cases
            return s;
        } else { // the recursion part
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }

    // kayak is a pallindrome becuase its reverse is the same as itself
    // computer is not a pallindrome
    // "" and "x" are pallindromes.
    public static boolean isPallindrome(String s) {
        if (s.length() <= 1) { // define the base cases
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1) && 
                   isPallindrome(s.substring(1, s.length() - 1))) {
            return true;
        } else {
            return false;
        }
    }
}
