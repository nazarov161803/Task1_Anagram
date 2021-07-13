package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.foxminded.anagram.logic.AnagramMaker;

public class AnagramTest {

    AnagramMaker anagramMaker = new AnagramMaker();

    @Test
    public void shouldReturnIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            anagramMaker.getAnagram(null);
        });
    }

    @Test
    public void shouldReturnEmpty() {
        String expected = "";
        String actual = anagramMaker.getAnagram("");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSpace() {
        String expected = " ";
        String actual = anagramMaker.getAnagram(" ");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTwoSpace() {
        String expected = "  ";
        String actual = anagramMaker.getAnagram("  ");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDigitsWithSameOrder() {
        String expected = "45689";
        String actual = anagramMaker.getAnagram("45689");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneWordOnlySymbols() {
        String expected = "5&__0{}";
        String actual = anagramMaker.getAnagram("5&__0{}");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTwoWordsOnlySymbols() {
        String expected = "5&__0{} -^*()";
        String actual = anagramMaker.getAnagram("5&__0{} -^*()");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBackwardOneWordOnlyLetters() {
        String expected = "qwerty";
        String actual = anagramMaker.getAnagram("ytrewq");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBackwardOneWordsLettersAndSymbol() {
        String expected = "q!wer1ty";
        String actual = anagramMaker.getAnagram("y!tre1wq");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBackwardTwoWordsOnlyLetters() {
        String expected = "qwerty asdfg";
        String actual = anagramMaker.getAnagram("ytrewq gfdsa");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBackwardTwoWordsOnlyLettersAndTwoSpace() {
        String expected = "qwerty  asdfg";
        String actual = anagramMaker.getAnagram("ytrewq  gfdsa");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTwoWordsBackwardLettersAndSymbols() {
        String expected = "qwe3rty @asdfg";
        String actual = anagramMaker.getAnagram("ytr3ewq @gfdsa");
        assertEquals(expected, actual);
    }
}
