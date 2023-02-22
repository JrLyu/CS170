public class Product {
    public static void main(String[] args) {
        System.out.println(product(2,5)); // 10
        System.out.println(product(5,2)); // 10
        System.out.println(product(0,5)); // 0
        System.out.println(product(5,0)); // 0
    }

    // product method takes two integers x and y and returns their product without using * operator
    public static int product(int x, int y) {
        int result = 0; // initiate the result
        for (int i = 0; i < y; i++) { // use a for loop to achieve this
            result += x;
        }
        return result;
    }
}
