// We wre defining our new method! 
public class Polygons {
    
    public static void main(String[] args) {
        Turtle carl = new Turtle();
        square(carl, 100); // method call
        square(carl, 200);
        triangle(carl,150);
        pentagon(carl, 50);
        carl.color("blue");
        polygon(carl, 75, 6); // hexagon
        carl.color("orange");
        polygon(carl, 90, 7);
    }

    public static void square(Turtle t, double size) { // Method dignature
        // Method body
        for (int i = 0; i < 4; i++) {
            t.forward(size);
            t.left(90);
        }
    }

    // Let's create a new method called triangle
    public static void triangle(Turtle t, double size) { // double refers to floating point number with decimals
        for (int i = 0; i < 3; i++) {
            t.forward(size);
            t.left(120);
        }
    }

    public static void pentagon(Turtle t, double size) {
        for (int i = 0; i < 5; i++) {
            t.forward(size);
            t.left(72); // 360 / 5
        }
    }

    // Create a more generic method that allow use to draw polygons. 
    public static void polygon(Turtle t, double size, int numSides) { // The way Java takes the inputs is by the order we define and input them. 
        for (int i = 0; i < numSides; i++) {
            t.forward(size);
            t.left(360.0 / numSides); // If we use 360 / numSides, Java will only keep the integer part of the results. Using 360.0 keeps the decimals. 
        }
    }
}
