public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("Hello")); // 2
        System.out.println(countVowels("Hey")); // 1
        System.out.println(countVowels("PPL")); // 0
        System.out.println(countVowels("examination")); // 6
    }

    // the method takes a String s and return the number of vowels init.
    // Vowels: A, E, I , O, U, both upper and lower cases
    public static int countVowels(String s) {
        int result = 0;
        s = s.toLowerCase(); // turn s for easier comparison
        for (int i = 0; i < s.length(); i++) { // loop over all the chars in s
            if (s.charAt(i) == 97 || s.charAt(i) == 101 || 
                s.charAt(i) == 105 || s.charAt(i) == 111|| 
                s.charAt(i) == 117) { // based on ASCII Table
                    result += 1;
                }
        }
        return result;
    }
}
