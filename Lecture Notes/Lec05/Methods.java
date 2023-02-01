// We will write methods that return values

public class Methods {
    
    public static void main(String[] args) { // "void": declaring the method will not return anything
        int a;
        int b;
        a = 1;
        b = addOne(a);
        System.out.println("a contains: " + a);
        System.out.println("b contains: " + b);

        int c = addOne(b);
        System.out.println("c contains: "+ c);
        //System.out.println("x contains: " +x); // ERROR! There is not x in main

        int d = sum(10, 15); 
        System.out.println("d contains: "+ d);
    }

    // anything other than "void": declaring the method will return a value of the type specified.  
    public static int addOne(int x) { // "int": declaring the method will return a value of int
        System.out.println("x contains: " + x);
        return x + 1;
    }

    public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }
}
