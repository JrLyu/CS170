// In this example, we will draw dashed polygons. 
// We will call a method while we write the method body of another method. 
public class DashedPolygons {
    
    public static void main(String[] args) {
        Turtle dave = new Turtle();
        dashedPolygon(dave, 100, 7, 5);
        dave.penup();
        dave.forward(200);
        dave.pendown();
        dashedPolygon(dave, 150, 5, 6);
        dave.penup();
        dave.backward(200);
        dave.pendown();
    }

    // draws dashed line
    public static void dashedLine(Turtle t, double length, int numDashes) {
        for (int i = 0; i < (numDashes - 1); i++) {
            t.forward(length / (2 * numDashes - 1));
            t.penup();
            t.forward(length / (2 * numDashes - 1));
            t.pendown();
        }
        t.forward(length / (2 * numDashes - 1)); // The last  dash
    }

    // draws a dashed polygon
    public static void dashedPolygon(Turtle t, double length, int numDashes, int numSides) {
        for (int i = 0; i < numSides; i++) {
            dashedLine(t, length, numDashes);
            t.left(360.0 / numSides);
        }
    }
}
