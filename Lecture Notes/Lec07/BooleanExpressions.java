public class BooleanExpressions {
    
    public static void main(String[] args) {
        // Boolean values
        System.out.println("------ Boolean Values Test ------");
        System.out.println(true);
        System.out.println(false);
        System.out.println("true"); // this is a string, not a Boolean value

        // Boolean expressions:
        // Expressions that evaluate to a boolean value
        System.out.println("------ Boolean Expressions Test ------");
        System.out.println(5 < 2); // false
        System.out.println(2 < 5); // true
        // System.out.println(5 = 2); // ERROR! 
        System.out.println(5 == 2); // false
        System.out.println(5 == 5); // true
        // WARNING: do not use == to compare two strings

        // We can store boolean values into variables
        System.out.println("------ Boolean Variables Test ------");
        Boolean x = true;
        Boolean y = 5 < 2;
        System.out.println(x); // true
        System.out.println(y); // false

        // Relational (comparison) Operators
        // < less than
        // > greater than
        // <= less or equal
        // >= greater or equal
        // == equals
        // != not equal

        // Boolean (logical) Operators
        // && and
        // || or
        //! not

        System.out.println("------ Boolean Operators Test ------");
        System.out.println(!true); // false
        System.out.println(!false); // true
        // && requires both conditions to be satisfied
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        // || requires either condition to be satisfied
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
    }
}
