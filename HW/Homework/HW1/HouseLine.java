public class HouseLine {
    
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(5);
        t.penup();
        t.backward(400); // adjust the initial position, so all the houses can fit in the canvas
        t.pendown();
        houseline(t, 20); // call the method
    }

    public static void houseline(Turtle t, int numHouses) {
        for (int i = 1; i <=numHouses; i++) { // starting from i = 1: avoid dividing by 0.
            house(t, 1.0 / i); // 1.0 instead of 1: make the result a float point number, instead of a int
            t.penup();
            t.forward(80 * 2.0 / i);
            t.forward(40.0 / i);
            t.pendown();
        }
        // move the turtle back to the initial position
        for (int i = 1; i <= numHouses; i++) { // Reverse the loop
            t.penup();
            t.backward(80 * 2.0 / i);
            t.backward(40.0 / i);
            t.pendown();
        }
        
    }

    // use the house code from the inclass example, but added a parameter r (which is the scale)
    public static void house(Turtle t, double r) {
        front(t, r);
        t.left(90);
        t.forward(80 * 2 * r);
        t.right(90);
        top(t, r);
        t.left(90);
        t.backward(80 * 2 * r);
        t.right(90);
      }
    
      public static void front(Turtle t, double r) {
        walls(t, r);
        t.forward(30 * 2 * r);
        door(t, r);
        t.penup();
        t.left(90);
        t.forward(50 * 2 * r);
        t.right(90);
        t.backward(20 * 2 * r);
        t.pendown();
        windows(t, r);
        t.penup();
        t.backward(10 * 2 * r);
        t.left(90);
        t.backward(50 * 2 * r);
        t.right(90);
        t.pendown();
      }
    
      public static void top(Turtle t, double r) {
        roof(t, r);
        t.penup();
        t.forward(10 * 2 * r);
        t.left(90);
        t.forward(10 * 2 * r);
        t.right(90);
        t.pendown();
        chimney(t, r);
        t.penup();
        t.backward(10 * 2 * r);
        t.right(90);
        t.forward(10 * 2 * r);
        t.left(90);
        t.pendown();
      }
    
      public static void walls(Turtle t, double r) {
        square(t, 80 * 2 * r);
      }
    
      public static void windows(Turtle t, double r) {
        square(t, 20 * 2 * r);
        t.penup();
        t.forward(40 * 2 * r);
        t.pendown();
        square(t, 20 * 2 * r);
        t.penup();
        t.backward(40 * 2 * r);
        t.pendown();        
      }
    
      public static void door(Turtle t, double r) {
        for (int i = 0; i < 2; i++) {
          t.forward(20 * 2 * r);
          t.left(90);
          t.forward(30 * 2 * r);
          t.left(90);
        }
      }
    
      public static void roof(Turtle t, double r) {
        t.forward(80 * 2 * r);
        t.left(135);
        t.forward(40 * Math.sqrt(2) * 2 * r);
        t.left(90);
        t.forward(40 * Math.sqrt(2) * 2 * r);
        t.left(135);
      }
    
      public static void chimney(Turtle t, double r) {
        t.left(90);
        t.forward(20 * 2 * r);
        t.right(90);
        t.forward(10 * 2 * r);
        t.right(90);
        t.forward(10 * 2 * r);
        t.backward(10 * 2 * r);
        t.left(90);
        t.backward(10 * 2 * r);
        t.left(90);
        t.backward(20 * 2 * r);
        t.right(90);
      }
    
      public static void square(Turtle t, double x) {
        for (int i = 0; i < 4; i++) {
          t.forward(x);
          t.left(90);
        }
      }
}
