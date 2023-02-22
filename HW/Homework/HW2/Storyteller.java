public class Storyteller {
    
    public static void main(String[] args) {
        System.out.println("------ Story 1 ------");
        System.out.println(storyteller("Alice", "Betsy", "dresses", 10, "rugs", "unhappy", "friends")); // this will return the same example as in the homework description
        // use String1.compareTo(String2) to show that the two stories are exatactly the same (output = 0)
        System.out.println(storyteller("Alice", "Betsy", "dresses", 10, "rugs", "unhappy", "friends").compareTo("Alice was a beautiful princess. Betsy was a wicked witch. Alice had 10 expensive dresses, whereas Betsy had only 5. Because of envy, Betsy cast a spell on Alice, yelling these arcane magical words: \"Eaaa yeeb siid! EAAA YEEB SIID!\". Suddenly, Alice\'s 10 dresses turned into rugs. Alice became very unhappy. Seeing that Alice was unhappy, Betsy realized she was wrong, and reversed the spell. Alice and Betsy became friends, and they lived happily ever after."));

        // write another interesting story
        System.out.println("\n------ Story 2 ------");
        System.out.println(storyteller("Richael", "Christina", "Laptops", 5, "iron", "mad", "lovers"));
    }

    // this method takes seven inputs: name of the first girl, name of the second girl, 
    // cause of envy, quantity of the cause, action the second girl take, feeling of the first girl, and the result
    // the outpout of this method is a story paragraph including a megic sentence
    public static String storyteller(String g1, String g2, String envy, int quantity, 
                                     String action, String feeling, String result) {
        String story = "";
        // Construction of the magic sentence
        String magicSentence = "";
        magicSentence += g1.substring(g1.length() - 1).toUpperCase() + "aa" + g1.substring(0, 1).toLowerCase() + " ";
        magicSentence += g2.substring(g2.length() - 1).toLowerCase() + "ee" + g2.substring(0, 1).toLowerCase() + " ";
        magicSentence += envy.substring(envy.length() - 1).toLowerCase() + "ii" + envy.substring(0, 1).toLowerCase() + "!"; 
        magicSentence += " " + magicSentence.toUpperCase();                      

        // Construction of the story
        story += g1 + " was a beautiful princess. ";
        story += g2 + " was a wicked witch. ";
        story += g1 + " had " + quantity + " expensive " + envy + ", whereas " + g2 + " had only " + (int)(0.5 * quantity) + ". ";
        story += "Because of envy, " + g2 + " cast a spell on " + g1 +", yelling these arcane magical words: \"" + magicSentence + "\". ";
        story += "Suddenly, " + g1 + "\'s " + quantity + " " + envy + " turned into " + action + ". ";
        story += g1 + " became very " + feeling + ". ";
        story += "Seeing that " + g1 + " was " + feeling + ", " + g2 + " realized she was wrong, and reversed the spell. ";
        story += g1 + " and " + g2 + " became " + result + ", and they lived happily ever after.";
        return story;
    }
}
