public class ArrayExercise {
    public static void main(String[] args) {
        int[] t = new int[10]; // array with 10 slots
        t[0] = 5;
        t[1] = 3;
        t[2] = 7;
        t[3] = 9;
        System.out.println(arrayToString(t, 4));
        int[] t2 = new int[]{5,3,7,9};
        System.out.println(arrayToString(t2, t2.length));

        // test insert
        System.out.println("------ Test insert ------");
        System.out.println("Before insert: " + arrayToString(t, 4)); // [5, 3, 7, 9]
        insert(t, 4, 10, 2);
        System.out.println("After insert: " + arrayToString(t, 5)); // [5, 3, 10, 7, 9]

        // test remove
        System.out.println("------ Test remove ------");
        System.out.println("Before remove: " + arrayToString(t, 5)); // [5, 3, 10, 7, 9]
        int q = remove(t, 5, 1);
        System.out.println("After remove: "); 
        System.out.println("q: " + q + "; t: " + arrayToString(t, 4));// 3; [5, 10, 7, 9]

    }

    /**
     * Returns a string repreentation of an array of integers in the following
     * format: [a0, a1, a2, ... an-1]
     * 
     * @param a an array of integers
     * @param n the number of elements in a (n <= a.length)
     */
    public static String arrayToString(int[] a, int n) {
        String result = "[";
        for (int i = 0; i < n - 1; i++) {
            result = result + a[i] + ", ";
        }
        if (n > 0) {
            result = result +a[n-1];
        }
        result += "]";
        return result;
    }

    /**
     * Inserts an interger x into position ps in a given array.
     * All the original elements after pos are shifted forward.
     * Assume that there is enough free space in the array to 
     * insert the new element.
     * 
     * @param a an array of integers
     * @param n number of elements in a
     * @param x element to be inserted
     * @param pos index at which x should be inserted
     */
    public static void insert(int[] a, int n, int x, int pos) {
        for (int i = n - 1; i >= pos; i--) {
            a[i + 1] = a[i];
        }
        a[pos] = x;
    }

    /**
     * Remove the element at index pos from a given array.
     * All the element after pos are shifted backward.
     * 
     * @param a an array of integers
     * @param n number of elements in a
     * @param pos index of the element to be removed
     * @return the element that was removed
     */
    public static int remove(int[]a, int n, int pos) {
        int result = a[pos];
        for (int i = pos + 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        return result;
    }
}
