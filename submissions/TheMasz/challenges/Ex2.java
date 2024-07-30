package challenges;

import java.util.HashSet;

public class Ex2 {
    private String paragraph;

    public Ex2(String paragraph) {
        this.paragraph = paragraph;
    }

    private boolean isPangram() {
        String lowerString = paragraph.toLowerCase();
        HashSet<Character> letters = new HashSet<>();
        for (char c : lowerString.toCharArray()) {
            if (Character.isLetter((c))) {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }

    private String result() {
        if (isPangram()) {
            String[] arr = paragraph.split(" ");
            String longestWord = "";
            for (String word : arr) {
                if (word.length() >= longestWord.length()) {
                    longestWord = word;
                }
            }
            return longestWord;
        } else {
            return "Not a Pangram";
        }
    }

    @Override
    public String toString() {
        return "output: " + result();
    }

}
