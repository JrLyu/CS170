public class LetterCount {

    public static void main(String[] args) {
        System.out.println(letterCount("abc-123-abc-ABC", "b")); // 2 
        System.out.println(letterCount("This is interesting!", "z")); // 0 
        System.out.println(letterCount("", "q")); // 0
        System.out.println(letterCount("America", "A")); // 1
    }

    // this method takes two Strings s and c.
    // it returns how many times c is appeared in s.
    public static int letterCount(String s, String c) { 
        // because upper cases and lower cases are treated differently, we do not need to conver s into all lower or all upper cases
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c.charAt(0)) { // compare if the char of s at index i is the same as c
                result += 1; // if they are the same, add 1 to result. 
            }
        }
        return result;
    }
}
