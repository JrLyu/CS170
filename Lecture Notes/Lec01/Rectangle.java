// In this file, we will draw a rectangel of the dimension 100 x 60.

public class Rectangle {
    
    public static void main(String[] args) {
        Turtle bob = new Turtle();

        for (int i = 0; i < 2; i++) {
            bob.forward(100);
            bob.left(90);
            bob.forward(60);
            bob.left(90);
        }
    }
}
