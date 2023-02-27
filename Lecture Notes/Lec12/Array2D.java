public class Array2D {
    public static void main(String[] args) {
        // 2D array
        int[][] x = new int[2][3]; // matrix with 2 rows and 3 columns
        x[0][0] = 100; // assign 100 to the element at row 0 and col 0

        double[][] y = new double[2][3];
        y[0][0] = 10;
        y[0][1] = 20;
        y[0][2] = 30;
        y[1][0] = 40;
        y[1][1] = 50;
        y[1][2] = 60;

        System.out.println(y); // does NOT print the content of the 2D array
        System.out.println(matrixToString(y, 2, 3));
        // y.length: number of rows
        // y[0].length: number of columns

        double[][] w = new double[][]{{15, 25, 35}, {45, 55, 65}};
        System.out.println(matrixToString(w, w.length, w[0].length));
    }

    /**
     * Returns a string reprensentation of a 2D array of doubles in the format: 
     * [
     *  [ x[0][0], x[0][1], ..., x[0][m-1] ]
     *  [ x[1][0], x[0][1], ..., x[0][m-1] ]
     *  [ ...          ...          ...    ]
     *  [ x[n-1][0], x[n-1][1], ..., x[n-1][m-1] ]
     * ]
     * 
     * @param x a matrix (2D array) of doubles
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(double[][] x, int n, int m) {
        String result = "[\n";
        for (int row = 0; row < n; row++) {
            result += "  [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
            }

            result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }
}
