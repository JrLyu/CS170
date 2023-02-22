public class WordCount {
    
    public static void main(String[] args) {
        System.out.println(wordCount("This is a test")); // 4
        System.out.println(wordCount("This   is   a   test!")); // 4
        System.out.println(wordCount("")); // 0
        System.out.println(wordCount("Wahoo42!??!?!")); //1
    }

    public static int wordCount(String s) {
        int result = 0;
        if (s.length() != 0) {
            for (int i = 0; i < s.length(); i++) { // count the number of spaces with the next character is not a space
                if (s.charAt(i) == 32 && s.charAt(i + 1) != 32) {
                    result += 1;
                }
            }
            result += 1;
        } else {
            result = 0;
        }
        return result;
    }
}
