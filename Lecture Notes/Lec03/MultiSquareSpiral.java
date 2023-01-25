public class MultiSquareSpiral {

    public static void main(String[] args) {
        Turtle erin = new Turtle();
        multiSquare1(erin, 10, 5);
        erin.color("red");
        multiSquare2(erin, 10, 5);
        erin.color("orange");
        concentricSquares(erin, 10, 5);
        erin.color("blue");
        squareSpiral1(erin, 5, 20);
        erin.color("green");
        squareSpiral2(erin, 5, 20);
    }
    
    public static void square(Turtle t, double x) {
        for (int i = 0; i < 4; i++) {
            t.forward(x);
            t.left(90);
        }
    }
    
    public static void multiSquare1(Turtle t, double base, int numSquare) {
        for (int i = 0; i < numSquare; i++) {
            square(t, (i+1)*base);
        }
    }

    public static void multiSquare2(Turtle t, double base, int numSquare) { // multiSquare2 is the same as multiSquare1
        for (int i = 0; i <= numSquare; i++) { // change the for loop, the code following should be changed accordingly
            square(t, i*base);
        }
    }

    public static void concentricSquares(Turtle t, double base, int numSquares) {
        for (int i = 0; i < numSquares; i++) {
            square(t, base * (2*i + 1));
            t.penup();
            t.backward(base);
            t.left(90);
            t.backward(base);
            t.right(90);
            t.pendown();
        }
        t.penup();
        t.forward(base * numSquares);
        t.left(90);
        t.forward(base * numSquares);
        t.right(90);
        t.pendown();
    }

    public static void squareSpiral1(Turtle t, double base, int numSides) {
        for (int i = 0; i < numSides; i++) {
            t.forward(base * (i + 1));
            t.left(90);
        }
        for (int i = numSides; i > 0; i--) { // reverse the loop
            t.right(90);
            t.backward(base * i);
        }
    }

    public static void squareSpiral2(Turtle t, double base, int numSides) {
        for (int i = 0; i < numSides; i++) {
            t.forward(base * (i + 1));
            t.left(90);
        }
        for (int i = 0; i < numSides; i++) { // reverse the formula
            t.right(90);
            t.backward((numSides - i) * base);
        }
    }
}
