public class BinaryNumber {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(23)); // "00010111"
        System.out.println(decimalToBinary(0)); // "00000000" - extreme case
        System.out.println(decimalToBinary(1)); // "00000001"
        System.out.println(decimalToBinary(16)); // "00010000"
        System.out.println(decimalToBinary(255)); // "11111111" - extreme case
    }

    // decimalToBinary will take an integer n from 0 to 255, 
    // and return the representation in binary format in eight digits
    public static String decimalToBinary(int n) {
        String result = "";
        int quotient = 2 * n;
        while (quotient / 2 != 0) {
                quotient = quotient / 2; 
                result = quotient % 2 + result; 
                
        }
        while (result.length() < 8) {
            result = 0 + result;
        }
        return result;
    }
}
