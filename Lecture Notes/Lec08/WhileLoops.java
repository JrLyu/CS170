public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("------ Test manyHellos ------");
        manyHellos(3);

        System.out.println("------ Test sumN ------");
        System.out.println(sumN(4)); // 10
        System.out.println(sumN(5)); // 15

        System.out.println("------ Test sumN_v2 ------");
        System.out.println(sumN_v2(4)); // 10
        System.out.println(sumN_v2(5)); // 15

        System.out.println("------ Test yearsToTarget ------");
        System.out.println(yearsToTarget(1000, 0.05, 2000)); // 15

        System.out.println("------ Test breakEvenQuantity ------");
        System.out.println(breakEvenQuantity(1, 0.5, 1000)); // 2000
        System.out.println(breakEvenQuantity(1, 0.7, 1000)); // more than 2000
        System.out.println(breakEvenQuantity(1, 1.5, 1000)); // INFINITE LOOP: Press CTRL+C to stop
    }

    // Example 1: simple repetition
    public static void manyHellos(int n) {
        int i = n; // initialitation
        while (i > 0) {
            // loop body
            System.out.println("Hello " + i);
            i--; // equivalent to i = i - 1 or i -= 1
        }
        System.out.println("Goodbye");
    }

    // Example 2: Accumulation
    // Problem: Sum up the first n integers (including n) using a while loop
    public static int sumN(int n) {
        int result = 0;
        int i = 1;
        while (i <= n) {
            result += i;
            i++;
        } // the variable i does not disappear here because we declared the value i before the while loop.
        // Using the for loop method, the variable i will disappear after the loop is completed. 
        return result;
    }

    // Another strategy
    public static int sumN_v2(int n) {
        int result = 0;
        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

    // Example 3: Compound interest
    // Problem: Given an initial amount of money and a fixed (compound) interest rate.
    // How many years will it take to reach a certain final amount?
    public static int yearsToTarget(double initMoney, double interestRate, double targetMoney) {
        int year = 0;
        double money = initMoney;

        System.out.println("Year\tMoney"); // header - \t is a tab
        System.out.println(year + "\t" + money);

        while (money < targetMoney) {
            year ++;
            money *= (1 + interestRate);
            System.out.println(year + "\t" + Math.round(money * 100) / 100.0);
        } // if it was simple interest: money += initMoney * interestRate
        return year;
    }
    // NOTE: we can solve example 3 with a FOR loop, but it is less intuitive:
    // for (double money = initMoney; money < targetMoney; money *= 1 + interestRate) {}


    // Example 4: Buy or Make?
    // Problem: You own a factory. You need to decide whether it's cheaper to buy a certain product 
    // from an external supplier, or make it in your factory. If you buy it, the product costs p money 
    // per unit of product. If you make it, the product costs c per unit (with c smaller than p), 
    // plus a fixed initial amount k to purchase and set up the production machine. Can you calculate 
    // the break even quantity, i.e., the minimum quantity for which making the product is the same 
    // or cheaper than buying it?
    public static int breakEvenQuantity(double p, double c, double k) {
        int quantity = 0;
        double costBuy = 0;
        double costMake = k;

        while (costBuy < costMake) {
            quantity++;
            costBuy += p;
            costMake += c;
            // To avoid an infinite loop:
            if (quantity > Math.pow(10,7)) {
                System.out.println("Warning: you might have an Infinite Loop.\nBreak the loop automatically.");
                break;
            }
        }
        return quantity;
    }
}
