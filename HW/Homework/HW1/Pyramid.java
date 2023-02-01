public class Pyramid {
    
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(10);
        // pyramid(t, 200, 5);
        // pyramid(t, 200, 10);
        pyramid(t, 300, 10);
    }

    // the unit of the pyramid is a squarfe. define a method to draw squares
    public static void square(Turtle t, double length) {
        for (int i = 0; i < 4; i++) {
            t.forward(length);
            t.left(90);
        }
    }
    // level 1 = 1; level 2 = 3; level 3 = 5; ... leven n = (2n-1) squares
    public static void pyramid(Turtle t, double base, int levels) {
        for (int i = levels; i > 0; i--) { // draw each level
            for (int j = 0; j < 2 * i - 1; j++) { // draw the squares
                square(t, base / (2 * levels - 1));
                t.forward(base / (2 * levels - 1));
            }
            t.backward((2 * i - 2) * base / (2 * levels - 1)); // move to prepare for the next layer
            t.left(90);
            t.forward(base / (2 * levels - 1));
            t.right(90);
        }
        // move to the original position
        t.right(90);
        t.forward(levels * base / (2 * levels - 1));
        t.left(90);
        t.backward(levels * base / (2 * levels - 1));
    }

}
