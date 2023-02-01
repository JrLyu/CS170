public class Variables {
    
    public static void main(String[] args) {
        int x; // declare a variable named x of type int
        x = 3; // assign value 3 to variable x
        System.out.println(x);

        int y = 5; // declare a variable and assign a value to it (in the same line)
        int z;
        z = x + y;
        System.out.println("x contains " + x); // 3
        System.out.println("y contains " + y); // 5
        System.out.println("z contains " + z); // 8

        x = 30; // variable reassignment (the variable has been assigned a value)
        y = 50;
        System.out.println("x contains " + x); // 30
        System.out.println("y contains " + y); // 50
        System.out.println("z contains " + z); // 8
        // IMPORTANT: "=" is only an assignment operator, which in this case, the value of z is not reassigned, so the value of z is not changed. 
        
        x = x + 1; // this does not make sense mathematically, but it means to reassign the value (x+1) to x in Java.
        System.out.println("x contains " + x); // 31
        
        // x = 5.2; // ERROR: because we have specified the type of x is int
        x = (int)5.2; // we have to convert 5.2 (double) to an int
        System.out.println("x contains " + x); // 5

        double k = 5;
        System.out.println("k contains " + k); // 5.0

        // double x = 5.2; // ERROR: becasue we cannot re-declare a variable
        // Note: the same variable name can be reused in another method.
    }
}
