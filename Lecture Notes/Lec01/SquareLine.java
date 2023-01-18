// Draw five squares with the side of 40 quares that are arranged in a line and are 60 steps apart from each other. 

public class SquareLine {
    
    public static void main(String[] Args) {
        Turtle bob = new Turtle();

        for (int i = 0; i < 5; i++) {

            // Draw a square and a space of 60 steps
            for (int j = 0; j < 4; j++) {
                bob.forward(40);
                bob.left(90);
            }
            bob.penup();
            bob.forward(100);
            bob.pendown();
        }
        // Moving bob back to the initial position and direction
        bob.penup();
        bob.backward(500);
        bob.pendown();
    }
}

// This example includes a nested loop: the i-loop is "nested" inside the j-loop. 
