public class Arrays {
    public static void main(String[] args) {
        int[] a; // declare an array of integers named a
        a = new int[4]; // create an array with 4 slots

        a[0] = 7; // assign 7 to the first element of a
        a[1] = 3;
        a[2] = 15;
        a[3] = 9;
        // a[4] = 1; // ERROR: Index out of bound

        System.out.println(a[2]); // print the element with index 2 in a -- 15
        System.out.println(a); // weird output -- an identifier of the array

        // use a for loop to print all the element of the array
        for (int i = 0; i < a.length; i++) { // String.length() vs. array.length
            System.out.println(a[i]);
        }

        // print all the elements on the same line
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); 
        }
        // if we use print(), our next print will also be on the same line. 
        System.out.println(); // we add a println() outside the for loop. 
        System.out.println("hello");

        // empty array (array with no element)
        int[] b = new int[0];

        // create and initialize an array in one line
        int[] c = {5, 2, 3, 3, 13, 24}; // valid only when we create the variable in this same line
        int[] d = new int[]{5, 2, 3, 3, 13, 24}; // better - more general

        for (int i = 0; i < c.length; i++) { // String.length() vs. array.length
            System.out.print(c[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < d.length; i++) { // String.length() vs. array.length
            System.out.print(d[i] + " ");
        }
        System.out.println();

        
        // Writing method of arrays

        // Test sumAll
        System.out.println("------ Test sumAll ------");
        System.out.println("Sum: " + sumAll(a)); // 7+3+15+9=34
        System.out.println("Sum: " + sumAll(b)); // 0 - empty array

        // Test arrayToString
        System.out.println("------ Test arrayToString ------");
        System.out.println("a: " + arrayToString(a)); // [7, 3, 15, 9]
        System.out.println("b: " + arrayToString(b)); // []
        System.out.println(arrayToString(new int[]{10, 9, 8})); // [10, 9, 8]
        // System.out.println(arrayToString({4, 9, 8}); // ERROR: the input is not an array
        System.out.println("------ Test arrayToString2 ------");
        System.out.println("a: " + arrayToString2(a)); // [7, 3, 15, 9]
        System.out.println("b: " + arrayToString2(b)); // []
        System.out.println("------ Test arrayToString3 ------");
        System.out.println("a: " + arrayToString3(a)); // [7, 3, 15, 9]
        System.out.println("b: " + arrayToString3(b)); // []

        // Test minValue
        System.out.println("------ Test minValue ------");
        System.out.println("Min of a: " + minValue(a)); // 3
        System.out.println("Min of d: " + minValue(d)); // 2
        System.out.println("Min of [10, 9, 8]: " + minValue(new int[]{10, 9, 8})); // 8

        // Test minIndex
        System.out.println("------ Test minIndex ------");
        System.out.println("Index of min of a: " + minIndex(a)); // 1
        System.out.println("Index of min of d: " + minIndex(d)); // 1
        System.out.println("Index of min of [10, 9, 8]: " + minIndex(new int[]{10, 9, 8})); // 2
        System.out.println("Index of min of [5, 4, 7, 4, 6]: " + minIndex(new int[]{5, 4, 7, 4, 6})); // 1 - since we used < in our code, we will get the first index for the minimum index. 
        // If we want to get the other 4, we simply need to change our code from < to <=.
        // If we want to return both the 4s, we need to change our method to return an array of indeces. 
    }

    // calculate the sum of all elements in array x
    public static int sumAll(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }

    // return a string representation of an array such as [a[0], a[1], ..., a[n-1]]
    // make sure the method doesn't crash if the array is empty (zero elements)
    public static String arrayToString(int[] x) {
        String result = "[";
        for (int i = 0; i < x.length - 1; i++) {
            result += x[i] + ", ";
        }
        if (x.length != 0) {
            result += x[x.length - 1];
        }
        result += "]";
        return result;
    }

    // alternative solution
    public static String arrayToString2(int[] x) {
        String result = "[";
        if (x.length != 0) {
            result += + x[0];
        } 
        for (int i = 1; i < x.length; i++) {
            result += ", " + x[i];
        }
        result += "]";
        return result;
    }

    // alternative solution
    public static String arrayToString3(int[] x) {
        String result = "[";
        for (int i = 0; i < x.length; i++) {
            result += x[i];
            if (i != x.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    // find the minimum element in array x, assuming x is not empty
    public static int minValue(int[] x) {
        int result = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < result) {
                result = x[i];
            }
        }
        return result;
    }

    // find the INDEX of the minimum element in array x, assuming x is not empty
    public static int minIndex(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < x[result]) {
                result = i;
            }
        }
        return result;
    }
}
