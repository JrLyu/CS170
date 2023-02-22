public class PolySpiralLength {
    public static void main(String[] args) {
        System.out.println(polySpiralLength(3, 20, 5)); // 2400.0
        System.out.println(polySpiralLength(5, 10, 4)); // 2100.0
        System.out.println(polySpiralLength(8, 5, 3)); //1500.0
    }

    // polySpiralLength takes int n (number of the side), double base (the length of the smallest side),
    // and int rounds (number of spiral) to return the total length of the shape.
    // recall the code from previous homework assignment: 
    /*for (int i = 0; i < rounds * n; i++) { // for loop. rounds * n = the total number of lopps needed
            t.forward(base * (i + 1)); // increase side length = Spiral
            t.right(360.0 / n);
        } */
    public static double polySpiralLength(int n, double base, int rounds) {
        double length = 0; // initialize the result
        for (int i = 0; i < rounds * n; i ++) { // develop my code based on the previous homework assignment
            length += base * (i + 1);
        }
        return length;
    }
}
