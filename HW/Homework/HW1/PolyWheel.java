public class PolyWheel {
    
    public static void main(String[] args ){ 
        Turtle t = new Turtle();
        // polywheel(t, 3, 70);
        // polywheel(t, 4, 50);
        // polywheel(t, 5, 40);
        polywheel(t, 6, 30);
        // polywheel(t, 12, 15);
    }

    // Devide the method into two parts = draw the polygon; draw the wheel
    public static void polygon(Turtle t, int numSides, double length) { // the unit of the wheel is polygons
        for (int i = 0; i < numSides; i++) {
            t.forward(length);
            t.left(360.0 / numSides);
        }
    }

    public static void polywheel(Turtle t, int numSides, double length) {
        for (int i = 0; i < numSides; i++) {
            polygon(t, numSides, length); // draw a polygon
            t.forward(length); // move to the position where the next polygon starts
            t.right(360.0 / numSides); // turn to fit the angle
        }
    }
}
