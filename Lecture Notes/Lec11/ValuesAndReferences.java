public class ValuesAndReferences {
    public static void main(String[] args) {
        System.out.println("------ Values of Integers ------");
        int a = 5;
        int b = 7;
        System.out.println("a: " + a + ". b: " + b); // 5, 7
        a = b;
        System.out.println("a: " + a + ". b: " + b); // 7, 7
        b = 8;
        System.out.println("a: " + a + ". b: " + b); // 7, 8

        System.out.println("------ Values and References of Arrays ------");
        int[] x = new int[3];
        int[] y = new int[3];
        x[0] = 5;
        y[0] = 7;
        System.out.println("x[0]: " + x[0] + ". y[0]: " + y[0]); // 5, 7
        x = y;
        System.out.println("x[0]: " + x[0] + ". y[0]: " + y[0]); // 7, 7
        y[0] = 8;
        System.out.println("x[0]: " + x[0] + ". y[0]: " + y[0]); // 8, 8

        /* Array is stroed in Java ina different way from integers. 
         * Whenever we declare a new integer, the value of that integer will be stored and updated in the main memory space. 
         * However, we will not create the arrays in the main memory space but rather in the heap memory sapce. 
         * In the main memory space, the array will not have the full elements. They will only have a reference number that refers the array to an array in the heap memory space. 
         * The assignment between arrays x = y assigns the reference number of y to x.
         * Hence, when we update the elements in y, the elements in x also updates since they now refer to the same array in the heap memory. 
         */

        System.out.println("------ Examples involving Methods ------");
        int k = 10;
        System.out.println("k: " + k);// 10
        f(k); // we we call a method, Java promotes the variable value to a different memory space (the k in the method is different from the k in this main memory space)
        // After finish running f(k), everything in the method memory will be destoryed.
        // The way the method f() is written is useless. It does all the work, but does not return the desired output. 
        System.out.println("k: " + k); 
        
        int[] h = new int[3];
        h[0] = 10;
        System.out.println("h[0]: " + h[0]); // 10
        g(h);
        System.out.println("h[0]: " + h[0]); // 11
    }

    public static void f(int k) {
        k += 1;
    }

    public static void g(int[] h) {
        h[0] += 1;
    }
}
