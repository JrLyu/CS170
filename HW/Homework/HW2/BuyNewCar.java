public class BuyNewCar {

    // Problem:
    // Car A costs $20,000, whereas car B costs $30,000.
    // Car A runs 25 miles with a gallon of gas, whereas car B runs 32 miles with a gallon of gas.
    // Will drive about 15,000 miles each year, and that gas price is going to be around $2.50 per gallon for the foreseeable future. 
    // The maintenance cost of car A is $1,300 in the first year, then that cost increases 15% (with compound growth) each year. 
    // The maintenance cost of car B is $1,000 in the first year, then that cost increases 10% (with compound growth) each year.
    
    public static void main(String[] args) {
        // Test code for Task 1
        System.out.println(compareCars(2)); // "Car A"
        System.out.println(compareCars(5)); // "Car A"
        System.out.println(compareCars(9)); // "Car B"
        System.out.println(compareCars(10)); // "Car B"

        /* Task 2: 
         * If I plan to take it for more than 5 years, Car A is still my ideal option.
         * If I plan to take it for 10 years, Car B becomes my ideal option.
         * Car A is more ideal if I only play to keep the car for a short term.
         * However, Car B becomes more ideal as the time interval of keeping becomes loner.
         * Though the fixed cost of Car A is lower than Car B, the variable cost of Car A is higher than Car B.
         * Hence, in the long term, Car B, with the lower variable cost, will be more desirable. 
        */
        
        /* Task 3:
         * Return in a method "gives" the method the returned value if we call it in our main method.
         * If we do nothing to the returned value, the value of it will not be printed.
         * However, printing a value in a method will print the value in the terminal, regarless how we call the method.
         * Hence, if we print something in a method, that thing will be printed in the terminal for sure.
         * On the other hand, if we return a value in the method, that value will not be printed unless we call the method in side System.out.println().
         */
    }

    // Task 1: takes input years, compare which car to buy
    public static String compareCars(int years) {
        // Initialize the variables
        int costA = 20000;
        int costB = 30000;
        double maintenanceA = 1300;
        double maintenanceB = 1000;
        double gasA = 15000 / 25.0 * 2.5; // the gas fee is fixed very year
        double gasB = 15000 / 32.0 * 2.5;
        String result;

        // Print the header
        System.out.println("Year\tCar A\tCar B");
        System.out.println(0 + "\t" + costA + "\t" + costB);
        
        // The for loop
        for (int i = 1; i <= years; i++) {
            // the cost, round to nearest dollar
            costA = (int)(Math.round(costA + gasA + maintenanceA));
            costB = (int)(Math.round(costB + gasB + maintenanceB));
            
            // Update maintenance fee for the next year
            maintenanceA *= 1.15;
            maintenanceB *= 1.1;

            // the content of the table
            System.out.println(i + "\t" + costA + "\t" + costB);
        }
        // compare and give a result
        if (costA < costB) {
            result = "Car A";
        } else {
            result = "Car B";
        }
        return result;
    }
}
