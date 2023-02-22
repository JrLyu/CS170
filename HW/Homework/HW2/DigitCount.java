public class DigitCount {
    
    public static void main(String[] args) {
        System.out.println(digitCount(456234, 8)); // 0
        System.out.println(digitCount(456234, 5)); // 1
        System.out.println(digitCount(456234, 4)); // 2
        System.out.println(digitCount(-456234, 4)); // 2
        System.out.println(digitCount(0, 0)); // 1
        System.out.println(digitCount(10000000, 0)); // 7 
    }

    // this method takes two inputs int number and int digit.
    // it returns how many times the digit is repeated in the number. 
    public static int digitCount(int number, int digit) {
        int result = 0;
        int power = 1;
        
        // Question: Because if we put 0 in front of the integer, java will intepret it as in base 8. 
        // We need to further convert it into numberse base 10, so integers such as 01234 will be treated as 1234.
        // But how to do it? 
        number = Math.abs(number); // due to negative or positive numbers should return the same value

        while (number > power) {
            power *= 10; // initiate the power
        }
        // key idea: find the quotient when number is divded by the power of 10 to the same digit
        // then, compare if that the first number of the quotient equals the digit
        for (int i = power; i >= 1; i /= 10) {
            if ((number - number % i) == digit * i) { // will return each digit in the number, and compare it with digit
                result += 1;
            }
            number = number % i; // update the value of number to complete the loop
        }
        return result;
    }
}
