public class Conditionals {
    
    public static void main(String[] args) {
        System.out.println("------ Test smallerNumber ------");
        System.out.println(smallerNumber(5, 2)); // 2.0
        System.out.println(smallerNumber(2, 5)); // 2.0
        System.out.println(smallerNumber(5, 5)); // 5.0

        System.out.println("------ Test longerString -----");
        System.out.println(longerString("economics", "mathematics")); // "mathematics"
        System.out.println(longerString("mathematics", "economics")); // "mathematics"
        System.out.println(longerString("aaa", "bbb")); // "bbb"
        System.out.println(longerString("bbb", "aaa")); // "aaa"

        System.out.println("------ Test stateOfWater -----");
        System.out.println(stateOfWater(-10)); // "solid"
        System.out.println(stateOfWater(0)); // "liquid" (edge case)
        System.out.println(stateOfWater(30)); // "liquid"
        System.out.println(stateOfWater(100)); // "liquid" (edge case)
        System.out.println(stateOfWater(150)); // "gas"

        System.out.println("------ Test letterGrade -----");
        System.out.println(letterGrade(1000)); // "A"
        System.out.println(letterGrade(900)); // "A" (edge case)
        System.out.println(letterGrade(850)); // "B"
        System.out.println(letterGrade(800)); // "B" (edge case)
        System.out.println(letterGrade(750)); // "C"
        System.out.println(letterGrade(700)); // "C" (edge case)
        System.out.println(letterGrade(650)); // "D"
        System.out.println(letterGrade(600)); // "D" (edge case)
        System.out.println(letterGrade(550)); // "F"
        System.out.println(letterGrade(500)); // "F" (edge case)
        System.out.println(letterGrade(0)); // "F"

        System.out.println("------ Test wrongLetterGrade -----");
        System.out.println(wrongLetterGrade(1000)); // "D"
        System.out.println(wrongLetterGrade(900)); // "D" (edge case)
        System.out.println(wrongLetterGrade(850)); // "D"
        System.out.println(wrongLetterGrade(800)); // "D" (edge case)
        System.out.println(wrongLetterGrade(750)); // "D"
        System.out.println(wrongLetterGrade(700)); // "D" (edge case)
        System.out.println(wrongLetterGrade(650)); // "D"
        System.out.println(wrongLetterGrade(600)); // "D" (edge case)
        System.out.println(wrongLetterGrade(550)); // "F"
        System.out.println(wrongLetterGrade(500)); // "F" (edge case)
        System.out.println(wrongLetterGrade(0)); // "F"
    }

    // smallestNumber returns the smaller of two numbers
    public static double smallerNumber(double x, double y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    // longerString returns the longer of two strings
    public static String longerString(String s1, String s2) {
        if (s1.length() > s2.length()) { // If we change < to <=, then the first one will be returned
            return s1;
        } else {
            return s2; // If two strings have the same length, the later one will be returned
        }
    }

    /* Write a method named stateOfWater(double temp)
     * that takes a number temp representing a temperature
     * in degrees Celsius. The method returns the physical
     * statement of water at that temperature:
     * "solid" if the temperature is below 0
     * "liquid" if the temperature is between 0 and 100 (extremes included)
     * "gas" if the temperature is above 100
     */
    public static String stateOfWater(double temp) {
        String state; // to avoid too many returns, we can introduce a variable here.
        if (temp < 0) {
            state = "solid";
        } else if (temp > 100) {
            state = "gas";
        } else {
            state = "liquid";
        }
        return state;
    }
    /* or we can use 
        String state;
        if (temp < 0) {
            state = "solid";
        } else if (temp <= 100) { // whenever we can simply a logical expression, try to do so. 
            state = "liquid";
        } else {
            state = "gas";
        }
        return state;
     */

     // Return a letter grade given the number of points
    public static String letterGrade(int points) {
        String letter;
        if (points >= 900) {
            letter = "A";
        } else if (points >= 800) {
            letter = "B";
        } else if (points >= 700) {
            letter = "C";
        } else if (points >= 600) {
            letter = "D";
        } else {
            letter = "F";
        }
        return letter;
    }

    // This is a wrong version of the code to return letter grade
    public static String wrongLetterGrade(int points) {
        String letter;
        if (points >= 900) {
            letter = "A";
        } if (points >= 800) {
            letter = "B";
        } if (points >= 700) {
            letter = "C";
        } if (points >= 600) {
            letter = "D"; // This code will keep returning "D" as long as points >= 600 because java will keep reassigning variables
        } else {
            letter = "F";
        }
        return letter;
    }
}
