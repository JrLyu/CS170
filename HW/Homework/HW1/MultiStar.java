public class MultiStar {
    
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(10);
        // multistar(t, 7, 100);
        // multistar(t, 10, 70);
        multistar(t, 25, 120); 
    }

    // Devide the method into two parts: draw the small stars; draw the big star
    public static void star(Turtle t, int n, double length) {
        for (int i = 0; i < n; i++) {
            t.forward(length / 4); // draw one side of the star
            t.backward(length / 4); // back to the origianl position
            t.left(360.0 / n); // turn to fit the angle and prepare to draw the next star
        }
    }

    public static void multistar(Turtle t, int n, double length) {
        for (int i = 0; i < n; i++) {
            t.forward(length); 
            star(t, n, length); // draw star at the tip
            t.backward(length); // back to the original position
            t.left(360.0 / n); // turn to prepar the next drawing
        }
    }
}
