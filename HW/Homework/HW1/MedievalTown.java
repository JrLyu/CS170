public class MedievalTown {
    
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(5); // faster movement
        t.penup();
        t.backward(250); // Adjust the original position of the turtle, so the drawing fit the canvas
        t.pendown();
        medievalTown(t);
    }

    // The task can be divided into several subparts

    public static void medievalTown(Turtle t) {
        stars(t);
        mountains(t);
        towerGate(t);
        gates(t);
        forest(t);
    }

    public static void forest(Turtle t) {
        t.penup();
        t.forward(470);
        t.pendown();
        trees(t);
        t.penup();
        t.forward(40);
        t.left(90);
        t.forward(40);
        t.right(90);
        t.pendown();
        trees(t);
        t.penup();
        t.left(90);
        t.backward(40);
        t.right(90);
        t.backward(510);
    }

    public static void trees(Turtle t) {
        for (int i = 0; i < 4; i++) {
            tree(t);
            t.penup();
            t.forward(30);
            t.pendown();
        }
        // move back to the original position
        t.penup();
        t.backward(120);
        t.pendown();
    }

    public static void tree(Turtle t) {
        t.left(90);
        t.forward(15);
        for (int i = 0; i < 5; i++) {// Draw the leaves
            t.forward(5);
            t.left(135);
            t.forward(Math.sqrt(10*10+10*10));
            t.backward(Math.sqrt(10*10+10*10));
            t.left(90);
            t.forward(Math.sqrt(10*10+10*10));
            t.backward(Math.sqrt(10*10+10*10));
            t.left(135);
        }
        // Move turtle back to the original position
        t.backward(40); 
        t.right(90);
    }

    public static void gates(Turtle t) {
        t.penup();
        t.forward(400);
        t.left(90);
        t.forward(50);
        t.right(90);
        t.pendown();
        gate(t);
        t.penup();
        t.forward(50);
        t.left(90);
        t.forward(20);
        t.right(90);
        t.pendown();
        gate(t);
        t.penup();
        t.forward(50);
        t.left(90);
        t.forward(20);
        t.right(90);
        t.pendown();
        gate(t);
        t.penup();
        t.backward(500);
        t.left(90);
        t.backward(90);
        t.right(90);
    }


    public static void towerGate(Turtle t) {
        t.penup();
        t.forward(80);
        t.left(90);
        t.forward(20);
        t.right(90);
        t.pendown();
        tower(t);
        t.forward(50);
        walls(t);
        t.forward(80);
        gate(t);
        t.penup();
        t.forward(40);
        t.pendown();
        walls(t);
        t.forward(80);
        tower(t);
        t.penup();
        t.backward(330);
        t.left(90);
        t.backward(20);
        t.right(90);
        t.pendown();
    }

    public static void gate(Turtle t) {
        t.forward(10);
        t.left(90);
        t.forward(30);
        for (int i = 0; i < 180; i++) {
            t.forward(10 * Math.PI / 180);
            t.right(1);
        }
        t.forward(30);
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(30);
        for (int i = 0; i < 180; i++) {
            t.forward(20 * Math.PI / 180);
            t.left(1);
        }
        t.forward(30);
        t.left(90);
    }

    public static void walls(Turtle t) {
        for (int i = 0; i < 3; i++) { // Draw the three repeatitive layers
            for (int j = 0; j < 8; j++) {// the base (the odd layers)
                rect(t);
                t.forward(10);
            }
            t.backward(80);
            t.left(90);
            t.forward(5);
            t.right(90);
            t.forward(5);
            for (int k = 0; k < 7; k++) {// the second layer (the even layers)
                rect(t);
                t.forward(10);
            }
            t.backward(75);
            t.left(90);
            t.forward(5);
            t.right(90);
        }

        for (int i = 0; i < 8; i++) {// the remained layer
            rect(t);
            t.forward(10);
        }
        // send turtle back to the original position
        t.backward(80);
        t.left(90);
        t.backward(30);
        t.right(90);
    }

    public static void rect(Turtle t) { // draws the rectangle as the unit for the wall
        for (int i = 0; i < 2; i++) {
            t.forward(10);
            t.left(90);
            t.forward(5);
            t.left(90);
        }
    }

    public static void tower(Turtle t) { // Draw one tower
        t.forward(50);
        t.left(90);
        t.forward(100);
        t.right(Math.atan(2.0 / 1.0) * 180.0 / Math.PI); // 180.0 to ensure double
        t.forward(Math.sqrt(20*20+10*10));
        t.left(Math.atan(2.0 / 1.0) * 180.0 / Math.PI);
        t.forward(10);
        for (int i = 0; i < 4; i++) {
            t.forward(10);
            t.left(90);
            t.forward(10);
            t.left(90);
            t.forward(10);
            t.right(90);
            t.forward(10);
            t.right(90);
        }
        t.forward(10);
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
        t.left(Math.atan(2.0 / 1.0) * 180.0 / Math.PI);
        t.forward(Math.sqrt(20*20+10*10));
        t.right(Math.atan(2.0 / 1.0) * 180.0 / Math.PI);
        t.forward(100);
        t.left(90);
        t.penup();
        t.forward(10);
        t.left(90);
        t.forward(40);
        t.right(90);
        t.pendown();
        window(t);
        t.penup();
        t.left(90);
        t.backward(40);
        t.right(90);
        t.backward(10);
        t.pendown();
    }

    public static void window(Turtle t) { // Draw the windows in the tower
        for (int i = 0; i < 3; i++) { // draw one layer of the windows
            square(t);
            t.penup();
            t.forward(20);
            t.pendown();
            square(t);
            t.penup();
            t.backward(20);
            t.left(90);
            t.forward(20);
            t.right(90);
            t.pendown();
        }
        // move the turtle back at the original position
        t.penup();
        t.left(90);
        t.backward(60);
        t.right(90);
        t.pendown();
    }

    public static void square(Turtle t) { // The unit square
        for (int i = 0; i < 4; i++) {
            t.forward(10);
            t.left(90);
        }
    }

    public static void mountains(Turtle t) {// Starting from the original point, draw mountains, and come back
        t.left(90);
        t.penup();
        t.forward(170);
        t.right(90);
        mountain(t);
        t.backward(40);
        t.left(90);
        t.forward(80);
        t.right(90);
        mountain(t);
        t.backward(10);
        t.left(90);
        t.forward(20);
        t.right(90);
        mountain(t);
        t.backward(610);
        t.left(90);
        t.backward(150);
        t.right(90);
    }

    public static void mountain(Turtle t) { // Method that draw a unit mountain
        t.pendown();
        t.left(Math.atan(1.0 / 2.0) * 180 / Math.PI); // 1.0 and 2.0 to ensure the result is double
        t.forward(Math.sqrt(160*160 + 80*80));
        t.right(90);
        t.forward(Math.sqrt(120*120 + 60*60)); // 1.0 and 2.0 to ensure the result is double
        t.left(Math.atan(2.0 / 1.0) * 180 / Math.PI);
        t.penup();
    }

    public static void stars(Turtle t) { // Starting from the original point, draw stars, and come back
        t.penup();
        t.left(90);
        t.forward(330);
        t.right(90);
        t.forward(50);
        star(t);
        t.right(90);
        t.forward(40);
        t.left(90);
        t.forward(40);
        star(t);
        t.forward(40);
        t.left(90);
        t.forward(40);
        t.right(90);
        star(t);
        t.forward(80);
        t.left(90);
        t.forward(30);
        t.right(90);
        star(t);
        t.forward(40);
        t.right(90);
        t.forward(70);
        t.left(90);
        star(t);
        t.forward(130);
        t.left(90);
        t.forward(50);
        t.right(90);
        star(t);
        t.forward(60);
        t.right(90);
        t.forward(60);
        t.left(90);
        star(t);
        t.forward(80);
        t.left(90);
        t.forward(50);
        t.right(90);
        star(t);
        t.backward(520);
        t.right(90);
        t.forward(330);
        t.left(90);
    }
    public static void star(Turtle t) { //draw the unit star
        t.pendown();
        for (int i = 0; i < 8; i++) {
            t.forward(10);
            t.backward(10);
            t.left(45);
        }
        t.penup();
    }
}
