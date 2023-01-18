// Draw a grid of squares that conpose three lines of squares that are 10 steps apart from each other
public class SquareGrid {
    
    public static void main(String[] args) {
            Turtle bob = new Turtle();
            for (int k = 0; k < 3; k++) {
                // Draw one line of squares
                for (int j = 0; j < 5; j++) {
                    // Draw a square and a space of 60 steps
                    for (int i = 0; i < 4; i++) {
                        bob.forward(40);
                        bob.left(90);
                    }
                    bob.penup();
                    bob.forward(100);
                    bob.pendown();
                }
                bob.penup();
                bob.backward(500);
                bob.left(90);
                bob.forward(50);
                bob.right(90);
                bob.pendown();
            }
            // Moving bob back the original direction and position
            bob.penup();
            bob.right(90); 
            bob.forward(150);
            bob.left(90);
            bob.pendown();
        }
    }
