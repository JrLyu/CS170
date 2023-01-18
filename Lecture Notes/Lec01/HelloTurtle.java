// The file `Turle.java` must be included under the same folder of the programming file. 

public class HelloTurtle {
    
    public static void main(String[] args) {
        Turtle amy = new Turtle(); // Create a new turle, and calls her amy
        amy.forward(100); // Move amy forward (to the left because amy is pointing to the left): amy.foward(number of steps)
        amy.left(90); // Rotate amy 90 degrees to her left side
        amy.backward(50); // Move amy backward.
        amy.right(45); // Rotate amy 45 degrees in the right direction
        amy.penup(); // Lifts the pen of the turtle from the screen -- the turtle will not draw any lines
        amy.forward(100);
        amy.pendown(); // Makes amy draw again
        amy.forward(50);
        amy.color("red"); // Changes the color of amy
        amy.forward(100);
    }
}
