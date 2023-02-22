public class SumOfSquares {
    // Call the test cases
    public static void main(String[] args) {
        System.out.println(sumOfSquares(1)); // 1
        System.out.println(sumOfSquares(4)); // 30
        System.out.println(sumOfSquares(0)); // 0 (the loop ends before it starts)
    }

    // The method takes an integer n and returns the sum of squares from 1 to n
    public static int sumOfSquares(int n) {
        int result = 0; // initiate the result
        for (int i = 1; i <= n; i++) { // use a for loop to do it
            result += i * i;
        }
        return result; // return the value
    }

}
