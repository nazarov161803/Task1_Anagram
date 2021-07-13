package com.foxminded.anagram.logic;

public class AnagramMaker {

    private static final String SEPARATOR = " ";

    public String getAnagram(String text) {

        StringBuilder result = new StringBuilder();

        if (text == null) {
            throw new IllegalArgumentException("Null is not applicable value");
        }

        if (text.trim().isEmpty())
            return text;
        else {

            String[] words = text.split(SEPARATOR);

            for (String word : words) {
                String anagram = getAnagramFromWord(word);
                result.append(anagram);
                result.append(SEPARATOR);
            }
            result.deleteCharAt(result.length() - 1);

            return result.toString();

        }
    }

    public static String getAnagramFromWord(String word) {
        char[] chars = word.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char letter : chars) {
            if (Character.isLetter(letter)) {
                result.append(letter);
            }
        }

        result.reverse();

        for (int i = 0; i < word.length(); i++) {
            char symbol = chars[i];
            if (!Character.isLetter(symbol)) {
                result.insert(i, symbol);
            }
        }

        return result.toString();
    }
}
