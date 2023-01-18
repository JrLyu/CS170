// We use this file to draw a square using turtle bob. The side of the square is 100 steps long.

public class Square {
    
    public static void main(String[] args) {
        Turtle bob = new Turtle();

        // We can use the following code (the simplest) way to draw the square
        bob.forward(100);
        bob.left(90);
        bob.forward(100);
        bob.left(90);
        bob.forward(100);
        bob.left(90);
        bob.forward(100);
        bob.left(90); // Make sure the turtle returns the original position and direction at the end of the drawing. 

        // As we noticed that there are repetitions, let's use a FOR loop 
        for (int i = 0; i < 4; i++) { // Initiates a for loop starting from 0 and ands at 3, increasing one by one.
            bob.forward(100);
            bob.right(90);
        }

        // Change the number of iterations:
        for (int i = 0; i < 12; i++) { // Repeats three times around the square
            bob.backward(100);
            bob.right(90);
        }

        for (int i = 0; i < 2; i++) { // Only draw half of the square
            bob.backward(100);
            bob.left(90);
        }
    }
}