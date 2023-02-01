public class Types {

    public static void main(String[] args) { 
        System.out.println(90);
        System.out.println(0);
        System.out.println(-5);
        System.out.println(5.2);
        System.out.println(1.0);
        System.out.println(-2.5);
        System.out.println(Math.PI);
        System.out.println("hello");
        System.out.println("Hey you");
        System.out.println("");
        System.out.println("5"); 
        System.out.println("hello \"stranger\"!!!");
        // System.out.println("hello "stranger"!!!"); // ERROR
        System.out.println(1 + 2); // 3 (int)
        System.out.println(1.2 + 2.3); // 3.5 (double)
        System.out.println(1 + 2.3); // 3.3 (double)
        System.out.println(1.0 + 2); // 3.0 (double)
        System.out.println(1 - 2); // -1 (int)
        System.out.println(2.5 - 1); // 1.5 (double)
        System.out.println(2 * 3); // 6 (int)
        System.out.println(2 * 3.5); // 7.0 (double)
        System.out.println(3 / 2); // 1 (int)
        System.out.println(5 / 2); // 2 (int)
        System.out.println(5 / 3); // 1 (int)
        System.out.println(5.0 + 2.0); // 2.5 (double)
        System.out.println(5.0 / 2); // 2.5 (double)
        System.out.println(5 / 2.0); // 2.5 (double)
        System.out.println(360.0 / 7);
        System.out.println(360 / 7); 
        System.out.println(7 % 2); // 1
        System.out.println(7 % 3); // 1
        System.out.println(0 % 4); // 0
        System.out.println(1 % 4); // 1
        System.out.println(2 % 4); // 2
        System.out.println(3 % 4); // 3
        System.out.println(4 % 4); // 0
        System.out.println("hello" + "everyone"); // "helloeveryone"
        System.out.println("hey" + " you"); // "hey you"
        System.out.println("hello" + "" + "everyone"); // "hello everyone"
        System.out.println("hello" + "5"); // "hello5"
        System.out.println("hello" + 5); // "hello5"
        System.out.println(1 + "2"); // "12"
        System.out.println(1 + 2 + "3"); // "33"
        System.out.println("1" + 2 + 3); // "123"
        System.out.println("1" + (2 + 3)); // "15"
        System.out.println("hello".length()); // 5
        System.out.println("".length()); // 0
        System.out.println("hey you".length()); // 7
        System.out.println("hey \"you\"".length()); // 9
        System.out.println(1.0 * 5); // 5.0
        System.out.println(0.0 + 5); // 5.0
        System.out.println((double)5); // 5.0
        System.out.println((int)5.0); // 5 (int)
        System.out.println((int)5.7); // 5 (int)
        System.out.println((int)Math.PI); // 3
        System.out.println("" + 5); // "5"
        // System.out.println((String)5); // ERROR
        System.out.println("" + Math.PI); // "3.14159..."
        System.out.println("" + "Math.PI"); // "Math.PI"
        Integer.parseInt("String");
        System.out.println(Integer.parseInt("5")); // 5 (int)
        System.out.println(Integer.parseInt("5") + 2); // 7 (int)
        System.out.println(Integer.parseInt("5" + 2)); // 52 (int)
        // System.out.println(Integer.parseInt("hello5")); // ERROR
        System.out.println(Double.parseDouble("5.7")); // 5.7 (double)
        System.out.println(Double.parseDouble("5")); // 5.0 (double)
        // System.out.println(Double.parseDouble(Math.PI)); // ERROR
        // System.out.println(Double.parseDouble("Math.PI")); // ERROR
        System.out.println(1 + 2 * 3); // 7
        System.out.println((1 + 2) * 3); // 9
        System.out.println(1 + 2 + "3"); // "33"
        System.out.println(1 + (2 + "3")); // "123"
    }
}
