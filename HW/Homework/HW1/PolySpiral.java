public class PolySpiral {
    
    public static void main(String[] args) {
        Turtle t = new Turtle(); // new turtle
        polyspiral(t, 3, 20, 5); // call the Method
        // polyspiral(t, 5, 10, 4);
        // polyspiral(t, 8, 5, 3);
    }

    public static void polyspiral(Turtle t, int n, double base, int rounds) { // define the method
        for (int i = 0; i < rounds * n; i++) { // for loop. rounds * n = the total number of lopps needed
            t.forward(base * (i + 1)); // increase side length = Spiral
            t.right(360.0 / n);
        }

        for (int i = rounds * n; i > 0; i--) { // reverse the loop; make turtle back at the initial point
            t.left(360.0 / n);
            t.backward(base * i);
        }
    }
}
