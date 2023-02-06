// In this class, we will learn about accumulation.

// Accumulation strategy:
    // 1) Initialize a variable that will contain the result
    // 2) Update the result inside a loop
    // 3) After the loop, finalize (if needed) and return the result

public class Accumulation {
    
    public static void main(String[] args) {
        // Test cases for sumN
        System.out.println("------ Test Cases for sumN ------");
        System.out.println(sumN(0)); // 0
        System.out.println(sumN(1)); // 1
        System.out.println(sumN(2)); // 3
        System.out.println(sumN(5)); // 15
        System.out.println(sumN(10)); // 55
        System.out.println("");

        // Test cases for multN
        System.out.println("------ Test Cases for sumtN ------");
        System.out.println(multN(1)); // 1
        System.out.println(multN(2)); // 2
        System.out.println(multN(3)); // 6
        System.out.println(multN(5)); // 120
        System.out.println(multN(10)); // 3,628,800
        System.out.println(multN(0)); // 1 --> because the loop starts at i = 1, the loop is completed before it even started. The initial result (result = 1) is returned. 
        System.out.println(""); 

        // Test cases for sumMult5
        System.out.println("------ Test Cases for sumMult5 ------");
        System.out.println(sumMult5(0)); // 0
        System.out.println(sumMult5(3)); // 0
        System.out.println(sumMult5(5)); // 5
        System.out.println(sumMult5(6)); // 5
        System.out.println(sumMult5(12)); // 15
        System.out.println(sumMult5(15)); // 30
        System.out.println(sumMult5(16)); // 30
        System.out.println(""); 

        System.out.println("------ Test Cases for multiplyString ------");
        System.out.println(multiplyString("hey", 3)); // "heyheyhey"
        System.out.println(multiplyString("hey", 0)); // ""
        System.out.println(multiplyString("hey", 1)); // "hey"
        System.out.println(multiplyString("", 100)); // ""
        System.out.println(multiplyString("h", 5)); // "hhhhh"
        System.out.println(multiplyString("3", 5)); // "33333"
        System.out.println(""); 
    }

    // sumN calculates the sum from 1 to n.
    public static int sumN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i; // we can also use result += 1
        }
        return result;
    }

    // sumN calculates the product from 1 to n. (factorial of n)
    public static int multN(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            // result = result * i; we can also use
            result *= i;
        }
        return result;
    }

    // sumMult5 sums all the positive integers multiple of 5 up to n (included)
    // We can use the conditional statement to address this problem, but we can also complete the task without using the conditional statements. 
    public static int sumMult5(int n) {
        int result = 0;
        for (int i = 5; i <= n; i += 5) {
            result += i;
        }
        return result; 
    }
    
    // We can also accumulate strings.
    // multiplyString will repeat the String s by n times. 
    public static String multiplyString(String s, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
}
