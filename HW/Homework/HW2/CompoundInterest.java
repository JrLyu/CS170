public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println(compoundInterest(1000, 0.05, 3)); // 1157.625
        System.out.println(compoundInterest(0, 0.05, 3)); // 0.0
        System.out.println(compoundInterest(1000, 0, 3)); // 0.0
        System.out.println(compoundInterest(1000, 0.05, 0)); // 1000.0
    }

    // the method compoundInterest takes double moeny, double interestRate, and integer years.
    // it returns the total amount of money after compounding interest for the specified years
    public static double compoundInterest(double money, double interestRate, int years) {
        double totalMoney = money; // initialize result
        for (int i = 0; i < years; i++) { // instead of using Math.pow(), use a for loop as required. 
            totalMoney *= 1 + interestRate;
        }
        return totalMoney; //return value
    }
}
